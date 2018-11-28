<%--
  Created by IntelliJ IDEA.
  User: dc
  Date: 2018/10/3
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<tr>
    <td>上传人:</td>
    <td>${userpic.name}</td>
</tr>
<tr>
    <td>执照</td>
    <td><img src="${pageContext.request.contextPath}${userpic.address}"/></td>
    <%--<td><img src="/upload/dc_3efa1188-ca93-4afe-bde4-08bb160b377a_2018_0824_1913_06_0.jpg" /></td>--%>
</tr>
</body>
</html>
