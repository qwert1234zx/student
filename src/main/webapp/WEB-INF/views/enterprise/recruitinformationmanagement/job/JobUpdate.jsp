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
	<title>修改招聘岗位</title>
</head>
<body>
<article class="cl pd-20" class="pos-ab">
	<div class="form form-horizontal" >
		<input type="hidden" class="input-text" id="JobId" maxlength="10" style="width:120px" value="${Job.jobID}">
		
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>截止日期：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='ExpirationDate' maxlength='10' style='width:120px' value='${Job.expirationDate}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>最高月薪：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='UpperSalary' maxlength='10' style='width:120px' value='${Job.upperSalary}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>最低月薪：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='LowerSalary' maxlength='10' style='width:120px' value='${Job.lowerSalary}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>人数：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='PersonNumber' maxlength='10' style='width:120px' value='${Job.personNumber}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>岗位要求：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Requirement' maxlength='2000' style='width:24000px' value='${Job.requirement}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>岗位职责：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Duty' maxlength='2000' style='width:24000px' value='${Job.duty}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>招聘岗位名称：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='JobName' maxlength='100' style='width:1200px' value='${Job.jobName}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>所属企业：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='EnterpriseID' maxlength='10' style='width:120px' value='${Job.enterpriseID}'></div>
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
			name:'截止日期',
			id:'ExpirationDate',
			reg:['NotNull','MaxLength=10']
		},
		{
			name:'最高月薪',
			id:'UpperSalary',
			reg:['MaxLength=10']
		},
		{
			name:'最低月薪',
			id:'LowerSalary',
			reg:['MaxLength=10']
		},
		{
			name:'人数',
			id:'PersonNumber',
			reg:['NotNull','MaxLength=10']
		},
		{
			name:'岗位要求',
			id:'Requirement',
			reg:['MaxLength=2000']
		},
		{
			name:'岗位职责',
			id:'Duty',
			reg:['MaxLength=2000']
		},
		{
			name:'招聘岗位名称',
			id:'JobName',
			reg:['NotNull','MaxLength=100']
		},
		{
			name:'所属企业',
			id:'EnterpriseID',
			reg:['NotNull','MaxLength=10']
		}

    ];
	
    function submit() {
        if (validate(regList)) {
            //从各字段取数据拼接Json字符串
            var oJobId= JobId.value;
			
			var oExpirationDate = $('#ExpirationDate').val();
			var oUpperSalary = $('#UpperSalary').val();
			var oLowerSalary = $('#LowerSalary').val();
			var oPersonNumber = $('#PersonNumber').val();
			var oRequirement = $('#Requirement').val();
			var oDuty = $('#Duty').val();
			var oJobName = $('#JobName').val();
			var oEnterpriseID = $('#EnterpriseID').val();

            var entity = {
                JobId:oJobId,
                
				ExpirationDate: oExpirationDate,
				UpperSalary: oUpperSalary,
				LowerSalary: oLowerSalary,
				PersonNumber: oPersonNumber,
				Requirement: oRequirement,
				Duty: oDuty,
				JobName: oJobName,
				EnterpriseID: oEnterpriseID

            }

            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/enterprise/recruitinformationmanagement/job/update",
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