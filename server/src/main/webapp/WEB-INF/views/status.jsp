<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>


<html>
    <head>
        <title>Status page</title>
    </head>
    <body>
        <h1>Mercury Application Status</h1>
        <br/>
        <br/>
        <%@ include file="includes/requestStatus.jsp"%>
        <br/>
        <%@ include file="includes/systemStatus.jsp"%>
        <br>
        <span style="font-size:smaller;">
            <c:out value="${requestTime}"/>
        </span>
    </body>
</html>
