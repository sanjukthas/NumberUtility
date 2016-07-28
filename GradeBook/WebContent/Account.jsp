<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script language="JavaScript">
function Hello()
 {
 alert("Hello World!")
 }
 

  
</head>
<body>

<body onload="Hello()">
</script>
<title>jQuery UI Datepicker - Default functionality</title>
<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">
<link rel="stylesheet" href="https:/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<script>
$( function() {
  $( "#datepicker" ).datepicker();
} );
</script>
<p>Date: <input type="text" id="datepicker"></p>
<h1>Enter the details</h1>
 <form role="form" action="Account" method="post"> 
  <div class="form-group">
    <label for=" StudentID">Student ID :</label>
    <input type="text" name="StudentID" class="form-control" id="StudentID">
  </div>
  <div class="form-group">
    <label for="Assignmentname">Assignmentname:</label>
    <input type="text" name="Assignmentname" class="form-control" id="Assignmentname">
  </div>
  <div class="form-group">
    <label for="TypeID">Type:</label>
    <input type="text" name="Type" class="form-control" id="Type">
  </div>
  <div class="form-group">
    <label for="Date_HW">Date_HW:</label>
    <input type="text" name="Date_HW" class="form-control" id="Date_HW">
  </div>
  <div class="form-group">
    <label for="Grade">Grade:</label>
    <input type="text" name="Grade" class="form-control" id="Grade">
  </div>
  
  <input type="submit" id="submit" value="Submit" class="btn btn-default">
</form>

<br><br><br>   
<h1>Know the student</h1>
 <form role="form" method="post">
  <div class="form-group">
    <label for=" StudentID">Student ID :</label>
    <input type="text" class="form-control" id="StudentID">
  </div>   
  <div class="form-group">
    <label for=" TypeID">TypeID :</label>
    <input type="text" name="TypeID" class="form-control" id="TypeID">
  </div>
   <BUTTON TYPE="button" CLASS="BTN BTN-DEFAULT">Sum</BUTTON>
  <BUTTON TYPE="button" class="BTN BTN-DEFAULT">Avg</BUTTON>
    <BUTTON TYPE="button" CLASS="BTN BTN-DEFAULT">Max</BUTTON>
</form>   
<jsp:include page="Animation.jsp"></jsp:include>

</body>
</html>