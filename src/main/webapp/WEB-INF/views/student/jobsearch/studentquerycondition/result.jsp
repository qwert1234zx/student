<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>学生查询条件</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="Bookmark" href="favicon.ico" >
    <link rel="Shortcut Icon" href="favicon.ico" />
    <jsp:include page="../../../include.jsp" flush="true"/>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont"></i>首页 <span class="c-999 en">&gt;</span> 系统管理 <span class="c-666 en">&gt;</span><span class="c-666">学生查询条件</span> <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="Hui-article">
    <article class="cl pd-20" style="padding-left: 200px">
        <div class="cl pd-5 bg-1 bk-gray mt-20">
				<span class="l">
				<a id="batchdel" href="javascript:;" onclick="deleteByIdList(null)" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>
				<a id="add" href="javascript:;" onclick="add()" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加学生查询条件</a>
				<a id="add1" href="javascript:;" onclick="add1()" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加学生查询条件1</a>
	<input type="text" id="QueryName" placeholder="学生查询条件名称" style="width:250px" class="input-text">
	<input type="text" id="StudentID" placeholder="所属学生" style="width:250px" class="input-text">

				<button class="btn btn-success" type="submit" onclick="search(1)"><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
				</span>
        </div>
        <div class="my_blot"></div>
        <table class="table table-border table-bordered table-bg table-sort table-striped table-hover">
            <thead>
            <tr class="text-c">
                <td width="1%"><input type="checkbox" id="CheckAll" /></td>
                <td width="1%">序号</td>

                <td width="15%">岗位名称</td>
                <td width="15%">企业名称</td>
                <td width="10%">行业名称</td>
                <td width="8%">企业类型</td>
                <td width="8%">地区</td>
                <td width="5%">最低薪资</td>
                <td width="5%">最高薪资</td>
                <td width="5%">最低年限</td>
                <td width="5%">最高年限</td>

                <td width="15%">操作</td>
            </tr>
            </thead>
            <tbody id="listtable">
            <c:forEach items="${results}" var="result" varStatus="status">
                <tr class='text-c'>
                    <td><input width='25' type='checkbox' value='${status.index}' name='get_id'/></td>
                    <td>${status.index+1}</td>
                    <td>${result.jobName}</td>
                    <td>${result.enterpriseName}</td>
                    <td>${result.industryName}</td>
                    <td>${result.enterpriseTypeName}</td>
                    <td>${result.provinceName}</td>
                    <td>${result.lowerSalary}</td>
                    <td>${result.upperSalary}</td>
                    <td>${result.workYearLowerLimit}</td>
                    <td>${result.workYearUpperLimit}</td>

                    <td>
                        无操作
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <div id="pagerBar" style="margin-top:5px; text-align:center;">
            ${PageString}
        </div>
    </article>
