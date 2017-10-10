<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.ArrayList, com.cg.bean.StudentBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Cust.css" />
</head>
<body>
<%
String studentId = session.getAttribute("studentId").toString();
String subjectName = session.getAttribute("subjName").toString();
int total = Integer.parseInt(session.getAttribute("totalmarks").toString());
String grade = session.getAttribute("grade").toString();
%>
<table border=10 cellspacing=10 cellpadding=5 align=center>
<tr>
<td>Student Id</td>
<td>
<%=studentId %>
</td>
</tr>
<tr>
<td>Subject Name</td>
<td>
<%=subjectName %>
</td>
</tr>
<tr>
<td>Total Marks</td>
<td>
<%=total %>
</td>
</tr>
<tr>
<td>Grade</td>
<td>
<%=grade %>
</td>
</tr>
</table>
</body>
</html>