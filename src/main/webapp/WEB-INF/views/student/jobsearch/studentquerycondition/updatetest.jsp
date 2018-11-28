<%@ page import="java.util.List" %>
<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
    <script src="${pageContext.request.contextPath}/js/jobjs.js"></script>
    <title>查看并修改学生查询条件</title>
</head>
<body>
<article class="cl pd-20" class="pos-ab">
    <div class="form form-horizontal" >

        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>条件名称</label>
            <div class='formControls col-xs-8 col-sm-9'>
                <input type='text' class='input-text' id='QueryName' value="${sqc.queryName}" maxlength='100' style='width:400px'>
            </div>
        </div>

        <input type="text" hidden="hidden" id="id" value="${id}">
        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>省份名称：</label>
            <div class='formControls col-xs-8 col-sm-9'>
                <select name="srcList"  id="typenum" size="4" multiple>
                    <c:forEach items="${resultProvince}" var="resp" varStatus="status">
                        <option   value="${resp.provinceid}" id="${resp.provincename}">${resp.provincename}</option>
                        <c:set var="a" value="${resp.provinceid}"/>
                        <c:if test="${fn:contains(proid,a)}" >
                            <script>
                                var cs=$('#${resp.provincename}');
                                cs.attr("selected",true);
                            </script>
                        </c:if>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>所有行业：</label>
            <div class='formControls col-xs-8 col-sm-9'>
                <select class="select2" name="srcList1"  id="typenum1" size="4" multiple>
                    <c:forEach items="${resultIndustry}" var="resq" varStatus="status">
                        <option   value="${resq.industryID}" id="${resq.industryName}">${resq.industryName}</option>
                        <c:set var="b" value="${resq.industryID}"/>
                        <c:if test="${fn:contains(industryid,b)}">
                            <script>
                                $('#${resq.industryName}').attr("selected",true);
                            </script>
                        </c:if>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>岗位类型：</label>
            <div class='formControls col-xs-8 col-sm-9'>
                <select name="srcList2"  id="typenum2" size="4" multiple>
                    <c:forEach items="${resultJobCategory}" var="resps" varStatus="status">
                        <option   value="${resps.jobCategoryID}" id="${resps.jobCategoryName}">${resps.jobCategoryName}</option>
                        <c:set var="c" value="${resps.jobCategoryID}"/>
                        <c:if test="${fn:contains(jobid,c)}"><%--第二个属性不能使用EL--%>
                            <script>
                                var a=$('#${resps.jobCategoryName}');
                                a.attr("selected",true);
                            </script>
                        </c:if>
                    </c:forEach>
                </select></div>
        </div>

        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>企业类型：</label>
            <div class='formControls col-xs-8 col-sm-9'>
                <select name="srcList3"  id="typenum3" size="4" multiple>
                    <c:forEach items="${resultEnterpriseType}" var="resqq" varStatus="status">
                        <option   value="${resqq.enterpriseTypeID}" id="${resqq.enterpriseTypeName}">${resqq.enterpriseTypeName}</option>
                        <c:set var="d" value="${resqq.enterpriseTypeID}"/>
                        <c:if test="${fn:contains(entertypeid,d)}">
                            <script>
                                var a=$('#${resqq.enterpriseTypeName}');
                                a.attr("selected",true);
                            </script>
                        </c:if>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>最低薪资：--最高薪资</label>
                <input type='text' class='input-text' id='ssalary'  value="${othercondition.salaryLowerLimit}" maxlength='100' style='width:50px'>元--
                <input type='text' class='input-text' id='bsalary' value="${othercondition.salaryUpperLimit}" maxlength='100' style='width:50px'>元
        </div>

        <div class='row cl'>
            <label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>最低年限：--最高年限</label>
                <input type='text' class='input-text' id='syear' value="${othercondition.workYearLowerLimit}" maxlength='100' style='width:30px'>年--
                <input type='text' class='input-text' id='byear' value="${othercondition.workYearUpperLimit}" maxlength='100' style='width:30px'>年
        </div>


        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                <button onclick="submit()" class="btn btn-primary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 提交</button>&nbsp;&nbsp;
                <button class="btn btn-default radius" type="button"  onclick="layer_close();"> &nbsp;&nbsp;取消&nbsp;&nbsp; </button>
            </div>
        </div>
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
        var oid=$('#id').val();
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
            Id:oid,
            Ssalary:ossalary,
            Bsalary:obsalary,
            Syear:osyear,
            Byear:obyear

        }

        $.ajax({
            type: "post",
            url: "<%=request.getContextPath()%>/student/jobsearch/studentquerycondition/updatejobsearch",
            data: {"entity": JSON.stringify(entity)},	//参数取值
            success: function (result) {
                if (result > 0) {
                    parent.layer.msg('更新成功！', {icon: 1, time: 2000});
                    parent.search(parent.pageNum.value);	//调用父窗口的查询函数进行刷新
                    layer_close();		//关闭本弹出窗口
                } else {
                    parent.layer.msg('更新失败！', {icon: 1, time: 2000});
                }
            }
        })
//        }
    }
</script>
</body>
</html>