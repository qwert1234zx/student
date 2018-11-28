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
    <title>查看学生查询条件</title>
</head>
<body>
<article class="cl pd-20" class="pos-ab">
    <div class="form form-horizontal" >

        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>条件名称</label>
            <div class='formControls col-xs-8 col-sm-9'>
                <input type='text' class='input-text' id='QueryName' value="${sqc.queryName}"  style='width:500px'>
            </div>
        </div>

        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>省份名称：</label>
            <div class='formControls col-xs-8 col-sm-9'>
                <select name="srcList"  id="typenum" size="4" multiple>
                    <c:forEach items="${pro}" var="resp" varStatus="status">
                        <option   value="${resp.provinceid}">${resp.provincename}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>所有行业：</label>
            <div class='formControls col-xs-8 col-sm-9'>
                <select name="srcList1"  id="typenum1" size="4" multiple>
                    <c:forEach items="${industry}" var="resp" varStatus="status">
                        <option   value="${resp.industryID}">${resp.industryName}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>岗位类型：</label>
            <div class='formControls col-xs-8 col-sm-9'>
                <select name="srcList2"  id="typenum2" size="4" multiple>
                    <c:forEach items="${job}" var="resp" varStatus="status">
                        <option   value="${resp.jobCategoryID}">${resp.jobCategoryName}</option>
                    </c:forEach>
                </select></div>
        </div>

        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>企业类型：</label>
            <div class='formControls col-xs-8 col-sm-9'>
                <select name="srcList3"  id="typenum3" size="4" multiple>
                    <c:forEach items="${entertype}" var="resp" varStatus="status">
                        <option   value="${resp.enterpriseTypeID}">${resp.enterpriseTypeName}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>最低薪资：--最高薪资</label>
                <input type='text' class='input-text' id='ssalary' value="${othercondition.salaryLowerLimit}" style='width:50px'>元--
                <input type='text' class='input-text' id='bsalary' value="${othercondition.salaryUpperLimit}" style='width:50px'>元
        </div>

        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>最低年限：--最高年限</label>
                <input type='text' class='input-text' id='syear' value="${othercondition.workYearLowerLimit}" style='width:30px'>年--
                <input type='text' class='input-text' id='byear' value="${othercondition.workYearUpperLimit}" style='width:30px'>年
        </div>



        <%--<div class="row cl">--%>
            <%--<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">--%>
                <%--<button onclick="submit()" class="btn btn-primary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 提交</button>&nbsp;&nbsp;--%>
                <%--<button class="btn btn-default radius" type="button"  onclick="layer_close();"> &nbsp;&nbsp;取消&nbsp;&nbsp; </button>--%>
            <%--</div>--%>
        <%--</div>--%>
    </div>
</article>

<script type="text/javascript">
    //输入字段的合法性检查规则
    var regList = [

        {
            name:'学生查询条件名称',
            id:'QueryName',
            reg:['NotNull','MaxLength=100']
        },
        {
            name:'所属学生',
            id:'StudentID',
            reg:['NotNull','MaxLength=10']
        }

    ];

    function submit() {
//        if(validate(regList)){
        //从各字段取数据拼接Json字符串

        var oProvinceids = $('#typenum').val();
        var oIndustryids= $('#typenum1').val();
        var oJobCategoryids= $('#typenum2').val();
        var oEnterpriseTypeids= $('#typenum3').val();
        var oQueryName=$('#QueryName').val();
        var ossalary=$('#ssalary').val();
        var obsalary=$('#bsalary').val();
        var osyear=$('#syear').val();
        var obyear=$('#byear').val();

        var entity = {

            Provinceid: oProvinceids,
            Industryid:oIndustryids,
            JobCategoryid:oJobCategoryids,
            EnterpriseTypeid:oEnterpriseTypeids,
            QueryName:oQueryName,
            Ssalary:ossalary,
            Bsalary:obsalary,
            Syear:osyear,
            Byear:obyear

        }

        $.ajax({
            type: "post",
            url: "<%=request.getContextPath()%>/student/jobsearch/studentquerycondition/addjobsearch1",
            data: {"entity": JSON.stringify(entity)},	//参数取值
            success: function (result) {
                if (result > 0) {
                    parent.layer.msg('添加成功！', {icon: 1, time: 2000});
                    parent.search(parent.pageNum.value);	//调用父窗口的查询函数进行刷新
                    layer_close();		//关闭本弹出窗口
                } else {
                    parent.layer.msg('添加失败！', {icon: 1, time: 2000});
                }
            }
        })
//        }
    }
</script>
</body>
</html>