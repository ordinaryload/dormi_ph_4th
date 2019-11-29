
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
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="/css/x-admin.css" media="all">
</head>
<body>
<div class="layui-layout layui-layout-admin">
    <div class="layui-header header header-demo">
        <div class="layui-main">
            <text class="logo">
                DorMi
            </text>
            <ul class="layui-nav" lay-filter="">
                <li class="layui-nav-item"><img src="../../images/logo.png" class="layui-circle" style="border: 2px solid #A9B7B7;" width="35px" alt=""></li>
                <li class="layui-nav-item">
                    <a href="javascript:;">用户</a>
                    <dl class="layui-nav-child"> <!-- 二级菜单 -->
                        <dd><a href="/webUser/webToLogin">切换帐号</a></dd>
                        <dd><a href="/webUser/webToLogin">退出</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>
    <div class="layui-side layui-bg-black x-side">
        <div class="layui-side-scroll">
            <ul class="layui-nav layui-nav-tree site-demo-nav" lay-filter="side">
                <li class="layui-nav-item">
                    <a class="javascript:;" href="javascript:;">
                        <i class="layui-icon" style="top: 3px;">&#xe607;</i><cite>评分</cite>
                    </a>
                    <dl class="layui-nav-child">
                        <dd class="">
                            <a href="javascript:;" _href="./addevaluation.html">
                                <cite>登记分数</cite>
                            </a>
                        </dd>

                        <dd class="">
                            <a href="javascript:;" _href="./evaluation.jsp">
                                <cite>查看分数</cite>
                            </a>
                        </dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a class="javascript:;" href="javascript:;">
                        <i class="layui-icon" style="top: 3px;">&#xe634;</i><cite>公告</cite>
                    </a>
                    <dl class="layui-nav-child">
                        <dd class="">
                            <a href="javascript:;" _href="./addnotice.html">
                                <cite>写公告</cite>
                            </a>
                        </dd>
                        <dd class="">
                            <a href="javascript:;" _href="./toNotice">
                                <cite>查看公告</cite>
                            </a>
                        </dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a class="javascript:;" href="javascript:;">
                        <i class="layui-icon" style="top: 3px;">&#xe606;</i><cite>出寝信息备注</cite>
                    </a>
                    <dl class="layui-nav-child">
                        <dd class="">
                            <a href="javascript:;" _href="./registration.html">
                                <cite>查看备注信息</cite>
                            </a>
                        </dd>
                    </dl>
                </li>

                <li class="layui-nav-item">
                    <a class="javascript:;" href="javascript:;">
                        <i class="layui-icon" style="top: 3px;">&#xe629;</i><cite>请假</cite>
                    </a>
                    <dl class="layui-nav-child">
                        <dd class="">
                            <a href="javascript:;" _href="./askleave.html">
                                <cite>查看请假信息</cite>
                            </a>
                        </dd>
                    </dl>
                </li>

                <li class="layui-nav-item" style="height: 30px; text-align: center">
                </li>
            </ul>
        </div>

    </div>
    <div class="layui-tab layui-tab-card site-demo-title x-main" lay-filter="x-tab" lay-allowclose="true">
        <div class="x-slide_left"></div>
        <ul class="layui-tab-title">
            <li class="layui-this">
                我的信息
                <i class="layui-icon layui-unselect layui-tab-close">ဆ</i>
            </li>
        </ul>
        <div class="layui-tab-content site-demo site-demo-body">
            <div class="layui-tab-item layui-show">
                <iframe frameborder="0" src="/webUser/getInfo" class="x-iframe"></iframe>
            </div>
        </div>
    </div>
    <div class="site-mobile-shade">
    </div>
</div>
<script src="../../lib/layui/layui.js" charset="utf-8"></script>
<script src="../../js/x-admin.js"></script>
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
