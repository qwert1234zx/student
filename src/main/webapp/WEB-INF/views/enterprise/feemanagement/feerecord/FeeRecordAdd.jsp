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
	<title>添加企业费用记录</title>
</head>
<body>
<article class="cl pd-20" class="pos-ab">
	<div class="form form-horizontal" >
		
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>结余：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Balance' maxlength='10' style='width:120px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>支出：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Expense' maxlength='10' style='width:120px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>收入：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Income' maxlength='10' style='width:120px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>收支时间：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='RecordDate' maxlength='10' style='width:120px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>所属企业：</label>
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
			name:'结余',
			id:'Balance',
			reg:['NotNull','MaxLength=10']
		},
		{
			name:'支出',
			id:'Expense',
			reg:['MaxLength=10']
		},
		{
			name:'收入',
			id:'Income',
			reg:['MaxLength=10']
		},
		{
			name:'收支时间',
			id:'RecordDate',
			reg:['NotNull','MaxLength=10']
		},
		{
			name:'所属企业',
			id:'EnterpriseID',
			reg:['NotNull','MaxLength=10']
		}

    ];
	
    function submit() {
		if(validate(regList)){
			//从各字段取数据拼接Json字符串
			
			var oBalance = $('#Balance').val();
			var oExpense = $('#Expense').val();
			var oIncome = $('#Income').val();
			var oRecordDate = $('#RecordDate').val();
			var oEnterpriseID = $('#EnterpriseID').val();

            var entity = {
                
				Balance: oBalance,
				Expense: oExpense,
				Income: oIncome,
				RecordDate: oRecordDate,
				EnterpriseID: oEnterpriseID

            }

            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/enterprise/feemanagement/feerecord/insert",
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