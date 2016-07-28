<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table id=myTable>
<tr>
<ths> Origin</ths>
<ths> Food</ths>
<ths> Rating</ths>
</tr>

<tr> 
<td> Balt</td>
<td> CrabCakes</td>
<td> 9</td>
</tr>

<tr>
<td> Shore</td>
<td> CrabCakes</td>
<td> 10</td>
</tr>

<tr>
<td> Balt</td>
<td> Oldwing</td>
<td> 11</td>
</tr>

<tr>
<td> miani</td>
<td> Mango</td>
<td> 12</td>
</tr>
</table>
<script>
function myFunction() {
 var table = document.getElementById("myTable");
 var row = table.insertRow(0);
 var cell1 = row.insertCell(0);
 var cell2 = row.insertCell(1);
 var cell3 = row.insertCell(2);
 cell1.innerHTML = "NEW CELL1";
 cell2.innerHTML = "NEW CELL2";
 cell3.innerHTML = "NEW CELL3";
}
</script>
<button onclick="myFunction()">Add Rows</button>
</body>
</html>