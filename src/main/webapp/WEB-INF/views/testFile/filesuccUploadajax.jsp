<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>学生查询条件</title>
    <jsp:include page="../include.jsp" flush="true"/>
</head>
<body>

<button class="btn btn-success" type="submit" onclick="search()"><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
<input  id="picid" name="picid" type="text" value="${information.picid}"/>
<input id="path" type="text" hidden="hidden" value="${pageContext.request.contextPath}"/>

<div id="ak47">
aa
</div>

<script type="text/javascript">
    function search() {
        var a=$("#picid").val();
        var b=$("#path").val();
        var $divs=document.getElementById("ak47");
        var c="${pageContext.request.contextPath}";
        $.ajax({
            type: "post",
            url: "<%=request.getContextPath()%>/dcc/selectfile",
            data: {"picid":a},	//查询参数可以根据需要来定制，参数名称注意要与Controller中方法参数名称一致，查询后跳转到当前所在页以支持AJAX下的翻页
            success: function (result) {
//                alert("succ");
                    var generatedHTML = "";
                    generatedHTML+="<tr><td>";
                    generatedHTML+="<img src='";
                    generatedHTML+=b+result.address;
                    generatedHTML+="'/></td></tr>";
                    $("#ak47").append(generatedHTML);
//                    alert(c);
//                    $("#ak47").html(generatedHTML);
//                $divs.innerHTML=generatedHTML;

            }
        })
    }
</script>
</body>
</html>