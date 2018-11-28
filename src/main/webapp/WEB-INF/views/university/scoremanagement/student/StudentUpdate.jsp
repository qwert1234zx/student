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
	<title>修改学生</title>
</head>
<body>
<article class="cl pd-20" class="pos-ab">
	<div class="form form-horizontal" >
		<input type="hidden" class="input-text" id="StudentId" maxlength="10" style="width:120px" value="${Student.studentID}">
		
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>密码：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Password' maxlength='30' style='width:360px' value='${Student.password}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>手机号：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Mobile' maxlength='11' style='width:132px' value='${Student.mobile}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>身份证号：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='IDNumber' maxlength='18' style='width:216px' value='${Student.iDNumber}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>学号：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='StudentNo' maxlength='20' style='width:240px' value='${Student.studentNo}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>毕业年份：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='GraduationYear' maxlength='10' style='width:120px' value='${Student.graduationYear}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>年级：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Grade' maxlength='10' style='width:120px' value='${Student.grade}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>性别：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='Sex' maxlength='10' style='width:120px' value='${Student.sex}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>籍贯：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='ProvinceID' maxlength='10' style='width:120px' value='${Student.provinceID}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>学生姓名：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='StudentName' maxlength='30' style='width:360px' value='${Student.studentName}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>所属方向：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='DirectionID' maxlength='10' style='width:120px' value='${Student.directionID}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>所属专业：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='SpecialityID' maxlength='10' style='width:120px' value='${Student.specialityID}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'>所属学院：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='AcademyID' maxlength='10' style='width:120px' value='${Student.academyID}'></div>
		</div>
		<div class='row cl'>
			<label class='form-label col-xs-4 col-sm-2'><span class='c-red'>*</span>所属学校：</label>
			<div class='formControls col-xs-8 col-sm-9'><input type='text' class='input-text' id='UniversityID' maxlength='10' style='width:120px' value='${Student.universityID}'></div>
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
			name:'密码',
			id:'Password',
			reg:['NotNull','MaxLength=30']
		},
		{
			name:'手机号',
			id:'Mobile',
			reg:['MaxLength=11']
		},
		{
			name:'身份证号',
			id:'IDNumber',
			reg:['MaxLength=18']
		},
		{
			name:'学号',
			id:'StudentNo',
			reg:['NotNull','MaxLength=20']
		},
		{
			name:'毕业年份',
			id:'GraduationYear',
			reg:['MaxLength=10']
		},
		{
			name:'年级',
			id:'Grade',
			reg:['NotNull','MaxLength=10']
		},
		{
			name:'性别',
			id:'Sex',
			reg:['NotNull','MaxLength=10']
		},
		{
			name:'籍贯',
			id:'ProvinceID',
			reg:['NotNull','MaxLength=10']
		},
		{
			name:'学生姓名',
			id:'StudentName',
			reg:['NotNull','MaxLength=30']
		},
		{
			name:'所属方向',
			id:'DirectionID',
			reg:['MaxLength=10']
		},
		{
			name:'所属专业',
			id:'SpecialityID',
			reg:['NotNull','MaxLength=10']
		},
		{
			name:'所属学院',
			id:'AcademyID',
			reg:['MaxLength=10']
		},
		{
			name:'所属学校',
			id:'UniversityID',
			reg:['NotNull','MaxLength=10']
		}

    ];
	
    function submit() {
        if (validate(regList)) {
            //从各字段取数据拼接Json字符串
            var oStudentId= StudentId.value;
			
			var oPassword = $('#Password').val();
			var oMobile = $('#Mobile').val();
			var oIDNumber = $('#IDNumber').val();
			var oStudentNo = $('#StudentNo').val();
			var oGraduationYear = $('#GraduationYear').val();
			var oGrade = $('#Grade').val();
			var oSex = $('#Sex').val();
			var oProvinceID = $('#ProvinceID').val();
			var oStudentName = $('#StudentName').val();
			var oDirectionID = $('#DirectionID').val();
			var oSpecialityID = $('#SpecialityID').val();
			var oAcademyID = $('#AcademyID').val();
			var oUniversityID = $('#UniversityID').val();

            var entity = {
                StudentId:oStudentId,
                
				Password: oPassword,
				Mobile: oMobile,
				IDNumber: oIDNumber,
				StudentNo: oStudentNo,
				GraduationYear: oGraduationYear,
				Grade: oGrade,
				Sex: oSex,
				ProvinceID: oProvinceID,
				StudentName: oStudentName,
				DirectionID: oDirectionID,
				SpecialityID: oSpecialityID,
				AcademyID: oAcademyID,
				UniversityID: oUniversityID

            }

            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/university/scoremanagement/student/update",
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