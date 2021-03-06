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
	<title>修改省份</title>
</head>
<body>
<article class="cl pd-20" class="pos-ab">
	<div class="form form-horizontal" >
		<input type="hidden" class="input-text" id="ProvinceId" maxlength="10" style="width:120px" value="${Province.provinceID}">
		
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>名称：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='ProvinceName' maxlength='20' style='width:240px' value='${Province.provinceName}'></div>
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
			name:'名称',
			id:'ProvinceName',
			reg:['NotNull','MaxLength=20']
		}

    ];
	
    function submit() {
        if (validate(regList)) {
            //从各字段取数据拼接Json字符串
            var oProvinceId= ProvinceId.value;
			
			var oProvinceName = $('#ProvinceName').val();

            var entity = {
                ProvinceId:oProvinceId,
                
				ProvinceName: oProvinceName

            }

            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/enterprise/statistics/province/update",
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