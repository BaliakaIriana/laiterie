<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="panel-body1">

	<table class="table">
		<thead>
			<tr>
				<th>#</th>
				<th>Nom</th>
				<th>Email</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${ inscriptionList }">
			<tr>
				<th scope="row">${ item.getId() }</th>
				<td>${ item.getNom() }</td>
				<td>${ item.getEmail() }</td>
				<td><a href=<c:url value="/activate-account/"/><c:out value="${ item.getId() }" />>Valider</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>