/**
 * Created by Gangdan on 2017/4/19.
 */
function showTip(title,id){
    layer.tips(title,"#" + id,{tips : [3,"#5a98de"]})
};

/*var regList = [
    {
        name : 'name',
        id : 'name',
        reg : ['notnull','textlength','textnumber','textcn']
    }
];*/
var validate = function(regList, doc){
   /* debugger*/
    var __doc__ = doc || document;
    for(var i = 0,l = regList.length;i < l;i = i + 1){
        var obj = regList[i];
        var objVal = __doc__.getElementById(obj.id).value;
        var objList = obj.reg;
        for(var j = 0,ll = objList.length;j < ll;j = j + 1){
            if(objList[j] === 'notnull'){
                if(objVal === ''){
                    showTip(obj.name + '不能为空',obj.id);
                    //window.scrollTo(0,$("#"+obj.id+"").offset().top);
                    return false;
                }
            }else if(objList[j] === 'textlength'){
                if(objVal.length<3 || objVal.length>32 ){
                    showTip(obj.name + '名称过长或过短',obj.id);
                    return false;
                }
            }else if(objList[j] === 'textnumber'){
                var reg = /^[0-9]\d*$/;
                if(objVal!==""){
                    if(!reg.test(objVal)){
                        showTip(obj.name + '只能为数字',obj.id);
                        return false;
                    }
                }
            }else if(objList[j] === 'textcn'){
                if(!/[\u4e00-\u9fa5]/.test(objVal)){
                    showTip(obj.name + '只能为汉字',obj.id);
                    return false;
                }
            }else if(objList[j] === 'notspecial'){
                var special = /(?=[\x21-\x7e]+)[^A-Za-z0-9]/;
                if(special.test(objVal)){
                    showTip(obj.name + '内部含有非法字符',obj.id);
                    return false;
                }
            }else if(objList[j] === 'namelength'){
                if(objVal.length<2 || objVal.length>6){
                    showTip(obj.name+ '请输入正确姓名',obj.id);
                    return false;
                }
            }else if(objList[j] === 'meID'){
                if(objVal!==""){
                    if(!/^(\d{15}$|^\d{18}$|^\d{17}(\d|X|x))$/.test(objVal)){
                        showTip(obj.name + '输入有误！',obj.id);
                        return false;
                    }
                }

            }else if(objList[j] === 'phone'){
                if(!/^(\(\d{3,4}\)|\d{3,4}-|\s)?\d{7,14}$/.test(objVal)){
                    if(!/^1[34578]\d{9}$/.test(objVal)){
                        showTip(obj.name + '填写有误!',obj.id);
                        return false;
                    }
                }

            }else if(objList[j] === 'email'){
                if(objVal!==""){
                    if(!/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/.test(objVal)){
                        showTip(obj.name + '填写有误!',obj.id);
                        return false;
                    }
                }

            }else if(objList[j] === 'qq'){
                if(!/^\d{5,10}$/.test(objVal)){
                    showTip(obj.name + '填写有误!',obj.id);
                    return false;
                }
            }else if(objList[j] === 'mobile'){
                if(!/^1[34578]\d{9}$/.test(objVal)){
                    showTip(obj.name + '填写有误!',obj.id);
                    return false;
                }
            }else if(objList[j] === 'notcn'){
                if(/[\u4e00-\u9fa5]/.test(objVal)){
                    showTip(obj.name + '是由字母，数字组成的，和符号组成的',obj.id);
                    return false;
                }
            }else if(objList[j] === 'minlength'){
                if(objVal.length>2){
                    showTip(obj.name + '输入错误！',obj.id);
                    return false;
                }
            }else if(objList[j] === 'workLength'){
                debugger
                if(!(1<=objVal && objVal<=18)){
                    showTip(obj.name + '介于1-18数字，例如：1,2,3,4,5,6,7,8,9，10,11,12,13，14,15,16,17,18',obj.id);
                    return false;
                }
            }else if(objList[j] === 'qqLength'){
                if(!(objVal.length<=12)){
                    showTip(obj.name + '最大长度不能超过12位',obj.id);
                    return false;
                }
            }else if(objList[j] === 'lastNumber'){
                if(!/.*[0-9]{8}$/.test(objVal)){
                    showTip(obj.name + '规则不符，例如：java培训班20170903',obj.id);
                    return false;
                }
            }

        }
    }
    return true;
}
$(".c-red").parent().next().find("input,select").on("blur",function(){
    for(var i=0;i<regList.length;i++){
        if(regList[i].id==$(this).attr("id")){
            var reg = [];
            reg.push(regList[i]);
            validate(reg);
            break;
        }
    }
})