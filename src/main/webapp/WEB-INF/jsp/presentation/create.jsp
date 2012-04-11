
<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<div>
	<h2>New Presentation</h2>
      <form:form action="/rest/presentation" method="POST" modelAttribute="entity">
         <div id="presentation_sujet">
            <div>
               <div style="float: left; width: 80px">
                  <label for="_sujet">sujet:</label>
               </div>
               <form:input cssStyle="width:300px" id="_sujet" path="sujet.titre"/>
            </div>
            <div>
               <div style="float: left; width: 80px">
                  <label for="_sujet">resume:</label>
               </div>
               <form:textarea id="_resume" path="sujet.resume" cssStyle="width:300px" rows="5"/>
            </div>
            <div>
               <div style="float: left; width: 80px">
                  <label for="_theme">theme:</label>
               </div>
               <form:select id="_theme" path="sujet.theme" cssStyle="width:300px" >
                  <form:options items="${themes}" />
               </form:select>
            </div>
            <div>
               <div style="float: left; width: 80px">
                  <label for="_format">format:</label>
               </div>
               <form:select id="_format" path="format" cssStyle="width:300px" >
                  <form:options items="${formats}" />
               </form:select>
            </div>
            <div>
               <div style="float: left; width: 80px">
                  <label for="_audience">audience:</label>
               </div>
               <form:select id="_audience" path="audience" cssStyle="width:300px" >
                  <form:options items="${audiences}" />
               </form:select>
            </div>
            <div>
               <div style="float: left; width: 80px">
                  <label for="_langue">langue:</label>
               </div>
               <form:select id="_langue" path="langue" cssStyle="width:300px" >
                  <form:options items="${langues}" />
               </form:select>
            </div>
            <br/>
            <form:errors cssClass="errors" id="_sujet" path="sujet.titre"/>
        </div>
        <div class="submit" id="presentation_submit">
            <input id="proceed" type="submit" value="Save"/>
        </div>
      </form:form>

</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
	