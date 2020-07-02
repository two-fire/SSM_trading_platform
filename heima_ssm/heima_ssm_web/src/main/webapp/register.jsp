<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/5/24
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>新用户注册</title>
    <head>
        <meta charset="utf-8">
        <title>注册</title>
        <link rel="stylesheet" type="text/css" href="css/common.css">
        <link rel="stylesheet" href="css/register.css">
        <!--导入jquery-->
        <script src="js/jquery-3.3.1.js"></script>
    </head>
<body>
<!--引入头部-->
<div id="header"></div>
<!-- 头部 end -->
<div class="rg_layout">
    <div class="rg_form clearfix">
        <div class="rg_form_left">
            <p>新用户注册</p>
            <p>USER REGISTER</p>
        </div>
        <div class="rg_form_center">

            <!--注册表单-->
<%--            <form id="registerForm">--%>
            <form action="${pageContext.request.contextPath}/user/register.do" method="post">
                <!--提交处理请求的标识符-->
                <input type="hidden" name="action" value="register">
                <table style="margin-top: 25px;">
                    <tr>
                        <td class="td_left">
                            <label for="username">用户名</label>
                        </td>
                        <td class="td_right">
                            <input type="text" id="username" name="username" value="" placeholder="请输入用户名">
                        </td>
                    </tr>
                    <tr>
                        <td class="td_left">
                            <label for="password">密码</label>
                        </td>
                        <td class="td_right">
                            <input type="text" id="password" name="password" value="" placeholder="请输入密码">
                        </td>
                    </tr>
<%--                    <tr>--%>
<%--                        <td class="td_left">--%>
<%--                            <label for="name">姓名</label>--%>
<%--                        </td>--%>
<%--                        <td class="td_right">--%>
<%--                            <input type="text" id="name" name="name" placeholder="请输入真实姓名">--%>
<%--                        </td>--%>
<%--                    </tr>--%>
                    <tr>
                        <td class="td_left">
                            <label for="phoneNum">手机号</label>
                        </td>
                        <td class="td_right">
                            <input type="text" id="phoneNum" name="phoneNum" value="" placeholder="请输入您的手机号">
                        </td>
                    </tr>
                    <tr>
                        <td class="td_left">
                            <label for="email">邮箱</label>
                        </td>
                        <td class="td_right">
                            <input type="text" id="email" name="email" value="" placeholder="请输入您的邮箱">
                        </td>
                    </tr>

                    <tr>
                        <td class="td_left">
                        </td>
                        <td class="td_right check">
                            <input type="submit" class="submit" value="注册">
                            <span id="msg" style="color: red;"></span>
                                <!-- /.col -->
<%--                                <div class="col-xs-4">--%>
<%--                                    <button type="submit" class="btn btn-primary btn-block btn-flat">注册</button>--%>
<%--                                </div>--%>
                                <!-- /.col -->
                            <button type="button" class="btn bg-default"
                                    onclick="history.back(-1);">返回</button>
                        </td>

                    </tr>
                </table>
            </form>
        </div>
        <div class="rg_form_right">
            <p>
                已有账号？
                <a href="login.jsp">立即登录</a>
            </p>
        </div>
    </div>
</div>
<!--引入尾部-->
<div id="footer"></div>
<!--导入布局js，共享header和footer-->
<script type="text/javascript" src="js/include.js"></script>

</body>
</html>
