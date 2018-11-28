<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
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
	<title>添加面试记录</title>
</head>
<body>
<article class="cl pd-20" class="pos-ab">
	<div class="form form-horizontal" >
		
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>面试结论：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='InterviewResult' maxlength='1000' style='width:12000px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>面试官手机：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='InterviewerMobile' maxlength='11' style='width:132px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>面试官：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Interviewer' maxlength='20' style='width:240px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>面试状态：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='InterviewStatus' maxlength='10' style='width:120px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>面试时间：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='InterviewTime' maxlength='10' style='width:120px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>学生ID：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='StudentID' maxlength='10' style='width:120px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>企业ID：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='EnterpriseID' maxlength='10' style='width:120px'></div>
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
			name:'面试结论',
			id:'InterviewResult',
			reg:['MaxLength=1000']
		},
		{
			name:'面试官手机',
			id:'InterviewerMobile',
			reg:['MaxLength=11']
		},
		{
			name:'面试官',
			id:'Interviewer',
			reg:['MaxLength=20']
		},
		{
			name:'面试状态',
			id:'InterviewStatus',
			reg:['NotNull','MaxLength=10']
		},
		{
			name:'面试时间',
			id:'InterviewTime',
			reg:['NotNull','MaxLength=10']
		},
		{
			name:'学生ID',
			id:'StudentID',
			reg:['NotNull','MaxLength=10']
		},
		{
			name:'企业ID',
			id:'EnterpriseID',
			reg:['NotNull','MaxLength=10']
		}

    ];
	
    function submit() {
		if(validate(regList)){
			//从各字段取数据拼接Json字符串
			
			var oInterviewResult = $('#InterviewResult').val();
			var oInterviewerMobile = $('#InterviewerMobile').val();
			var oInterviewer = $('#Interviewer').val();
			var oInterviewStatus = $('#InterviewStatus').val();
			var oInterviewTime = $('#InterviewTime').val();
			var oStudentID = $('#StudentID').val();
			var oEnterpriseID = $('#EnterpriseID').val();

            var entity = {
                
				InterviewResult: oInterviewResult,
				InterviewerMobile: oInterviewerMobile,
				Interviewer: oInterviewer,
				InterviewStatus: oInterviewStatus,
				InterviewTime: oInterviewTime,
				StudentID: oStudentID,
				EnterpriseID: oEnterpriseID

            }

            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/university/statistics/interviewrecord/insert",
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
		}
    }
</script>
</body>
</html>