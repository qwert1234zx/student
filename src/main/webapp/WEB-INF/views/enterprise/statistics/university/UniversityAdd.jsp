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
	<title>添加学校</title>
</head>
<body>
<article class="cl pd-20" class="pos-ab">
	<div class="form form-horizontal" >
		
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>管理员密码：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Password' maxlength='32' style='width:384px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>学校管理员：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Manager' maxlength='20' style='width:240px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>学历：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Degree' maxlength='10' style='width:120px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>是否双一流：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='IsDFG' maxlength='10' style='width:120px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>是否211：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='IsTOO' maxlength='10' style='width:120px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>是否985：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='IsNEF' maxlength='10' style='width:120px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>学校简介：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Description' maxlength='1000' style='width:12000px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>学校名称：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='UniversityName' maxlength='60' style='width:720px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>所属省：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='ProvinceID' maxlength='10' style='width:120px'></div>
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
			name:'管理员密码',
			id:'Password',
			reg:['NotNull','MaxLength=32']
		},
		{
			name:'学校管理员',
			id:'Manager',
			reg:['NotNull','MaxLength=20']
		},
		{
			name:'学历',
			id:'Degree',
			reg:['NotNull','MaxLength=10']
		},
		{
			name:'是否双一流',
			id:'IsDFG',
			reg:['MaxLength=10']
		},
		{
			name:'是否211',
			id:'IsTOO',
			reg:['MaxLength=10']
		},
		{
			name:'是否985',
			id:'IsNEF',
			reg:['MaxLength=10']
		},
		{
			name:'学校简介',
			id:'Description',
			reg:['MaxLength=1000']
		},
		{
			name:'学校名称',
			id:'UniversityName',
			reg:['NotNull','MaxLength=60']
		},
		{
			name:'所属省',
			id:'ProvinceID',
			reg:['NotNull','MaxLength=10']
		}

    ];
	
    function submit() {
		if(validate(regList)){
			//从各字段取数据拼接Json字符串
			
			var oPassword = $('#Password').val();
			var oManager = $('#Manager').val();
			var oDegree = $('#Degree').val();
			var oIsDFG = $('#IsDFG').val();
			var oIsTOO = $('#IsTOO').val();
			var oIsNEF = $('#IsNEF').val();
			var oDescription = $('#Description').val();
			var oUniversityName = $('#UniversityName').val();
			var oProvinceID = $('#ProvinceID').val();

            var entity = {
                
				Password: oPassword,
				Manager: oManager,
				Degree: oDegree,
				IsDFG: oIsDFG,
				IsTOO: oIsTOO,
				IsNEF: oIsNEF,
				Description: oDescription,
				UniversityName: oUniversityName,
				ProvinceID: oProvinceID

            }

            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/enterprise/statistics/university/insert",
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