<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Gangdan
  Date: 2017/4/24
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<html>
<head>
    <title>ETC教务管理系统</title>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="Bookmark" href="favicon.ico" >
    <link rel="Shortcut Icon" href="favicon.ico" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="<%=request.getContextPath()%>/lib/html5.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/lib/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/h-ui/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/h-ui.admin/css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/lib/Hui-iconfont/1.0.8/iconfont.css" />

    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/h-ui.admin/skin/default/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/h-ui.admin/css/style.css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script><![endif]-->
</head>
<body>
<!--_header 作为公共模版分离出去-->
<header class="navbar-wrapper">
    <div class="navbar navbar-fixed-top">
        <div class="container-fluid cl"> <a class="logo navbar-logo f-l mr-10 hidden-xs" >ETC教务管理系统</a>
            <nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
                <ul class="cl">
                    <li>${employee.roleName}</li>
                    <li class="dropDown dropDown_hover"> <a href="#" class="dropDown_A">${employee.employeeName} <i class="Hui-iconfont">&#xe6d5;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a onclick="admin_permission_edit();">个人信息</a></li>
                            <li><a onclick="admin_permission_pwd();">修改密码</a></li>
                            <li><a href="${pageContext.request.contextPath}/login/loginOut">切换账户</a></li>
                            <li><a href="${pageContext.request.contextPath}/login/loginOut">退出</a></li>
                        </ul>
                    </li>
                    <li id="Hui-msg"> <a href="#" title="消息"><span class="badge badge-danger"></span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li>
                    <li id="Hui-skin" class="dropDown right dropDown_hover"> <a href="javascript:;" class="dropDown_A" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
                            <li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
                            <li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
                            <li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
                            <li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
                            <li><a href="javascript:;" data-val="orange" title="绿色">橙色</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</header>
<!--/_header 作为公共模版分离出去-->
<!--_menu 作为公共模版分离出去-->
<aside class="Hui-aside">
    <input runat="server" id="divScrollValue" type="hidden" value="" />
    <%--<div class="menu_dropdown bk_2" id="menuVue">
        <dl id="menu-article">
            <dt><i class="Hui-iconfont">&#xe616;</i> 系统管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a href="javascript:;" target="myframe" title="行政区划管理">行政区划管理</a></li>
                    <li><a href="/dep/findFor" target="myframe" title="部门管理">部门管理</a></li>
                    <li><a href="/employee/findFor" target="myframe" title="人员管理">人员管理</a></li>
                    <li><a href="/fun/findFor" target="myframe" title="功能管理">功能管理</a></li>
                    <li><a href="/role/findFor" target="myframe" title="角色管理">角色管理</a></li>
                    <li><a href="/fun/findTreeFor" target="myframe" title="权限管理">权限管理</a></li>
                    <li><a href="/uni/findFor" target="myframe" title="学校管理">学校管理</a></li>
                    <li><a href="/spe/findFor" target="myframe" title="专业管理">专业管理</a></li>
                    <li><a href="/dor/findFor" target="myframe" title="宿舍管理">宿舍管理</a></li>
                    <li><a href="/parameter/findFor" target="myframe" title="系统参数">系统参数</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-picture">
            <dt><i class="Hui-iconfont">&#xe613;</i> 学员管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a href="/studentAccount/toStudentAccountList" target="myframe" title="学员信息管理">学员信息</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-product">
            <dt><i class="Hui-iconfont">&#xe620;</i> 班级管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a href="/schoolclass/show_Schoolclass.do" target="myframe" title="班级管理">班级信息</a></li>
                    <li><a href="/timecard/_list.do" target="myframe" title="考勤管理">考勤管理</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-comments">
            <dt><i class="Hui-iconfont">&#xe622;</i> 课程管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a href="/technologyDirection/show_techdirect.do" target="myframe" title="技术方向">技术方向</a></li>
                    <li><a href="/knowledgeSection/show_knowSection.do:;" target="myframe" title="知识分节">知识分节</a></li>
                    <li hidden><a href="/course/show_course.do" title="原始课程" target="myframe" >原始课程</a></li>
                    <li><a href="/knowledgePoint/show_knowpoint.do" target="myframe" title="知识点维护">知识点维护</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-member">
            <dt><i class="Hui-iconfont">&#xe60d;</i> 教学管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <%--<li><a href="javascript:;" target="myframe" title="教学任务书">教学任务书</a></li>
                    <li><a href="/teachArrangeMent/toTeachArrangeMentList" title="教学任务书" target="myframe">授课安排</a></li>
                    <li><a href="/teacherWeekly/toTeacherWeekly" target="myframe" title="讲师周报">讲师周报</a></li>
                    <li><a href="/studentWeekly/toStudentWeeklyList" target="myframe" title="学生周报">学生周报</a></li>
                    <li><a href="/interview/show_interview.do" target="myframe" title="班主任访谈">班主任访谈</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-reply">
            <dt><i class="Hui-iconfont">&#xe616;</i> 答辩管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a href="/studentGraduateExam/show_graduateExam.do" target="myframe" title="毕业答辩">毕业答辩</a></li>
                </ul>
            </dd>
        </dl>--%>
    <div class="menu_dropdown bk_2" id="menuVue">
            <dl v-for="parMenu in parMenuList">
                <dt><a :href='"${pageContext.request.contextPath}"+parMenu.function_Url' target="myframe">
                    <i class="Hui-iconfont">&#xe616;</i>{{parMenu.function_Name}}<%--<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>--%>
                </a></dt>
                <%--<dd>
                    <ul>
                        <li v-for="item in parMenu.itemLi">
                            <a v-bind="{href:item.function_Url,title:item.function_Name}" target="myframe">{{item.function_Name}}</a>
                        </li>
                    </ul>
                </dd>--%>
            </dl>
    </div>
