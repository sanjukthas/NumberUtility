<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<script src="javascripts/home.js"></script>
<script src="js/pendingAction.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>



<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">
<link rel="stylesheet"
	href="https://jqueryui.com/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<style>
#draggable {
	width: 0px;
	height: 0px;
	padding: 0em;
}

#resizable {
	width: 150px;
	height: 150px;
	padding: 0.5em;
}

#resizable h3 {
	text-align: center;
	margin: 0;
}

#red, #green, #blue {
	float: left;
	clear: left;
	width: 300px;
	margin: 15px;
}

#swatch {
	width: 120px;
	height: 100px;
	margin-top: 18px;
	margin-left: 350px;
	background-image: none;
}

#red .ui-slider-range {
	background: #ef2929;
}

#red .ui-slider-handle {
	border-color: #ef2929;
}

#green .ui-slider-range {
	background: #8ae234;
}

#green .ui-slider-handle {
	border-color: #8ae234;
}

#blue .ui-slider-range {
	background: #01579b;
}

#blue .ui-slider-handle {
	border-color: #01579b;
}
</style>
<title>Interview</title>
</head>
<body id="body" class="ui-widget-content" style="border: 0;">
	<jsp:include page="navbar.jsp"></jsp:include>
	
	<div ng-app="myApp" ng-controller="myCtrl">
	<div class="container">
		<div style="background-color: white;" class="panel-body">
			<c:set var="mesL" scope="session" value="${message}" />
			<c:if test="${mesL != null}">
				<div class="alert alert-success">
					<strong>${message}</strong> <span id="showSearchTerm"></span>
				</div>
			</c:if>

			<div class="row">
				<div class="col-sm-1"></div>
				<div class="col-sm-10">
					<c:set var="application" scope="session" value="${app}" />
					<c:if test="${application != null && application != ''}">

						<table class="table table-bordered">

							<thead>
								<tr>
									<th>AppId</th>
									<th>Status</th>
									<th>Job Id</th>
									<th>Job Title</th>
									<th>Job description</th>
									<th>Coding Test</th>
									<th>Actions</th>
								</tr>
							</thead>
								<tr>
									<td><a href="ApplicationDetail?applicationid=${application.applicationid}" ><c:out value="${application.applicationid}"></c:out></a></td>
									<td><c:out value="${application.appstatus}"></c:out></td>
									<td><c:out value="${application.hdzJob.jobsid}"></c:out></td>
									<td><c:out value="${application.hdzJob.position}"></c:out></td>
									<td><c:out value="${application.hdzJob.description}"></c:out></td>
									<td><c:out value="${application.codingtest}"></c:out></td>
									<td><table><c:set var="type" scope="session"
											value="${interviewType}" /> <c:if
											test="${type == 'Group Interview'}">
											<c:set var="coding" scope="session" value="${coding}" />
											<c:if test="${coding == 'N'}">
												<tr><td><a class="buttonLink" href="InterviewReportSubmission?groupInterviewCoding=P">Coding
													Test Pass</a></td></tr>
												<tr><td><a class="buttonLink" href="InterviewReportSubmission?groupInterviewCoding=F">Coding
													Test Fail</a></td></tr>
											</c:if>

											<tr><td><a class="buttonLink" href="InterviewReportSubmission?groupInterview=Pass">Group
												Interview Pass</a></td></tr>
											<tr><td><a class="buttonLink" href="InterviewReportSubmission?groupInterview=Fail">Group
												Interview Fail</a></td></tr>
										</c:if> <c:if test="${type == 'HM Interview'}">
										<c:set var="coding" scope="session" value="${coding}" />
											<c:if test="${coding == 'N'}">
											<tr><td><a class="buttonLink" href="InterviewReportSubmission?hmInterviewCoding=P">Coding
												Test Pass</a></td></tr>
											<tr><td><a class="buttonLink" href="InterviewReportSubmission?hmInterviewCoding=F">Coding
												Test Fail</a></td></tr>
												</c:if>
											<tr><td><a class="buttonLink" href="InterviewReportSubmission?hmInterview=Pass">HM Pass</a></td></tr>
											<tr><td><a class="buttonLink" href="InterviewReportSubmission?hmInterview=Fail">HM Fail</a></td></tr>
										</c:if> <c:if test="${type == 'HR Interview'}">

											<tr><td><a class="buttonLink" href="InterviewReportSubmission?hrInterview=Pass">HR Pass</a></td></tr>
											<tr><td><a class="buttonLink" href="InterviewReportSubmission?hrInterview=Fail">HR Fail</a></td></tr>
										</c:if></table>
										</td>
										
						</tr>
						</table>
						<c:set var="comments" scope="session" value="${application.comments}" />
						<c:if test="${comments != null && application != ''}">
							<p>
								${application.comments}
							</p>
						</c:if>

						Comment: <input type="text" id="commentInterview" name="commentInterview"/>
						
					</c:if>
					<c:if test="${application == null}">
						<h2>No Records!!</h2>
					</c:if>
				</div>
				<div class="col-sm-1"></div>
			</div>
		</div>
	</div>
	</div>
	
</body>
</html>