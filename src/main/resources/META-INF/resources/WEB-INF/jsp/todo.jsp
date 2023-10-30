
	<%@ include file="common/header.jspf" %>
    <%@ include file="common/navigation.jspf" %>
	<div class="container">
		<hr>
		<h1>Enter Todo Details</h1>
	    <form:form method="post" modelAttribute="todo">
	    
		    <fieldset class="mb-3">
		        <form:label path="description">Description</form:label>
			    <form:input type="text" path="description" required="required"/>
		   	   
	        </fieldset> 
	       
	        <fieldset class="mb-3">
		        <form:label path="targetDate">TargetDate</form:label>
			    <form:input type="text" path="targetDate" required="required"/>

	        </fieldset>  
	         <form:input type="hidden" path="id"/>
		   	 <form:input type="hidden" path="done"/>
	                
	    <input type="submit" class="btn btn-success">
	    </form:form>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
	<script type="text/javascript">
	   $('#targetDate').datepicker({
	    format: 'yyyy-mm-dd'
	    });
	</script>
	</body>
</html>