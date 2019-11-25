<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<p><a href="/test">测试</a></p>
<br/>
<br/>


<form action="/webNotice/publishNotice" method="post" enctype="multipart/form-data">
    <%--<input type="hidden" name="method" value="PUT">--%>
    <input type="file" id="ntFile" name="ntFile">
    <input type="submit" value="提交">
</form>



<%--<form action="/webEvaluation/insertEvaluation" method="post" enctype="multipart/form-data">
    <input type="hidden" name="method" value="PUT">
    <input type="file" id="ntFile" name="ntFile">
    <input type="submit" value="提交">
</form>--%>
</body>
</html>
