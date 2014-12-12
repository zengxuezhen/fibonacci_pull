<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
   <script language="javascript">
var times=11;
clock();
function clock()
{
   window.setTimeout('clock()',1000);
   times=times-1;
   time.innerHTML =times;
}
</script>
  <head>
    <base href="<%=basePath%>">
    
    <title>Fibonacci Request</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

<title>Insert title here</title>
<style type="text/css">
</style>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1>Fibonacci Request</h1>
    <P>Job Number:<%String s=request.getParameter("jobnum");%>
    <%=s %></P>
 <FORM action="FibonacciRequestServlet" method="get" name="form">
     <input type="hidden" value="Poll" name="rType">
     <input type="hidden" value=<%=s%> name="jobNum">
  
</FORM>

<script language="javascript">
{
setTimeout("form.submit()",10000);
}
</script>

<table>
<tr>
<td>Page will refresh in </td>
<td> <div class="STYLE1" id= "time"> 10 </div> </td>
<td>seconds </td>
</tr>
</table>
</body>

</html>
