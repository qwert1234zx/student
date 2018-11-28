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
	<title>添加企业</title>
</head>
<body>
<article class="cl pd-20" class="pos-ab">
	<div class="form form-horizontal" >
		
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>状态：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Status' maxlength='10' style='width:120px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>管理员密码：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Password' maxlength='32' style='width:384px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>管理员：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Manager' maxlength='20' style='width:240px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>企业营业执照：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Certification' maxlength='200' style='width:2400px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>经营范围：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='BusinessRange' maxlength='2000' style='width:24000px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>企业官网：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='WebSite' maxlength='300' style='width:3600px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>统一社会信用代码：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='IDNumber' maxlength='18' style='width:216px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>所属行业：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='IndustryID' maxlength='10' style='width:120px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>所属省份：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='ProvinceID' maxlength='10' style='width:120px'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>企业名称：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='EnterpriseName' maxlength='200' style='width:2400px'></div>
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
			name:'状态',
			id:'Status',
			reg:['NotNull','MaxLength=10']
		},
		{
			name:'管理员密码',
			id:'Password',
			reg:['MaxLength=32']
		},
		{
			name:'管理员',
			id:'Manager',
			reg:['MaxLength=20']
		},
		{
			name:'企业营业执照',
			id:'Certification',
			reg:['MaxLength=200']
		},
		{
			name:'经营范围',
			id:'BusinessRange',
			reg:['MaxLength=2000']
		},
		{
			name:'企业官网',
			id:'WebSite',
			reg:['MaxLength=300']
		},
		{
			name:'统一社会信用代码',
			id:'IDNumber',
			reg:['NotNull','MaxLength=18']
		},
		{
			name:'所属行业',
			id:'IndustryID',
			reg:['NotNull','MaxLength=10']
		},
		{
			name:'所属省份',
			id:'ProvinceID',
			reg:['NotNull','MaxLength=10']
		},
		{
			name:'企业名称',
			id:'EnterpriseName',
			reg:['NotNull','MaxLength=200']
		}

    ];
	
    function submit() {
		if(validate(regList)){
			//从各字段取数据拼接Json字符串
			
			var oStatus = $('#Status').val();
			var oPassword = $('#Password').val();
			var oManager = $('#Manager').val();
			var oCertification = $('#Certification').val();
			var oBusinessRange = $('#BusinessRange').val();
			var oWebSite = $('#WebSite').val();
			var oIDNumber = $('#IDNumber').val();
			var oIndustryID = $('#IndustryID').val();
			var oProvinceID = $('#ProvinceID').val();
			var oEnterpriseName = $('#EnterpriseName').val();

            var entity = {
                
				Status: oStatus,
				Password: oPassword,
				Manager: oManager,
				Certification: oCertification,
				BusinessRange: oBusinessRange,
				WebSite: oWebSite,
				IDNumber: oIDNumber,
				IndustryID: oIndustryID,
				ProvinceID: oProvinceID,
				EnterpriseName: oEnterpriseName

            }

            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/government/statistics/enterprise/insert",
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