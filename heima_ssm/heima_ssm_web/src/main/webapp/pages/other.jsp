<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/5/25
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <title>邮鱼-看的</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
    <style>
        .tab-content .row>div {
            margin-top: 16px;
        }
        .tab-content {
            margin-bottom: 36px;
        }
        .index{
            float: right;
        }
    </style>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
</head>
<body>

<div id="header"></div>

<section id="content">
    <section class="hemai_jx">
        <div class="jx_top">
            <div class="jx_tit">
                <img src="${pageContext.request.contextPath}/img/37.jpg" alt="" height="30">
                <span>其他</span>
                <a class="index" href="browse.jsp">首页</a>
            </div>
        </div>
        <div class="jx_content">

            <div class="tab-content">
                <div role="tabpanel" class="tab-pane active" id="home">
                    <div class="row">
                        <div class="col-md-3">
                            <a href="detail.jsp">
                                <img src="${pageContext.request.contextPath}/img/38.jpg" alt="">
                                <div class="has_border">
                                    <h3>百花蜂蜜 全新未拆 25</h3>
                                    <div class="price"><em>￥</em><strong>25</strong></div>
                                </div>
                            </a>
                        </div>
                        <div class="col-md-3">
                            <a href="detail.jsp">
                                <img src="${pageContext.request.contextPath}/img/39.jpg" alt="">
                                <div class="has_border">
                                    <h3>床上电脑桌</h3>
                                    <div class="price"><em>￥</em><strong>15</strong></div>
                                </div>
                            </a>
                        </div>
                        <div class="col-md-3">
                            <a href="detail.jsp">
                                <img src="${pageContext.request.contextPath}/img/39.jpg" alt="">
                                <div class="has_border">
                                    <h3>床上电脑桌</h3>
                                    <div class="price"><em>￥</em><strong>15</strong></div>
                                </div>
                            </a>
                        </div>  <div class="col-md-3">
                        <a href="detail.jsp">
                            <img src="${pageContext.request.contextPath}/img/39.jpg" alt="">
                            <div class="has_border">
                                <h3>床上电脑桌</h3>
                                <div class="price"><em>￥</em><strong>15</strong></div>
                            </div>
                        </a>
                    </div>  <div class="col-md-3">
                        <a href="detail.jsp">
                            <img src="${pageContext.request.contextPath}/img/39.jpg" alt="">
                            <div class="has_border">
                                <h3>床上电脑桌</h3>
                                <div class="price"><em>￥</em><strong>15</strong></div>
                            </div>
                        </a>
                    </div>  <div class="col-md-3">
                        <a href="detail.jsp">
                            <img src="${pageContext.request.contextPath}/img/39.jpg" alt="">
                            <div class="has_border">
                                <h3>床上电脑桌</h3>
                                <div class="price"><em>￥</em><strong>15</strong></div>
                            </div>
                        </a>
                    </div>  <div class="col-md-3">
                        <a href="detail.jsp">
                            <img src="${pageContext.request.contextPath}/img/39.jpg" alt="">
                            <div class="has_border">
                                <h3>床上电脑桌</h3>
                                <div class="price"><em>￥</em><strong>15</strong></div>
                            </div>
                        </a>
                    </div>  <div class="col-md-3">
                        <a href="detail.jsp">
                            <img src="${pageContext.request.contextPath}/img/39.jpg" alt="">
                            <div class="has_border">
                                <h3>床上电脑桌</h3>
                                <div class="price"><em>￥</em><strong>15</strong></div>
                            </div>
                        </a>
                    </div>  <div class="col-md-3">
                        <a href="detail.jsp">
                            <img src="${pageContext.request.contextPath}/img/39.jpg" alt="">
                            <div class="has_border">
                                <h3>床上电脑桌</h3>
                                <div class="price"><em>￥</em><strong>15</strong></div>
                            </div>
                        </a>
                    </div>  <div class="col-md-3">
                        <a href="detail.jsp">
                            <img src="${pageContext.request.contextPath}/img/39.jpg" alt="">
                            <div class="has_border">
                                <h3>床上电脑桌</h3>
                                <div class="price"><em>￥</em><strong>15</strong></div>
                            </div>
                        </a>
                    </div>  <div class="col-md-3">
                        <a href="detail.jsp">
                            <img src="${pageContext.request.contextPath}/img/39.jpg" alt="">
                            <div class="has_border">
                                <h3>床上电脑桌</h3>
                                <div class="price"><em>￥</em><strong>15</strong></div>
                            </div>
                        </a>
                    </div>  <div class="col-md-3">
                        <a href="detail.jsp">
                            <img src="${pageContext.request.contextPath}/img/39.jpg" alt="">
                            <div class="has_border">
                                <h3>床上电脑桌</h3>
                                <div class="price"><em>￥</em><strong>15</strong></div>
                            </div>
                        </a>
                    </div>

                    </div>
                </div>
            </div>
        </div>
        <div class="pageNum">
            <ul>
                <li><a href="">首页</a></li>
                <li class="threeword"><a href="#">上一页</a></li>
                <li><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#">6</a></li>
                <li class="threeword"><a href="javascript:;">下一页</a></li>
                <li class="threeword"><a href="javascript:;">末页</a></li>
            </ul>
        </div>
    </section>
</section>


<div id="footer"></div>

<script type="text/javascript" src="js/include.js"></script>
</body>
</html>