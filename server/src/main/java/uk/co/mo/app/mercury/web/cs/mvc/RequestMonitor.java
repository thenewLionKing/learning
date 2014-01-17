package uk.co.mo.app.mercury.web.cs.mvc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.mo.app.mercury.web.cs.util.WebConfigUtil;
import uk.co.mo.app.mercury.cs.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <p/>
 * User: prabat
 * Date: 24-Feb-2011
 * Time: 12:52:44
 * <p/>
 * Change Log - Who : When : Comment
 */
@Component("requestMonitor")
public class RequestMonitor {

    private static Log LOG = LogFactory.getLog(RequestMonitor.class);

    private AtomicLong counter = new AtomicLong(0L);

    // store of active requests that have been filtered...
    private final AtomicReference<Set> activeRequests = new AtomicReference<Set>(new HashSet());

    @Autowired
    private WebConfigUtil configUtil;


    public long getNextCounter() {
         return counter.getAndIncrement();
    }

    /**
     * Public method to obtain a list of active requests
     * @return a list of active requests
     */
    public List getActiveRequests() {
        // clone the list to avoid threading issues...
        List<Set> list = new ArrayList<Set>();
        list.addAll(activeRequests.get());
        return list;
    }

    public int getActiveRequestsSize() {
        return getActiveRequests().size();
    }


    public List getSortedActiveRequests() {
        List requests = getActiveRequests();
        Collections.sort(requests, new Comparator() {
            public int compare(Object o1, Object o2) {
                long t1 = ((RequestInfo)o1).getTimeCalled();
                long t2 = ((RequestInfo)o2).getTimeCalled();
                if(t1<t2) return -1; else if(t1>t2) return 1; else return 0;
            }
        });
        return requests;
    }

    public void destroy() {
    }

    public class RequestInfo {
        private long timeCalled;
        private String remoteHost;
        private long counter;
        private String user;
        private String method;
        private String requestURL;
        private String queryString;
        private String sessionId;
        private String threadName;
        private Thread servletThread;

        public RequestInfo(HttpServletRequest httpRequest) {
            timeCalled = System.currentTimeMillis();
            // Form a unique reference for this request --- to match the '>>' line with the '<<' line
            counter = getNextCounter();
            requestURL = httpRequest.getRequestURL().toString();
            queryString = StringUtils.isEmpty(httpRequest.getQueryString()) ? "" : "?"+httpRequest.getQueryString();
            remoteHost = httpRequest.getRemoteAddr();
            user = httpRequest.getUserPrincipal() == null ? "" : httpRequest.getUserPrincipal().getName();
            sessionId = httpRequest.getRequestedSessionId();
            method = httpRequest.getMethod();
            servletThread = Thread.currentThread();
            setThreadName(Thread.currentThread().getName());
        }

        public String toString() {
            //JEL replaced expensive String concatenation with String Buffer
            StringBuffer buffer = new StringBuffer(50);
            buffer.append(timeCalled);
            buffer.append(",");
            buffer.append(counter);
            buffer.append(",");
            buffer.append(remoteHost);
            buffer.append(",");
            buffer.append(user);
            buffer.append(",");
            buffer.append(method);
            buffer.append(",");
            buffer.append(requestURL);
            buffer.append( ",");
            buffer.append(queryString);
            buffer.append(",");
            buffer.append(sessionId);
            buffer.append(",");
            buffer.append(getDuration());
            buffer.append(",");
            buffer.append(getThreadName());
            return buffer.toString();
        }

        public long getDuration() {
            return System.currentTimeMillis() - timeCalled;
        }

        public long getTimeCalled() {
            return timeCalled;
        }

        public void setTimeCalled(long timeCalled) {
            this.timeCalled = timeCalled;
        }

        public String getRemoteHost() {
            return remoteHost;
        }

        public void setRemoteHost(String remoteHost) {
            this.remoteHost = remoteHost;
        }

        public long getCounter() {
            return counter;
        }

        public void setCounter(long counter) {
            this.counter = counter;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public String getRequestURL() {
            return requestURL;
        }

        public void setRequestURL(String requestURL) {
            this.requestURL = requestURL;
        }

        public String getQueryString() {
            return queryString;
        }

        public void setQueryString(String queryString) {
            this.queryString = queryString;
        }

        public String getSessionId() {
            return sessionId;
        }

        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        public String getThreadName() {
            return threadName;
        }

        public void setThreadName(String threadName) {
            this.threadName = threadName;
        }

        public Thread getServletThread() {
            return servletThread;
        }
    }


    public int getLongRequestCount(){
    	RequestInfo info = null;
    	int counter = 0;
        for (Object o : activeRequests.get()) {
            info = (RequestInfo) o;
            if (info.getDuration() > configUtil.getRequestCountCriticalTimeLimit() * 1000) {
                counter++;
            }
        }
    	return counter;
    }

   /**
    *
    * @return the number of active requests.
    */
    public int getActiveRequestCount(){
    	return activeRequests.get().size();
    }

    /**
     * Checks the amount of current requests against the critical request count setting.
     *
     * @return true if getActiveRequestCount() > CRITICAL_REQUEST_COUNT
     */
    public boolean getRequestCountCritical(){
    	return (getActiveRequestCount() > configUtil.getRequestCountCritical());
    }

    /**
     * Checks the amount of current ;long running requests against the
     * long request count setting.
     *
     * @return true if getLongRequestCount()/getActiveRequestCount() > LONG_REQUEST_RATIO_PERCENT
     */
    public boolean getRatioExceeded(){
    	return (100*((double)getLongRequestCount()/(double)getActiveRequestCount())) > configUtil.getRequestCountCriticalRatioLongRunning();
    }

    RequestInfo addRequest(HttpServletRequest req) {
        if(LOG.isDebugEnabled()) {
            LOG.debug("Adding request into monitor...");
            LOG.debug(configUtil.toString());
        }

        RequestInfo info = new RequestInfo(req);
        synchronized (activeRequests) {
            activeRequests.get().add(info);
        }
        return info;
    }

    void removeRequest(RequestInfo info) {
        synchronized (activeRequests) {
            activeRequests.get().remove(info);
        }
    }

    void killHangingRequests() {
        synchronized (activeRequests) {
            for (Object o : activeRequests.get()) {
                RequestInfo info = (RequestInfo) o;
                if (info.getDuration() > configUtil.getRcCriticalLongRunningTimeout() * 1000) {
                    info.getServletThread().interrupt();
                    removeRequest(info);
                    LOG.info("Long running request stopped: " + info.toString());
                }
            }
        }
    }

    public int getLongRunningRequestThreshold() {
        return configUtil.getRcCriticalLongRunningThreshold();
    }

}
