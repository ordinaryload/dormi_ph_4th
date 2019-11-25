<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2019/11/7
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>
        用户信息
    </title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="/css/x-admin.css" media="all">
    <link rel="stylesheet" href="/css/personinfo.css" media="all">
</head>
<body>
<div class="x-body">
    <blockquote class="layui-elem-quote" style="text-align: center;font-family:Georgia, 'Times New Roman', Times, serif;font-size: 20px;color:#86BBD4">
        Welcome to DorMi 宿舍管理系统！
    </blockquote>
    <p>登录次数：18 </p>
    <p>上次登录IP：222.35.131.79.1  上次登录时间： 2019-10-25 11:19:55</p>
    <hr>
    <form action="/Set/ProfileSubmit" id="myform" method="post">
        <table class="info_block" cellpadding="0" cellspacing="0">
            <tr>
                <td class="tr_title">
                    姓名：
                </td>
                <td class="tr_content">
                    <input class="tb_m" id="txt_name" name="RealName" type="text" value="${administrators.adminName}" />
                </td>

            </tr>
            <tr>
                <td class="tr_title">
                    工号：
                </td>
                <td class="tr_content">
                    <input class="tb_m" id="txt_no" name="Number" type="text" value="${administrators.adminCard}" />
                </td>

            </tr>
            <tr>
                <td class="tr_title">
                    宿舍楼：
                </td>
                <td class="tr_content">
                    <input class="tb_m" id="txt_louno" name="Louno" type="text" value="${administrators.adminBuilding}" />
                </td>

            </tr>
            <tr>
                <td class="tr_title">
                    手机号：
                </td>
                <td class="tr_content">
                    <input class="tb_m" id="txt_phone" name="Phone" type="text" value="${administrators.adminPhone}" />
                </td>

            </tr>

        </table>
        <div class="save_block">
            <input type="submit" class="btn_blue" name="btnSubmit" value="保存" onclick="return UpdateProfile();" id="btn_submit">
            <div class="text_red" style="height: 3em; line-height: 3em;">
                <span id="lit_tip"></span>
            </div>
        </div>
        <input name="__RequestVerificationToken" type="hidden" value="CfDJ8DeHXSeUWr9KtnvAGu7_dX_wDKUd83ztpD0CRMfzsVhXZNnglcTdxXyqtnl1ah8j2sQsVnDwgRiIMt1Rdt5KVRrShoSd5bx9q3pwRrfJGRgzn5ztjyDJ37KreTqt37k-24sG5Txb9D4GlKfbJB1dr3G4Uq_cUOpMQsWGF3K8fERcfsy6OTo0xByK_WFE_DPTQQ" /><input name="IsHome_RealName" type="hidden" value="false" /><input name="IsHome_Gender" type="hidden" value="false" /><input name="IsHome_Birthday" type="hidden" value="false" /><input name="IsHome_Hometown" type="hidden" value="false" /><input name="IsHome_Reside" type="hidden" value="false" /><input name="IsHome_Marriage" type="hidden" value="false" /><input name="IsHome_Position" type="hidden" value="false" /><input name="IsHome_Company" type="hidden" value="false" /><input name="IsHome_WorkStatus" type="hidden" value="false" />
    </form>



</div>


</div>
<div class="layui-footer footer footer-demo">
    <div class="layui-main">

        <p>
            <a href="/">
                Copyright ©2019 Dor-Mi v2.3 All Rights Reserved.
            </a>
        </p>

    </div>
</div>

<script type="text/javascript">

    function check(){
        // var datas = new Object();
        var flag = true;
        $.ajax(
            {
                // cache:true,
                url:'/webUser/webLogin',
                type:'post',
                async:false,
                data:{"adminCard":$("#adminCard").val(),"adminPassword":$("#adminPassword").val()},
                dataType:'json',
                success:function (data) {
                    if(data.state == 1){
                        location.href = "/home.jsp";
                    }else if(data.state == 0) {
                        alert("用户名或密码错误，请重新输入");
                    }

                }

            }

        );

    }


</script>
<script src="/lib/layui/layui.js" charset="utf-8"></script>
<script src="/js/x-admin.js"></script>
<script>
    var _hmt = _hmt || [];
    (function() {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();
</script>
</body>
</html>
