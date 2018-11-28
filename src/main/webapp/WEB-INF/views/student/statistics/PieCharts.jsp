<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>学生统计</title>
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
<nav class="breadcrumb"><i class="Hui-iconfont"></i>首页 <span class="c-999 en">&gt;</span> 学生统计分析 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="Hui-article">
    <article class="cl pd-20" style="padding-left: 200px">
        <div class="cl pd-5 bg-1 bk-gray mt-20">
				<span class="l">
				<a id="batchdel" href="${pageContext.request.contextPath}/system/testdiagram/testtable/myeCharts" class="btn btn-danger radius"><i class="Hui-iconfont"></i>我的自身情况</a>
				<a id="add" href="${pageContext.request.contextPath}/system/testdiagram/testtable/getPieCharts"  class="btn btn-primary radius"><i class="Hui-iconfont"></i>我收到的企业邀请</a>

				</span>
        </div>

        <div class="my_blot"></div>
        <div id="pie" style="width: 500px;height: 300px;"></div>
        <table class="table table-border table-bordered table-bg table-sort table-striped table-hover">




        </table>

    </article>
</div>


<script>
    //初始化echarts
    var pieCharts = echarts.init(document.getElementById("pie"));
    //设置属性
    pieCharts.setOption({
        title: {
            text: '我收到的公司邀请',
            subtext: '行业',
            x: 'center'
        },
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            x: 'left',
            data: []
        },
        toolbox: {
            show: true,
            feature: {
                mark: {show: true},
                dataView: {show: true, readOnly: false},
                magicType: {
                    show: true,
                    type: ['pie', 'funnel'],
                    option: {
                        funnel: {
                            x: '25%',
                            width: '50%',
                            funnelAlign: 'left',
                            max: 1548
                        }
                    }
                },
                restore: {show: true},
                saveAsImage: {show: true}
            }
        },
        calculable: true,
        series: [
            {
                name: '行业',
                type: 'pie',
                radius: '55%',
                center: ['50%', '60%'],
                data: []
            }
        ]
    });
    //显示一段动画
    pieCharts.showLoading();
    //异步请求数据
    $.ajax({
        type: "post",
        async: true,
        url: '${pageContext.request.contextPath}/system/testdiagram/testtable/getdataa',
        data: [],
        dataType: "json",
        success: function (result) {
            var datas=[];
            for (var i = 0; i < result.length; i++) {
                var data=new Object();
                data.value=result[i].indlnviSum;
                data.name=result[i].industryName;
                datas.push(data);
            }
            pieCharts.hideLoading();//隐藏加载动画
            pieCharts.setOption({
                title: {
                    text: '我收到的公司邀请',
                    subtext: '行业',
                    x: 'center'
                },
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    x: 'left',
                    data: []
                },
                toolbox: {
                    show: true,
                    feature: {
                        mark: {show: true},
                        dataView: {show: true, readOnly: false},
                        magicType: {
                            show: true,
                            type: ['pie', 'funnel'],
                            option: {
                                funnel: {
                                    x: '25%',
                                    width: '50%',
                                    funnelAlign: 'left',
                                    max: 1548
                                }
                            }
                        },
                        restore: {show: true},
                        saveAsImage: {show: true}
                    }
                },
                calculable: true,
                series: [
                    {
                        name: '行业',
                        type: 'pie',
                        radius: '55%',
                        center: ['50%', '60%'],
                        data: datas
                    }
                ]
            });
        }
    })
</script>

</body>
</html>
