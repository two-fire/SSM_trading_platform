<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/5/25
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>邮鱼-用的</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <link rel="stylesheet" href="css/index.css">
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
    <script src="js/jquery-3.3.1.js"></script>
</head>
<body>

<div id="header"></div>

<section id="content">
    <section class="hemai_jx">
        <div class="jx_top">
            <div class="jx_tit">
                <img src="img/32.jpg" alt="" height="30">
                <span>用的</span>
                <a class="index" href="exp.html">首页</a>
            </div>
        </div>
        <div class="jx_content">

            <div class="tab-content">
                <div role="tabpanel" class="tab-pane active" id="home">
                    <div class="row">
                        <div class="col-md-3">
                            <a href="detail.html">
                                <img src="img/16.JPG" alt="">
                                <div class="has_border">
                                    <h3>CHANEL丝绒系列哑光58 仅试色</h3>
                                    <div class="price"><em>￥</em><strong>200</strong></div>
                                </div>
                            </a>
                        </div>
                        <div class="col-md-3">
                            <a href="detail.html">
                                <img src="img/33.jpg" alt="">
                                <div class="has_border">
                                    <h3>祖马龙青柠罗勒与柑橘 30ML 仅试香</h3>
                                    <div class="price"><em>￥</em><strong>250</strong></div>
                                </div>
                            </a>
                        </div>
                        <div class="col-md-3">
                            <a href="detail.html">
                                <img src="img/34.jpg" alt="">
                                <div class="has_border">
                                    <h3>AHC男士洗面奶</h3>
                                    <div class="price"><em>￥</em><strong>20</strong></div>
                                </div>
                            </a>
                        </div>
                        <div class="col-md-3">
                            <a href="detail.html">
                                <img src="img/35.jpg" alt="">
                                <div class="has_border">
                                    <h3>PF粉底液 LW2/暖白 余量2/3</h3>
                                    <div class="price"><em>￥</em><strong>45</strong></div>
                                </div>
                            </a>
                        </div>
                        <div class="col-md-3">
                            <a href="detail.html">
                                <img src="img/36.jpg" alt="">
                                <div class="has_border">
                                    <h3>植物医生白茶洁面乳 未拆封</h3>
                                    <div class="price"><em>￥</em><strong>30</strong></div>
                                </div>
                            </a>
                        </div>
                        <div class="col-md-3">
                            <a href="detail.html">
                                <img src="img/h1.jpg" alt="">
                                <div class="has_border">
                                    <h3>尔木葡美妆蛋 2只</h3>
                                    <div class="price"><em>￥</em><strong>25</strong></div>
                                </div>
                            </a>
                        </div>
                        <div class="col-md-3">
                            <a href="detail.html">
                                <img src="img/h2.jpg" alt="">
                                <div class="has_border">
                                    <h3>完美日记哑光唇釉 905野兽派对</h3>
                                    <div class="price"><em>￥</em><strong>15</strong></div>
                                </div>
                            </a>
                        </div>
                        <div class="col-md-3">
                            <a href="detail.html">
                                <img src="img/h3.jpg" alt="">
                                <div class="has_border">
                                    <h3>纪梵希四宫格散粉 余2/3</h3>
                                    <div class="price"><em>￥</em><strong>160</strong></div>
                                </div>
                            </a>
                        </div>
                        <div class="col-md-3">
                            <a href="detail.html">
                                <img src="img/h4.jpg" alt="">
                                <div class="has_border">
                                    <h3>Opera薏仁化妆水</h3>
                                    <div class="price"><em>￥</em><strong>50</strong></div>
                                </div>
                            </a>
                        </div>
                        <div class="col-md-3">
                            <a href="detail.html">
                                <img src="img/h5.jpg" alt="">
                                <div class="has_border">
                                    <h3>完美日记九色眼影+眼线笔</h3>
                                    <div class="price"><em>￥</em><strong>80</strong></div>
                                </div>
                            </a>
                        </div>
                        <div class="col-md-3">
                            <a href="detail.html">
                                <img src="img/h6.jpg" alt="">
                                <div class="has_border">
                                    <h3>科颜氏亚马逊白泥清洁面膜 全新</h3>
                                    <div class="price"><em>￥</em><strong>200</strong></div>
                                </div>
                            </a>
                        </div>
                        <div class="col-md-3">
                            <a href="detail.html">
                                <img src="img/h7.jpg" alt="">
                                <div class="has_border">
                                    <h3>TooCoolForSchool三色修容</h3>
                                    <div class="price"><em>￥</em><strong>30</strong></div>
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
