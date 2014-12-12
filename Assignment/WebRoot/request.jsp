<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'request.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <P>Fibonacci Sequence Length:</P>
    <FORM  method="get" action="FibonacciRequestServlet">
    <input type="hidden" value="Add" name="rType">
   <p> <input name="parameter" type="text" id="a" onkeyup="value=value.replace(/[^(\d)]/g,'')"/></p>
	<P>value[0-93]</P>
	<INPUT type="submit" value="submit">
  </FORM>
  <script type="text/javascript">    
  function SumbitBatch(form,fun){
  if(document.form.a.value>100){
      alert("Please input 0-93");    
      return false;        }   
       }</script>
  </body>
</html>
