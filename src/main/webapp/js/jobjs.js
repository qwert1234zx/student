/**
 * Created by dc on 2018/10/10.
 */
function nas() {
    var s1=document.getElementById("typenumnew");
    var o1s=document.getElementsByName("o1");
    var s2=document.getElementById("typenum");
    var arrnew=$("#typenumnew").val();
    var options=[];
    for(var k=0;k<s1.length;){
        if(s1[k].selected){
            // arr.push(s1[k].value);
            options.push(s1[k].label);
            s1.removeChild(o1s[k]);
        }
        else k++;
    }
    for(j=0;j<arrnew.length;j++){
        var htmls="";
        htmls+="<option value='"+arrnew[j]+"' name='o11' selected='selected'>"+options[j]+"</option>";
        s2.innerHTML+=htmls;
    }
}

function nbs() {
    var s1=document.getElementById("typenumnew");
    var o1s=document.getElementsByName("o11");
    var s2=document.getElementById("typenum");
    var arr=[];
    var options=[];
    for(var k=0;k<s2.length;){
        if(s2[k].selected){
            // alert(s1[k].value);
            options.push(s2[k].label);
            arr.push(s2[k].value);
            s2.removeChild(o1s[k]);
        }
        else k++;
    }
    for(j=0;j<arr.length;j++){
        var htmls="";
        htmls+="<option value='"+arr[j]+"' name='o1'>"+options[j]+"</option>";
        s1.innerHTML+=htmls;
    }
}
function addIndustry(){
    var s1=document.getElementById("typenumlower");
    var o1s=document.getElementsByName("o2");
    var s2=document.getElementById("typenum1");
    var arrnew=$("#typenumlower").val();
    var options=[];
    for(var k=0;k<s1.length;){
        if(s1[k].selected){
            // arr.push(s1[k].value);
            options.push(s1[k].label);
            s1.removeChild(o1s[k]);
        }
        else k++;
    }
    for(j=0;j<arrnew.length;j++){
        var htmls="";
        htmls+="<option value='"+arrnew[j]+"' name='o22' selected='selected'>"+options[j]+"</option>";
        s2.innerHTML+=htmls;
    }

}

function removeIndustry() {
    var s1=document.getElementById("typenumlower");
    var o1s=document.getElementsByName("o22");
    var s2=document.getElementById("typenum1");
    var arr=[];
    var options=[];
    for(var k=0;k<s2.length;){
        if(s2[k].selected){
            // alert(s1[k].value);
            options.push(s2[k].label);
            arr.push(s2[k].value);
            s2.removeChild(o1s[k]);
        }
        else k++;
    }
    for(j=0;j<arr.length;j++){
        var htmls="";
        htmls+="<option value='"+arr[j]+"' name='o2'>"+options[j]+"</option>";
        s1.innerHTML+=htmls;
    }
}

function addJob(){
    var s1=document.getElementById("typenum2lower");
    var o1s=document.getElementsByName("o3");
    var s2=document.getElementById("typenum2");
    var arrnew=$("#typenum2lower").val();
    var options=[];
    for(var k=0;k<s1.length;){
        if(s1[k].selected){
            // arr.push(s1[k].value);
            options.push(s1[k].label);
            s1.removeChild(o1s[k]);
        }
        else k++;
    }
    for(j=0;j<arrnew.length;j++){
        var htmls="";
        htmls+="<option value='"+arrnew[j]+"' name='o33' selected='selected'>"+options[j]+"</option>";
        s2.innerHTML+=htmls;
    }

}

function removeJob() {
    var s1=document.getElementById("typenum2lower");
    var o1s=document.getElementsByName("o33");
    var s2=document.getElementById("typenum2");
    var arr=[];
    var options=[];
    for(var k=0;k<s2.length;){
        if(s2[k].selected){
            // alert(s1[k].value);
            options.push(s2[k].label);
            arr.push(s2[k].value);
            s2.removeChild(o1s[k]);
        }
        else k++;
    }
    for(j=0;j<arr.length;j++){
        var htmls="";
        htmls+="<option value='"+arr[j]+"' name='o3'>"+options[j]+"</option>";
        s1.innerHTML+=htmls;
    }
}

function addEnterpriseType(){
    var s1=document.getElementById("typenum3lower");
    var o1s=document.getElementsByName("o4");
    var s2=document.getElementById("typenum3");
    var arrnew=$("#typenum3lower").val();
    var options=[];
    for(var k=0;k<s1.length;){
        if(s1[k].selected){
            // arr.push(s1[k].value);
            options.push(s1[k].label);
            s1.removeChild(o1s[k]);
        }
        else k++;
    }
    for(j=0;j<arrnew.length;j++){
        var htmls="";
        htmls+="<option value='"+arrnew[j]+"' name='o44' selected='selected'>"+options[j]+"</option>";
        s2.innerHTML+=htmls;
    }

}

function removeEnterpriseType() {
    var s1=document.getElementById("typenum3lower");
    var o1s=document.getElementsByName("o44");
    var s2=document.getElementById("typenum3");
    var arr=[];
    var options=[];
    for(var k=0;k<s2.length;){
        if(s2[k].selected){
            // alert(s1[k].value);
            options.push(s2[k].label);
            arr.push(s2[k].value);
            s2.removeChild(o1s[k]);
        }
        else k++;
    }
    for(j=0;j<arr.length;j++){
        var htmls="";
        htmls+="<option value='"+arr[j]+"' name='o4'>"+options[j]+"</option>";
        s1.innerHTML+=htmls;
    }
}
// function inArr(value,arr) {
//     var index=$.inArray(value,arr);
//     if(index>=0)
//         return true;
//     else return false;
// }