</div>
<script type="text/javascript">
    //TODO 优化用字节来存储权限位，如0000001表示有增加权限
    var functionAuthorityString = 1111;	//用二进制保存，从右到左分别表示为增加（1）、修改（10）、查看（100）、删除（1000）……等权限，使用时用parseInt(X,2)转化为二进制，然后采用位与（&）来判断

    $("#CheckAll").bind("click",function(){
        $("input[name='get_id']").prop("checked",this.checked);
    });

    //按当前页重新查询
    function search() {
        search(pageNum.value);
    }

    //查询指定页
    function search(newPageNum) {
        $.ajax({
            type: "post",
            url: "<%=request.getContextPath()%>/student/jobsearch/studentquerycondition/search",
            data: {"pageNum": newPageNum,  "queryName":QueryName.value, "studentID":StudentID.value},	//查询参数可以根据需要来定制，参数名称注意要与Controller中方法参数名称一致，查询后跳转到当前所在页以支持AJAX下的翻页
            success: function (result) {
                //根据查询结果刷新数据表内容
                //            $("#listtable").empty();	//DHTML的bug？使用empty()会始终保留一个空行导致用append方法最后页面格式不对
                var generatedHTML = "";
                var data = result.dataList;
                for (var i = 0; i < data.length; i++) {
                    generatedHTML+="<tr class='text-c'>";
                    generatedHTML+="<td><input width='25' type='checkbox' value=" + data[i] + " name='get_id'/></td>";
                    generatedHTML+="<td>" + (i + 1) + "</td>";	//序号，从1开始

                    generatedHTML+="<td>" + data[i].queryName + "</td>";
                    generatedHTML+="<td>" + data[i].studentID + "</td>";

                    generatedHTML+="<td>";
                    generatedHTML+="</td>";
                    generatedHTML+="</tr>";
                }
                listtable.innerHTML=generatedHTML;

                //刷新分页器显示内容
                pagerBar.innerHTML = result.pagerString;
            }
        })
    }

    /*添加*/
    function add(){
        var url = "<%=request.getContextPath()%>/student/jobsearch/studentquerycondition/addForward";		//要弹出的路径 PS：其实就是正常访问的页面
        layer.open({
            title: '添加',						//弹出页面标题
            type: 2,							//2--解析URL
            area: ['400', '450'],				//弹出层大小，也可用%来控制页面比例
            shade: 0.8,							//遮罩层 透明度
            content: url						//弹出层 URL
        });
    }

    function add1(){
        var url = "<%=request.getContextPath()%>/student/jobsearch/studentquerycondition/ser";		//要弹出的路径 PS：其实就是正常访问的页面
        layer.open({
            title: '添加次元',						//弹出页面标题
            type: 2,							//2--解析URL
            area: ['400', '450'],				//弹出层大小，也可用%来控制页面比例
            shade: 0.8,							//遮罩层 透明度
            content: url						//弹出层 URL
        });
    }

    /*编辑*/
    function edit(id){
        var url = "<%=request.getContextPath()%>/student/jobsearch/studentquerycondition/updateForward?testTableId="+id;		//要弹出的路径 PS：其实就是正常访问的页面
        layer.open({
            title: '修改',						//弹出页面标题
            type: 2,							//2--解析URL
            area: ['400', '450'],				//弹出层大小，也可用%来控制页面比例
            shade: 0.8,							//遮罩层 透明度
            content: url						//弹出层 URL
        });
    }

    /*详情*/
    function showDetail(obj){
    }


    /*删除单条记录*/
    function deleteById(id) {
        var sSelectedRecordArray = [];
        sSelectedRecordArray.push(id);
        deleteByIdList(sSelectedRecordArray);
    }

    /*批量删除*/
    function deleteByIdList(sSelectedRecordArray) {
        //var temp = 0;
        var sCheckboxList = [];

        //如果传递的参数非空，则根据参数进行删除，否则根据选择框进行选择
        if(sSelectedRecordArray != null){
            sCheckboxList = sSelectedRecordArray;
        }else{
            $("input[name=get_id]:checked").each(function (i) {
                sCheckboxList.push($(this).val());
                //temp++;
            });
        }

        //if (temp == 0){
        if( sCheckboxList.length == 0 ){
            layer.confirm('请选择您要删除的数据！')
        } else {
            layer.confirm('所有选择的数据都将被删除，您确定吗？',function () {
                $.ajax({
                    data:{"checkedlist":JSON.stringify(sCheckboxList)},
                    type: "post",
                    url: "<%=request.getContextPath()%>/student/jobsearch/studentquerycondition/deleteByIdList",
                    dataType: "json",
                    success:function (result) {
                        if (result > 0) {
                            layer.msg('删除成功！',{icon:1,time:2000});
                            search(pageNum.value);		//重新刷新数据
                        } else {
                            layer.msg('删除失败，请重试！',{icon:1,time:2000});
                        }
                    }
                })
            })
        }
    }
</script>
</body>
</html>