   <jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>

   <div id="centre">
      <jsp:directive.include file="/WEB-INF/jsp/menu.jsp"/>

      <div id="contenu">
         <h2>Présentation n° ${result.id}</h2>
         <h3>Ci-dessous, le résumé de la présentation :</h3>
            <div id="presentation_sujet">
               <div>
                  <div style="float: left; width: 80px">
                     <label for="_sujet">Sujet:</label>
                  </div>
                  <p style="width:300px;" id="_sujet" disabled="disabled">
                     ${result.sujet.titre}
                  </p>
               </div>
               <div>
                  <div style="float: left; width: 80px">
                     <label for="_sujet">Résumé:</label>
                  </div>
                  <textarea id="_resume" style="width:300px" rows="5" disabled="disabled">${result.sujet.resume}</textarea>
               </div>
               <div>
                  <div style="float: left; width: 80px">
                     <label for="_theme">Thème:</label>
                  </div>
                  <p style="width:300px;" id="_sujet" disabled="disabled">
                     ${result.sujet.theme}
                  </p>
               </div>
               <div>
                  <div style="float: left; width: 80px">
                     <label for="_format">Format:</label>
                  </div>
                  <p style="width:300px;" id="_sujet" disabled="disabled">
                     ${result.format}
                  </p>
               </div>
               <div>
                  <div style="float: left; width: 80px">
                     <label for="_audience">Audience:</label>
                  </div>
                  <p style="width:300px;" id="_sujet" disabled="disabled">
                     ${result.audience}
                  </p>
               </div>
               <div>
                  <div style="float: left; width: 80px">
                     <label for="_langue">Langue:</label>
                  </div>
                  <p style="width:300px;" id="_sujet" disabled="disabled">
                     ${result.langue}
                  </p>
               </div>
           </div>
      </div>
      <!-- #contenu -->
   </div>
   <!-- #centre -->

   <jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
