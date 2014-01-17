<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table cellspacing="5" cellpadding="5" border="0" width=60%>
    <tr style="font-size:large;">
        <td>Active request count</td>
        <td>Status</td>
        <td>Long running request count</td>
    </tr>
    <tr>
        <td>
                <c:out value="${requestInfo.activeRequestsSize}"/>
        </td>

        <c:choose>
            <c:when test="${requestInfo.requestCountCritical}">
                    <c:set var="statusTxt" value="Critical"/>
                    <c:set var="statusColor" value="red"/>
            </c:when>
            <c:otherwise>
                    <c:set var="statusTxt" value="Normal"/>
                    <c:set var="statusColor" value="green"/>
            </c:otherwise>
        </c:choose>


        <td style="background-color:${statusColor};font-size:medium;" align="center">
            <span style="color:#ffd700">
                <c:out value="${statusTxt}"/>
            </span>
        </td>

        <c:choose>
            <c:when test="${requestInfo.longRequestCount > 0 and requestInfo.ratioExceeded}">
                    <c:set var="statusColor" value="red"/>
            </c:when>
            <c:otherwise>
                    <c:set var="statusColor" value="green"/>
            </c:otherwise>
        </c:choose>

        <td style="font-size:medium;" align="center">
            <span style="color:${statusColor};">
                <c:out value="${requestInfo.longRequestCount}"/>
            </span>
        </td>
    </tr>
</table>

<br>
<table width="1024px" cellspacing="2" cellpadding="2" border="0">
<tr>
        <th width="3%" align="left">#</th>
        <th width="3%" align="left">Duration</th>
        <th width="14%" align="left">Thread</th>
        <th width="10%" align="left">User</th>
        <th width="5%" align="left">Ip</th>
        <th width="5%" align="left">Method</th>
        <th width="40%" align="left">Request</th>
        <th width="20%" align="left">Session</th>
    </tr>
<tr>
<td colspan="8">
<table border="0" cellspacing="0" cellpadding="0" width="100%">
    <c:set var="count" value="1"/>
    <c:forEach var="x" items="${requestInfo.activeRequests}" >
        <c:choose>
            <c:when test="${count / 2 == 0}">
                <c:set var="color" value="#ffffff"/>
            </c:when>
            <c:otherwise>
                <c:set var="color" value="#d3d3d3"/>
            </c:otherwise>
        </c:choose>

        <c:set var="count" value="${count + 1}"/>

    <tr bgcolor="${color}">
        <td width="3%" align="left"><c:out value="${x.counter}"/></td>
        <td width="3%" align="left"><c:out value="${x.duration}"/></td>
        <td width="14%" align="left"><c:out value="${x.threadName}"/></td>
        <td width="10%" align="left"><c:out value="${x.user}"/></td>
        <td width="5%" align="left"><c:out value="${x.remoteHost}"/></td>
        <td width="5%" align="left"><c:out value="${x.method}"/></td>
        <td width="40%" align="left"><c:out value="${x.requestURL} ${x.queryString}"/></td>
        <td width="20%" align="left"><c:out value="${x.sessionId}"/></td>
    </tr>
</c:forEach>
</table>
</td>
</tr>
</table>
