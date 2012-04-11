   <jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>

   <div id="centre">
      <jsp:directive.include file="/WEB-INF/jsp/menu.jsp"/>

      <div id="contenu">
         <h2>Chercher une présentation</h2>
         <h3>Veuillez saisir le terme recherché :</h3>

         <form  action="/rest/presentation/searchsujet" method="GET">
            <div id="presentation_sujet">
               <div>
                  <div style="float: left; width: 80px">
                     <label for="_sujet">Terme:</label>
                  </div>
                  <input style="width:200px" id="_sujet" name="terme" type="text"/>
               </div>
           </div>
           <div class="submit" id="presentation_submit">
               <input id="proceed" type="submit" value="Rechercher"/>
           </div>
         </form>
      </div>
      <!-- #contenu -->
   </div>
   <!-- #centre -->

   <jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
