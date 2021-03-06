<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="Bookmark" href="favicon.ico" >
    <link rel="Shortcut Icon" href="favicon.ico" />
    <jsp:include page="../../../include.jsp" flush="true"/>
    <title>修改学校</title>
</head>
<body>
<article class="cl pd-20" class="pos-ab">
    <div class="form form-horizontal" >
        <input type="hidden" class="input-text" id="UniversityId" maxlength="10" style="width:120px" value="${University.universityID}">

        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>管理员密码：</label>
            <div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Password' maxlength='32' style='width:384px' value='${University.password}'></div>
        </div>
        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>学校管理员：</label>
            <div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Manager' maxlength='20' style='width:240px' value='${University.manager}'></div>
        </div>
        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>学历：</label>
            <div class='formControls col-xs-8 col-sm-9'>
                <select name="srcList3"  id="Degree" size="3">
                    <c:forEach items="${alldegree}" var="resp" varStatus="status">
                        <option   value="${resp.degreeID}">${resp.degreeName}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <%--<script>--%>
            <%--var m=${'IsDFG'};--%>
            <%--alert(${University.isDFG});--%>
            <%--var i=${University.isDFG};--%>
            <%--switch(i){--%>
                <%--case 1:--%>
                    <%--m[1].selected=true;--%>
                    <%--break;--%>
                <%--case 0:--%>
                    <%--m[0].selected=true;--%>
                    <%--break;--%>
            <%--}--%>
        <%--</script>--%>

        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'>是否双一流：</label>
            <div class='formControls col-xs-8 col-sm-9'>
                <%--<input type='text' class='input-text'  maxlength='10' style='width:120px' value='${University.isDFG}'>--%>
                <select name="srcList3"  id="IsDFG" size="1">
                    <option  value="">请选择</option>
                    <option   value="1">是</option>
                    <option   value="0">否</option>
                </select>
            </div>
        </div>
        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'>是否211：</label>
            <div class='formControls col-xs-8 col-sm-9'>
                <%--<input type='text' class='input-text' id='IsTOO' maxlength='10' style='width:120px' value='${University.isTOO}'>--%>
                    <select name="srcList3"  id="IsTOO" size="1">
                        <option  value="">请选择</option>
                        <option   value="1">是</option>
                        <option   value="0">否</option>
                    </select>
            </div>
        </div>
        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'>是否985：</label>
            <div class='formControls col-xs-8 col-sm-9'>
                <%--<input type='text' class='input-text' id='IsNEF' maxlength='10' style='width:120px' value='${University.isNEF}'>--%>
                    <select name="srcList3"  id="IsNEF" size="1">
                        <option  value="">请选择</option>
                        <option   value="1">是</option>
                        <option   value="0">否</option>
                    </select>
            </div>
        </div>
        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'>学校简介：</label>
            <div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Description' maxlength='1000' style='width:12000px' value='${University.description}'></div>
        </div>
        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>学校名称：</label>
            <div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='UniversityName' maxlength='60' style='width:720px' value='${University.universityName}'></div>
        </div>
        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>所属省：</label>
            <div class='formControls col-xs-8 col-sm-9'>
                <select name="srcList3"  id="ProvinceID" size="3">
                    <c:forEach items="${allprovince}" var="resp" varStatus="status">
                        <option   value="${resp.provinceid}">${resp.provincename}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                <button onClick="submit()" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 提交</button>
                <input class="btn btn-default radius" type="reset" value="&nbsp;&nbsp;取消&nbsp;&nbsp;" onclick="reset();">
            </div>
        </div>
    </div>
</article>
<script type="text/javascript">
    //输入字段的合法性检查规则
    var regList = [

        {
            name:'管理员密码',
            id:'Password',
            reg:['NotNull','MaxLength=32']
        },
        {
            name:'学校管理员',
            id:'Manager',
            reg:['NotNull','MaxLength=20']
        },
        {
            name:'学历',
            id:'Degree',
            reg:['NotNull','MaxLength=10']
        },
        {
            name:'是否双一流',
            id:'IsDFG',
            reg:['MaxLength=10']
        },
        {
            name:'是否211',
            id:'IsTOO',
            reg:['MaxLength=10']
        },
        {
            name:'是否985',
            id:'IsNEF',
            reg:['MaxLength=10']
        },
        {
            name:'学校简介',
            id:'Description',
            reg:['MaxLength=1000']
        },
        {
            name:'学校名称',
            id:'UniversityName',
            reg:['NotNull','MaxLength=60']
        },
        {
            name:'所属省',
            id:'ProvinceID',
            reg:['NotNull','MaxLength=10']
        }

    ];

    function submit() {
        if (validate(regList)) {
            //从各字段取数据拼接Json字符串
            var oUniversityId= UniversityId.value;

            var oPassword = $('#Password').val();
            var oManager = $('#Manager').val();
            var oDegree = $('#Degree').val();
            var oIsDFG = $('#IsDFG').val();
            var oIsTOO = $('#IsTOO').val();
            var oIsNEF = $('#IsNEF').val();
            var oDescription = $('#Description').val();
            var oUniversityName = $('#UniversityName').val();
            var oProvinceID = $('#ProvinceID').val();

            var entity = {
                UniversityId:oUniversityId,
                Password: oPassword,
                Manager: oManager,
                Degree: oDegree,
                IsDFG: oIsDFG,
                IsTOO: oIsTOO,
                IsNEF: oIsNEF,
                Description: oDescription,
                UniversityName: oUniversityName,
                ProvinceID: oProvinceID

            }

            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/university/infomationmanagement/university/update",
                data: {"entity": JSON.stringify(entity)},	//参数取值
                success: function (result) {
                    if (result > 0) {
                        parent.layer.msg('修改成功！', {icon: 1, time: 2000});
//                        parent.shua();
                        parent.search(parent.pageNum.value);	//调用父窗口的查询函数进行刷新
                        layer_close();		//关闭本弹出窗口
                    } else {
                        parent.layer.msg('修改失败！', {icon: 1, time: 2000});
                    }
                }
            })
        }
    }
</script>
</body>
</html>