</aside>
<!--/_menu 作为公共模版分离出去-->
<section class="Hui-article-box">
        <iframe src="${pageContext.request.contextPath}/employee/findFor" frameborder="0" name="myframe" height="100%" width="100%" id="myiframe" iframeborder="0"></iframe>
</section>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/messages_zh.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/lib/vue/vue.js"></script>

<script type="text/javascript">
    var vm = new Vue({
        el: '#menuVue',
        data:{
            parMenuList:[]
        },
        mounted:function(){
            this.findMenuList();    //执行methods里面的定义的方法，获取数据和page信息。
        },
        methods: {
            findMenuList: function () {
                var lest = this;
                $.ajax({
                    url: "${pageContext.request.contextPath}/fun/findFunctionList",
                    type: "post",
                    data: {
                        send: null
                    },
                    success: function (result) {
                        var arr = new Array();
                        for (var i = 0;i<result.length;i++){
                            if(result[i].parent_Function_id == 0){
                                arr.push(result[i]);
                            }
                        }
                        for(var i = 0;i<arr.length;i++){
                            var cArr = new Array();
                            for(var j = 0;j<result.length;j++){
                                if(arr[i].function_id == result[j].parent_Function_id){
                                    cArr.push(result[j]);
                                }
                            }
                            arr[i].itemLi = cArr;
                        }
                        lest.$set(vm, 'parMenuList', arr);
                    }
                })
            }
        }
    });
    function admin_permission_edit(title,url,w,h){
        url = "${pageContext.request.contextPath}/login/loginEmployee";
        title = "个人信息";
        w = 470;
        h = 470;
        layer_show(title,url,w,h);
    }

    function admin_permission_pwd(title,url,w,h){
        url = "${pageContext.request.contextPath}/login/loginPwd";
        title = "修改密码";
        w = 470;
        h = 470;
        layer_show(title,url,w,h);
    }
</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui.admin/js/H-ui.admin.page.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.js"></script>
</body>
</html>
