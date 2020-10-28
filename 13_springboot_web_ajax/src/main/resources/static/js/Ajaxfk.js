(function () {//实现自调用
    let ajax=function () {};//构造函数
    ajax.prototype={//方法写入原型对象
        //封装Ajax.POST请求
        doAjaxPost:function (url,params,then) {
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
    },
        //封装Ajax.GET请求
        doAjaxGet:function (url,params,then) {
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
    }
    //创建全局变量
    //新创建的对象也拥有prototype对象，所有也拥有其中的方法
    window.Ajax=new ajax();

})()







