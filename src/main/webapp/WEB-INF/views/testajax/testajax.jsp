<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="../include.jsp" flush="true"/>
</head>
<body>
<tr>
    <td>用户名:</td>
    <td><input type="text" id="name1"/></td>
</tr>
<tr>
    <td>密码:</td>
    <td><input type="password" id="pwd"/></td>
</tr>
<input type="button" onclick="test()" value="提交"/>

<div id="xxx">
</div>
<script>
    function test() {
        var oname=$('#name1').val();
        var opwd=$('#pwd').val();
        var entity={
            name:oname,
            pwd:opwd
        };
        $.ajax({
            type: "post",
            url:"${pageContext.request.contextPath}/csol/testajax",
            data: {"en":JSON.stringify(entity)},
            success:function (result) {
//                alert(result.name+"ddd"+result.password);
                var htmls="";
                htmls+="<tr>";
                htmls+="<td>"+result.name+"</td>";
                htmls+="<td>"+result.password+"</td></tr>";
                $("#xxx").append(htmls);
//                document.getElementsByTagName("body")[0].innerHTML += htmls
                alert(htmls);
            },
            error:function () {
                alert(11);

            }

            }
        )
    }
//    function ak() {
//        var htmls="";
//        htmls+="<tr><td>aaa</td></tr>";
//        document.write(htmls);
//    }
    document.write("aaaa");
</script>
</body>
</html>
