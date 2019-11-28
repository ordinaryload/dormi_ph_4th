<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2019/10/23
  Time: 21:02
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
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <script src="/js/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" href="/css/x-admin.css" media="all">
</head>
<style>
    .inputcss
    {
        width:500px;
        height:400px;
    }
</style>
<body>
<div class="x-body">
    <form class="layui-form">
        <div class="layui-form-item">
            <label for="noticeTitle" class="layui-form-label">
                <span class="x-red">*</span>公告标题
            </label>
            <div class="layui-input-inline">
                <input type="text" id="noticeTitle" name="noticeTitle" value="${oneNotice.noticeTitle}" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="noticeDesc" class="layui-form-label">
                <span class="x-red">*</span>简要描述
            </label>
            <div class="layui-input-inline">
                <input type="text" id="noticeDesc" value="${oneNotice.noticeDesc}" name="noticeDesc" class="inputcss" width="1000px">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="publishNotice" class="layui-form-label">
                <span class="x-red">*</span>
            </label>
            <input type="button" onclick="updateNotice()" class="layui-btn layui-btn-normal layui-btn-radius" id="publishNotice" value="发布公告">
        </div>
    </form>
</div>
<script src="/lib/layui/layui.js" charset="utf-8">
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
    function CheckinnerHTML(sl) {
        var s="公告:";
        return s+s1;
    }
    function updateNotice(){
        var noticeTitle = $("#noticeTitle").val();
        var noticeTitle2 = CheckinnerHTML(noticeTitle);
        console.log(noticeTitle2);
        var noticeDesc = $("#noticeDesc").val();
        var noticeDesc2 = CheckinnerHTML(noticeDesc);
        var json = {"noticeId":${oneNotice.noticeId},"noticeTitle":noticeTitle2,"noticeDesc":noticeDesc2};
        $.ajax(
            {
                // cache:true,
                url:'/webNotice/updateNotice',
                type:'post',
                async:false,
                contentType: "application/json;charset=UTF-8",
                data:JSON.stringify(json),
                dataType:'json',
                success:function (data) {
                    if(data.state == 0){
                        alert("输入错误，请重新输入");
                    }else {
                        alert("修改成功！");
                    }
                },
                error:function () {
                    alert("发生错误")

                }

            }

        );

    }


</script>

</body>

</html>
