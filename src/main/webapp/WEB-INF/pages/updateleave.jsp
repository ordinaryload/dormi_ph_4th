<%--
  Created by IntelliJ IDEA.
  User: 许你长欢
  Date: 2019/10/23
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>
        分数信息修改
    </title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="./css/x-admin.css" media="all">
    <link rel="shortcut icon" type="image/x-icon" href="images/logo.ico" />
</head>
<body>
<div class="x-nav">
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="javascript:location.replace(location.href);" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
    <table class="layui-table">
        <thead>
        <tr>
            <th>
                寝室号
            </th>
            <th>
                修改分数
            </th>
            <th>

                修改
            </th>
        </tr>
        </thead>
        <tbody id="x-link">
        <tr>
            <td>
                ${dormNumber}
            </td>
            <td>
                <input type="text" id="dormScore">
            </td>
            <td>
               <span class="layui-btn layui-btn-normal layui-btn-mini" onclick="updateScore()">
                 确定修改
               </span>
            </td>
        </tr>
        </tbody>
    </table>

    <div id="page"></div>
</div>
<script src="./lib/layui/layui.js" charset="utf-8"></script>
<script src="./js/x-layui.js" charset="utf-8"></script>
<script>
    layui.use(['element','laypage','layer','form'], function(){
        $ = layui.jquery;//jquery
        lement = layui.element();//面包导航
        laypage = layui.laypage;//分页
        layer = layui.layer;//弹出层
        form = layui.form();//弹出层


    })



    //以上模块根据需要引入

    //批量删除提交
    function delAll () {
        layer.confirm('确认要删除吗？',function(index){
            //捉到所有被选中的，发异步进行删除
            layer.msg('删除成功', {icon: 1});
        });
    }


    /*删除*/
    function commemt_del(obj,id){
        layer.confirm('确认要删除吗？',function(index){
            //发异步删除数据
            $(obj).parents("tr").remove();
            layer.msg('已删除!',{icon:1,time:1000});
        });
    }
</script>
<script>
    var _hmt = _hmt || [];
    (function() {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();
</script>

<script type="text/javascript">
    function updateScore(){
        var message = {"dormNumber":"${dormNumber}","evaluationScore":$("#dormScore").val()};
        var json = JSON.stringify(message);
        console.log(json);
        $.ajax(
            {
                url:'/webEvaluation/updateEvaluation',
                type:'post',
                async:false,
                contentType: "application/json;charset=UTF-8",
                data:json,
                dataType:'json',
                success:function (data) {
                    console.log("---------------------");
                    console.log(data.state);

                    if(data.state == 1){
                        location.href = '/evaluation.jsp';
                    }else {
                        alert("修改失败，请重新输入");
                    }

                },
                error:function () {
                    alert("修改失败")

                }
            }
        );
    }

</script>
</body>
</html>
