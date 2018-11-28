<%--
  Created by IntelliJ IDEA.
  User: dc
  Date: 2018/10/3
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
succ下一步准备改为a.ajax
<form action="${pageContext.request.contextPath}/dcc/selectfile" method="post">
<input hidden="hidden" name="picid" type="text" value="${information.picid}"/>
    <input type="submit" value="查看自己的执照"/>
</form>
${information.name}您已经上传成功
</body>
</html>
