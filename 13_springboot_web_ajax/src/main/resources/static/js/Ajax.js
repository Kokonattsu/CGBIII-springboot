//封装Ajax.POST请求
function doAjaxPost(url,params,then) {
    let xhr=new XMLHttpRequest();
    xhr.onreadystatechange=function () {
        if (xhr.readyState==4){
            if (xhr.status==200){
                then(xhr.responseText);
            }else{
                console.log("Ajax请求失败");
            }
        }
    }
    xhr.open("POST",url,true);
    xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
    xhr.send(params);
}

//封装Ajax.GET请求
function doAjaxGet(url,params,then) {
    let xhr=new XMLHttpRequest();
    xhr.onreadystatechange=function () {
        if (xhr.readyState==4){
            if (xhr.status==200){
                then(xhr.responseText);
            }else{
                console.log("Ajax请求失败");
            }
        }
    }
    xhr.open("GET",`${url}?${params}`,true);
    xhr.send(null);
}
