<html>
<body>
<% 
String path = request.getContextPath();
String contextPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<script type="text/javascript">
	window.location="<%=contextPath%>/register.do";
</script>
</body>
</html>
