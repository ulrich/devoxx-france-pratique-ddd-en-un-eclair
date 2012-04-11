
<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>

<div>
<a href="<c:url value="/rest/presentation/form" />">New Presentation</a>
</div>

<div>
    <c:if test="${not empty result}">
    <table>
    	<thead>
	    	<th>Id</th>
    		<th/>
    		<th/>
    	</thead>
    	<c:forEach items="${result}" var="each" >
    		<tr>
    			<td>
    				<a href="<c:url value="/rest/presentation/${each.id}" />">${each.id}</a>
    			</td>
    			<td>
    				<a href="<c:url value="/rest/presentation/${each.id}" />">Show</a>
                </td>
    			<td>
                    <form:form action="/rest/presentation/${each.id}" method="DELETE">
                    	<input id="delete" type="submit" value="Delete"/>
                    </form:form>
                </td>
    		</tr>
    	</c:forEach>
    </table>
    </c:if>
    <c:if test="${empty result}"><p>There are no Presentations yet.</p></c:if>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>

	