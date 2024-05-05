<%@ page contentType="text/html" pageEncoding="UTF-8"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><%@ taglib
	prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Orders</title>
<style>
.form-control-error {
	border-color: #a94442;
	-webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075)
}

.form-control-error:focus {
	border-color: #843534;
	-webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075), 0 0 6px #ce8483;
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075), 0 0 6px #ce8483
}

.input-group-addon-error {
	color: #a94442;
	background-color: #f2dede;
	border-color: #a94442
}

.control-label-error {
	color: #a94442
}
</style>

</head>
<body>
	<div class="container">

		<%--  Login form here --%>
		<form action="<c:url value= "/j_spring_security_check"> </c:url>"
			method="post">
			<div class="row">
				<div class="col-md-4 col-md-offset-4">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<spring:message code="login.give.credentials" />
							</h4>
						</div>

						<div class="panel-body">
							<c:if test="${not empty error}">
								<div class="alert alert-danger">
									<a href="#" class="close" data-dismiss="alert"
										aria-label="close">&times;</a>
									<spring:message code="login.credentials.failure" />
								</div>
							</c:if>
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-user"></i></span> <input
									class="form-control"
									placeholder="<spring:message code="login.username"/>"
									name='j_username' type="text">
							</div>
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-lock"></i></span> <input
									class="form-control"
									placeholder="<spring:message code="login.password"/>"
									name='j_password' type="password">
							</div>
						</div>
						<div class="panel-footer">
							<input class="btn btn-default btn-block" type="submit"
								value="<spring:message code="login.login"/>">
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>