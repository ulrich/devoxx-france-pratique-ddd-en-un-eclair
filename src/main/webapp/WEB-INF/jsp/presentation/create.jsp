
<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<div>
	<h2>New Presentation</h2>
    <form:form action="/rest/presentation" method="POST" modelAttribute="entity">
    
        <div class="submit" id="presentation_submit">
            <input id="proceed" type="submit" value="Save"/>
        </div>
	        
    </form:form>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
	