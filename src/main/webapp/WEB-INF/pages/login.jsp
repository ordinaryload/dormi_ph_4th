<%--
  Created by IntelliJ IDEA.
  User: 许你长欢
  Date: 2019/10/23
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>
        DorMi
    </title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <script src="/js/jquery-3.2.1.min.js"></script>
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="/css/x-admin.css" media="all">
</head>

<!--<body style="background-color: #CFEDE9">-->
<body background="/images/bg.png" style="background-repeat: no-repeat;background-size: 100% 100%;background-attachment: fixed;">
<div class="x-box">
    <div class="x-top">
        <i class="layui-icon x-login-close">
            &#x1007;
        </i>
        <ul class="x-login-right">
            <li style="background-color: #E4F1F1;" color="#F1C85F">
            </li>
            <li style="background-color: #ABCCF4;" color="#EA569A">
            </li>
            <li style="background-color: #6A95B7;" color="#393D49">
            </li>
        </ul>
    </div>
    <div class="x-mid">
        <div class="x-avtar">
            <img src="/images/logo.png" alt="">
        </div>
        <div class="input">
            <form class="layui-form">
                <div class="layui-form-item x-login-box">
                    <label for="adminCard" class="layui-form-label">
                        <i class="layui-icon">&#xe612;</i>
                    </label>
                    <div class="layui-input-inline">
                        <!--<form action="">
                            <select name="user-name">
                            <option value="teacher">管理员</option>
                            <option value="suguan">宿管</option>
                            </select>
                        </form>-->
                        <input type="text" id="adminCard" name="adminCard" required=""
                               autocomplete="off"  placeholder="请输入工号" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item x-login-box">
                    <label for="adminPassword" class="layui-form-label">
                        <i class="layui-icon">&#xe628;</i>
                    </label>
                    <div class="layui-input-inline">
                        <input type="password" id="adminPassword" name="adminPassword" required=""
                               autocomplete="off" placeholder="请输入密码" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item" id="loginbtn"  >

                    <input type="button" value="登 录" class="layui-btn" onclick="check()">
                    <%--<button  class="layui-btn">
                        登 录
                    </button>--%>
                </div>
            </form>
        </div>
    </div>
</div>
<p style="color:#fff;text-align: center;">Copyright © 2017.Company name All rights X-admin </p>
<script src="/lib/layui/layui.js" charset="utf-8">
</script>



<!--<script>
    layui.use(['form'],
    function() {
        $ = layui.jquery;
        var form = layui.form(),
        layer = layui.layer;

        $('.x-login-right li').click(function(event) {
            color = $(this).attr('color');
            $('body').css('background-color', color);
        });

        //监听提交
        form.on('submit(save)',
        function(data) {
            console.log(data);
            layer.alert(JSON.stringify(data.field), {
              title: '最终的提交信息'
            },function  () {
                location.href = "./index.html";
            })
            return false;
        });

    });

</script>-->
</body>
<script type="text/javascript">

    function check(){

        var json = {"adminCard":$("#adminCard").val(),"adminPassword":$("#adminPassword").val()};
        $.ajax(
            {
                // cache:true,
                url:'/webUser/webLogin',
                type:'post',
                async:false,
                contentType: "application/json;charset=UTF-8",
                data:JSON.stringify(json),
                dataType:'json',
                success:function (data) {
                    console.log("------------------");
                    console.log(data.state);
                    if(data.state == 0){
                        alert("用户名或密码错误，请重新输入");
                    }else {
                        location.href = '${pageContext.request.contextPath}/toHome';
                    }
                },
                error:function () {
                    alert("发生错误")

                }

            }

        );

    }


</script>
</html>
