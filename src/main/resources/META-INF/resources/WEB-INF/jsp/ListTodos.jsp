        <%@ include file="common/header.jspf" %>
		<%@ include file="common/navigation.jspf" %>
	<div class="container">
		<hr>
		<h1>Your Todos</h1>
		
		<table class="table">
		
		      <thead>
		               <tr>
							
							<th>Description</th>
							<th>Target Date</th>
							<th>Is Done?</th>
							<th>Delete</th>
							<th>Update</th>
						</tr>
	            </thead>
	            <tbody>		
						<c:forEach items="${todos}" var="todos">
							<tr>
								
								
								<td>${todos.description}</td>
								<td>${todos.targetDate}</td>
								<td>${todos.done}</td>
								<td><a href="delete-todo?id=${todos.id}" class="btn btn-warning">Delete</td>
								<td><a href="update-todo?id=${todos.id}" class="btn btn-success">Update</td>
								
								
							</tr>
						</c:forEach>
				</tbody>
		</table>
		<a href="add-todo" class="btn btn-success">Add Todo</a>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	
	</body>
</html>