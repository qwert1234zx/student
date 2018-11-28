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
	<title>修改面试记录</title>
</head>
<body>
<article class="cl pd-20" class="pos-ab">
	<div class="form form-horizontal" >
		<input type="hidden" class="input-text" id="InterviewRecordId" maxlength="10" style="width:120px" value="${InterviewRecord.interviewRecordID}">
		
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>学生说明：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='StudentRemark' maxlength='2000' style='width:24000px' value='${InterviewRecord.studentRemark}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>学生评价：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='StudentRate' maxlength='10' style='width:120px' value='${InterviewRecord.studentRate}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>面试官评价：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='InterviewerRemark' maxlength='1000' style='width:12000px' value='${InterviewRecord.interviewerRemark}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>面试官结论：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='InterviewerConclusion' maxlength='10' style='width:120px' value='${InterviewRecord.interviewerConclusion}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>面试官手机：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='InterviewerMobile' maxlength='11' style='width:132px' value='${InterviewRecord.interviewerMobile}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>面试官：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Interviewer' maxlength='20' style='width:240px' value='${InterviewRecord.interviewer}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>面试时间：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='InterviewTime' maxlength='10' style='width:120px' value='${InterviewRecord.interviewTime}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>候选人ID：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='CandidateID' maxlength='10' style='width:120px' value='${InterviewRecord.candidateID}'></div>
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
			name:'学生说明',
			id:'StudentRemark',
			reg:['MaxLength=2000']
		},
		{
			name:'学生评价',
			id:'StudentRate',
			reg:['MaxLength=10']
		},
		{
			name:'面试官评价',
			id:'InterviewerRemark',
			reg:['MaxLength=1000']
		},
		{
			name:'面试官结论',
			id:'InterviewerConclusion',
			reg:['NotNull','MaxLength=10']
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
			name:'面试时间',
			id:'InterviewTime',
			reg:['NotNull','MaxLength=10']
		},
		{
			name:'候选人ID',
			id:'CandidateID',
			reg:['NotNull','MaxLength=10']
		}

    ];
	
    function submit() {
        if (validate(regList)) {
            //从各字段取数据拼接Json字符串
            var oInterviewRecordId= InterviewRecordId.value;
			
			var oStudentRemark = $('#StudentRemark').val();
			var oStudentRate = $('#StudentRate').val();
			var oInterviewerRemark = $('#InterviewerRemark').val();
			var oInterviewerConclusion = $('#InterviewerConclusion').val();
			var oInterviewerMobile = $('#InterviewerMobile').val();
			var oInterviewer = $('#Interviewer').val();
			var oInterviewTime = $('#InterviewTime').val();
			var oCandidateID = $('#CandidateID').val();

            var entity = {
                InterviewRecordId:oInterviewRecordId,
                
				StudentRemark: oStudentRemark,
				StudentRate: oStudentRate,
				InterviewerRemark: oInterviewerRemark,
				InterviewerConclusion: oInterviewerConclusion,
				InterviewerMobile: oInterviewerMobile,
				Interviewer: oInterviewer,
				InterviewTime: oInterviewTime,
				CandidateID: oCandidateID

            }

            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/enterprise/interviewmanagement/interviewrecord/update",
                data: {"entity": JSON.stringify(entity)},	//参数取值
                success: function (result) {
                    if (result > 0) {
                        parent.layer.msg('修改成功！', {icon: 1, time: 2000});
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