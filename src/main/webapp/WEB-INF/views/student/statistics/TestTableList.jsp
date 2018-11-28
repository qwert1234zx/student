<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<head>
	<meta charset="UTF-8">
	<title>测试用表</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<link rel="Bookmark" href="favicon.ico" >
	<link rel="Shortcut Icon" href="favicon.ico" />
	<jsp:include page="../../include.jsp" flush="true"/>
	<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/echarts.common.min.js"></script>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont"></i>首页 <span class="c-999 en">&gt;</span> 系统管理 <span class="c-666 en">&gt;</span><span class="c-666">测试用表</span> <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="Hui-article">
	<article class="cl pd-20" style="padding-left: 200px">
		<div class="cl pd-5 bg-1 bk-gray mt-20">
				<span class="l">
				<a id="batchdel" href="${pageContext.request.contextPath}/system/testdiagram/testtable/myeCharts" class="btn btn-danger radius"><i class="Hui-iconfont"></i>我的自身情况</a>
				<a id="add" href="${pageContext.request.contextPath}/system/testdiagram/testtable/getPieCharts"  class="btn btn-primary radius"><i class="Hui-iconfont"></i>我收到的企业邀请</a>
	            <input type="date" id="start1" class="input-text" style="width:150px"/>——<input type="date" id="end1" class="input-text" style="width:150px"/>
				<button class="btn btn-success" type="submit" onclick="search()"><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
				</span>
		</div>

		<div class="my_blot"></div>
		<div id="main" style="width: 600px; height: 400px;"></div>
		<table class="table table-border table-bordered table-bg table-sort table-striped table-hover">




		</table>

	</article>
</div>


<script type="text/javascript">
    function search() {

    var myChart = echarts.init(document.getElementById('main'));
    // 显示标题，图例和空的坐标轴
    myChart.setOption({
        title : {
            text : '我发出面试邀请的学生的学校分布'
        },
        tooltip : {},
        legend : {
            data : [  ]
        },
        xAxis : {
            data : []
        },
        yAxis : {},
        series : [ {
            name : '学校类别',
            type : 'bar',
            data : []
        } ]
    });

    myChart.showLoading(); //数据加载完之前先显示一段简单的loading动画

    var names = []; //类别数组（实际用来盛放X轴坐标值）
    var nums = []; //销量数组（实际用来盛放Y坐标值）

    $.ajax({
        type : "post",
        async : true, //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
        //url : "echartServlet", //请求发送到TestServlet处
        url: '${pageContext.request.contextPath}/system/testdiagram/testtable/search',
        data : {"start1":start1.value,"end1":end1.value},
        dataType : "json", //返回数据形式为json
        success : function(result) {
            //请求成功时执行该函数内容，result即为服务器返回的json对象
            if (result) {
                names.push("985");
                names.push("211");
                names.push("双一流");
                nums.push(result.studentSumisNef); //挨个取出类别并填入类别数组
                nums.push(result.studentSumisToo);
                nums.push(result.studentSumisDfg);

                myChart.hideLoading(); //隐藏加载动画
                myChart.setOption({ //加载数据图表
                    xAxis : {
                        data : names
                    },
                    series : [ {
                        // 根据名字对应到相应的系列
                        name : '学校类别',
                        data : nums
                    } ]
                });

            }

        },
        error : function(errorMsg) {
            //请求失败时执行该函数
            alert("图表请求数据失败!");
            myChart.hideLoading();
        }
    })}
</script>
</body>
</html>