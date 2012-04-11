   <jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>

   <div id="centre">
      <jsp:directive.include file="/WEB-INF/jsp/menu.jsp"/>

      <div id="contenu">
         <h2>Toutes les présentations</h2>
         <h3>Ci-dessous figure une liste des présentations disponibles :</h3>
         <div>
            <c:if test="${not empty result}">
               <table>
                  <thead>
                     <th>Id</th>
                     <th>Sujet</th>
                     <th />
                     <th />
                  </thead>
                  <c:forEach items="${result}" var="each">
                     <tr>
                        <td><a href="<c:url value="/rest/presentation/${each.id}"/>">${each.id}</a>
                        </td>
                        <td>${each.sujet.titre}</td>
                        <td><a href="<c:url value="/rest/presentation/${each.id}" />">Voir</a>
                        </td>
                        <td>
                           <form:form action="/rest/presentation/${each.id}" method="DELETE">
                              <input id="delete" type="submit" value="Effacer" />
                           </form:form>
                        </td>
                     </tr>
                  </c:forEach>
               </table>
            </c:if>
            <c:if test="${empty result}">
               <p>Aucune présentation disponible.</p>
            </c:if>
         </div>
      </div>
      <!-- #contenu -->
   </div>
   <!-- #centre -->

   <jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
