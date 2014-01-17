<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table cellspacing="5" cellpadding="5" border="0" width=60%>
    <tr>
        <td width="100%">
			<b>Weblogic "MercuryTargetQ" is : &nbsp;${jmsStatus}</b>
		</td>
    </tr>
    <tr>
        <td width="100%">
			<b>SOA Interface database is : &nbsp; ${soaInterfaceDbStatus}</b>
		</td>
    </tr>
    <tr>
        <td width="100%">
            <table border=1 cellpadding="2" cellspacing="2">
                <tr>
                    <td>
                        <span style="font-size:large;">
                            Enterprise Services
                        </span>
                    </td>
                    <td>
                        <span style="font-size:large;">
                            Status
                        </span>
                    </td>
                    <td>
                        <span style="font-size:large;">
                            Entity Count
                        </span>
                    </td>
                    <td>
                        <span style="font-size:large;">
                            Info
                        </span>
                    </td>
                </tr>
                <tr>
                <td colspan="4">
                	<c:forEach var="service" items="${enterpriseServiceStatus}">
                    	<br>
                        	${service.key}: &nbsp; ${service.value.connectionStatus}
                        	&nbsp; ${service.value.count}&nbsp;
                        	&nbsp; ${service.value.comment} <br>
                	</c:forEach>
                </td>
                </tr>
            </table>

        </td>
    </tr>
    <tr>
        <td width="100%">
		<span style="font-size:large;">
			Last successful outbound job runtime is :
		</span>
            <b>${lastSuccessfulJobRunTime}</b></td>
    </tr>
</table>