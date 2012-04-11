   <jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>

   <div id="centre">
      <jsp:directive.include file="/WEB-INF/jsp/menu.jsp"/>

      <div id="contenu">
         <h2>Nouvelle présentation</h2>
         <h3>Veuillez remplir le formulaire suivant :</h3>

         <form:form action="/rest/presentation" method="POST" modelAttribute="entity">
            <div id="presentation_sujet">
               <div>
                  <div style="float: left; width: 80px">
                     <label for="_sujet">Sujet:</label>
                  </div>
                  <form:input cssStyle="width:300px" id="_sujet" path="sujet.titre"/>
               </div>
               <div>
                  <div style="float: left; width: 80px">
                     <label for="_sujet">Résumé:</label>
                  </div>
                  <form:textarea id="_resume" path="sujet.resume" cssStyle="width:300px" rows="5"/>
               </div>
               <div>
                  <div style="float: left; width: 80px">
                     <label for="_theme">Thème:</label>
                  </div>
                  <form:select id="_theme" path="sujet.theme" cssStyle="width:300px" >
                     <form:options items="${themes}" />
                  </form:select>
               </div>
               <div>
                  <div style="float: left; width: 80px">
                     <label for="_format">Format:</label>
                  </div>
                  <form:select id="_format" path="format" cssStyle="width:300px" >
                     <form:options items="${formats}" />
                  </form:select>
               </div>
               <div>
                  <div style="float: left; width: 80px">
                     <label for="_audience">Audience:</label>
                  </div>
                  <form:select id="_audience" path="audience" cssStyle="width:300px" >
                     <form:options items="${audiences}" />
                  </form:select>
               </div>
               <div>
                  <div style="float: left; width: 80px">
                     <label for="_langue">Langue:</label>
                  </div>
                  <form:select id="_langue" path="langue" cssStyle="width:300px" >
                     <form:options items="${langues}" />
                  </form:select>
               </div>
               <br/>
               <form:errors cssClass="errors" id="_sujet" path="sujet.titre"/>
           </div>
           <div class="submit" id="presentation_submit">
               <input id="proceed" type="submit" value="Enregistrer"/>
           </div>
         </form:form>
      </div>
      <!-- #contenu -->
   </div>
   <!-- #centre -->

   <jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
