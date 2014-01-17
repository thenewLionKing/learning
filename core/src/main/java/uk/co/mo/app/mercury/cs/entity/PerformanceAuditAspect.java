package uk.co.mo.app.mercury.cs.entity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.StopWatch;

@Aspect
public class PerformanceAuditAspect {
	private static Log LOG = LogFactory.getLog(PerformanceAuditAspect.class);

	@Around("execution(public * uk.co.mo.app.mercury.domain..service.*Impl.*(..))")
	public Object initiateTimings(ProceedingJoinPoint p) throws Throwable{
		StopWatch clock = new StopWatch("Profiling for " +p.getTarget().getClass());
	      try {
	         clock.start(p.toShortString());
	         return p.proceed();
	      } finally {
	         clock.stop();
//	         LOG.info(clock.prettyPrint());
	         LOG.info(clock.getLastTaskInfo().getTimeMillis()+","+clock.getLastTaskInfo().getTaskName());
	      }
    }
}
