<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/5/24
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html >
<head>
    <meta charset="UTF-8">
    <meta http-equiv="x-ua-compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no" >
    <title>邮鱼</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <style>
        .login {
            display: block;
            float: right;
            margin: 0 20px;
        }
        .paddtop{
            padding-top:20px ;
        }
        .search-btn{
            float: left;
            border: 1px solid #ffc900;
            width: 90px;
            height: 35px;
            background-color: #ffc900;
            text-align: center;
            line-height: 35px;
            margin-top: 55px;
        }
        .search-input {
            float: left;
            border: 2px solid #ffc900;
            width: 500px;
            height: 35px;
            padding-left: 5px;
            margin-top: 55px;
        }
        .navbar {
            margin-top: 30px;
            background-color: lightgray;
        }
        .nav li{
            float: left;
            list-style: none;
            margin: 0 50px;
            width: 130px;
        }
        .nav a{
            float:left;
            font-size: 18px;
            color: black;
            width: 130px;
            text-align: center;
        }
        .more{
            float: right;
            padding-top: 25px;
        }
        .jx{
            border-bottom:5px solid #ffc900 ;
            padding: 15px;
        }
    </style>
</head>
<body>
<!--页眉-->
<header class="container-fluid">
    <div>
        <div class="paddtop">
            <div class="row">
                <a class="login" href="main.jsp">个人中心</a>
                <a class="login" href="../register.jsp">注册</a>
            </div>
        </div>

        <div class="row paddtop"></div>
        <div class="row">
            <div class="col-md-3">
                <img src="${pageContext.request.contextPath}/img/4.jpg" class="img-responsive">
            </div>
            <div class="col-md-6" >
                <input class="search-input" placeholder="请输入商品名称">
                <a class="search-btn" href="#">搜索</a>
            </div>
        </div>
        <!--导航栏-->
        <div class="row">
            <nav class="navbar" >
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="browse.jsp">首 页</a></li>
                        <li><a href="kande.jsp">看 的</a></li>
                        <li><a href="chuande.jsp">穿 的</a></li>
                        <li><a href="caide.jsp">踩 的</a></li>
                        <li><a href="yongde.jsp">用 的</a></li>
                        <li><a href="other.jsp">其 他</a></li>
                    </ul>

                </div>
            </nav>
        </div>

        <!--轮播图-->
        <div class="row">
            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <div class="item active">
                        <img src="${pageContext.request.contextPath}/img/5.jpg" alt="...">
                        <div class="carousel-caption">
                        </div>
                    </div>
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/img/9.jpg" alt="...">
                        <div class="carousel-caption">
                        </div>
                    </div>
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/img/10.jpg" alt="...">
                        <div class="carousel-caption">
                        </div>
                    </div>
                </div>

                <!-- Controls -->
                <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
    </div>
</header>
<!--主体-->
<div class="container">
    <div class="row jx">
        <img src="${pageContext.request.contextPath}/img/12.jpg">
        <span>精选商品</span>
    </div>

    <div class="row paddtop">
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/13.JPG" alt=""></a>
                <p>全新Evisu EVISUKURO 女士T恤</p>
                <span style="color: red; ">¥500</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/14.JPG" alt=""></a>
                <p>NIKE ZOOM 2K 黑色 九成新</p>
                <span style="color: red; ">¥500</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/15.JPG" alt=""></a>
                <p>《软件工程》教材 全新</p>
                <span style="color: red; ">¥20</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/16.JPG" alt=""></a>
                <p>CHANEL丝绒系列哑光58 仅试色</p>
                <span style="color: red; ">¥200</span>
            </div>
        </div>
    </div>

    <div class="row jx">
        <img src="${pageContext.request.contextPath}/img/21.jpg">
        <span>看的</span>
        <a class="more">>>发现更多</a>
    </div>

    <div class="row paddtop">
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/17.jpg" alt=""></a>
                <p>牛津高阶词典</p>
                <span style="color: red; ">¥50</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/18.jpg" alt=""></a>
                <p>高等数学 第七册 下</p>
                <span style="color: red; ">¥10</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/19.jpg" alt=""></a>
                <p>三体全套 九成新</p>
                <span style="color: red; ">¥50</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/20.jpg" alt=""></a>
                <p>人间失格 太宰治</p>
                <span style="color: red; ">¥10</span>
            </div>
        </div>
    </div>

    <div class="row jx">
        <img src="${pageContext.request.contextPath}/img/26.jpg">
        <span>穿的</span>
        <a class="more">>>发现更多</a>
    </div>

    <div class="row paddtop">
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/22.jpg" alt=""></a>
                <p>麻将女孩松紧长裤 全新</p>
                <span style="color: red; ">¥200</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/24.jpg" alt=""></a>
                <p>ACE绿色破洞牛仔裤 穿过几次</p>
                <span style="color: red; ">¥30</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/23.jpg" alt=""></a>
                <p>DesignerPlus假两件灯芯绒衬衫 仅试穿</p>
                <span style="color: red; ">¥50</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/25.jpg" alt=""></a>
                <p>Athief短袖T恤</p>
                <span style="color: red; ">¥50</span>
            </div>
        </div>
    </div>

    <div class="row jx">
        <img src="img/27.jpg">
        <span>踩的</span>
        <a class="more">>>发现更多</a>
    </div>

    <div class="row paddtop">
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/28.jpg" alt=""></a>
                <p>NewBalance NB608 36码</p>
                <span style="color: red; ">¥250</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/29.jpg" alt=""></a>
                <p>夏季单鞋高跟鞋中粗跟 35码</p>
                <span style="color: red; ">¥40</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/30.jpg" alt=""></a>
                <p>马丁靴 38码</p>
                <span style="color: red; ">¥100</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/31.jpg" alt=""></a>
                <p>PUMAStormRaySneakers 37码</p>
                <span style="color: red; ">¥50</span>
            </div>
        </div>
    </div>

    <div class="row jx">
        <img src="img/32.jpg">
        <span>用的</span>
        <a class="more">>>发现更多</a>
    </div>

    <div class="row paddtop">
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/33.jpg" alt=""></a>
                <p>祖马龙青柠罗勒与柑橘 30ML 仅试香</p>
                <span style="color: red; ">¥250</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/34.jpg" alt=""></a>
                <p>AHC男士洗面奶</p>
                <span style="color: red; ">¥20</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/35.jpg" alt=""></a>
                <p>PF粉底液 LW2/暖白 余量2/3</p>
                <span style="color: red; ">¥45</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/36.jpg" alt=""></a>
                <p>植物医生白茶洁面乳 未拆封</p>
                <span style="color: red; ">¥30</span>
            </div>
        </div>
    </div>

    <div class="row jx">
        <img src="${pageContext.request.contextPath}/img/37.jpg">
        <span>其他</span>
        <a class="more">>>发现更多</a>
    </div>

    <div class="row paddtop">
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/38.jpg" alt=""></a>
                <p>百花蜂蜜 全新未拆 25</p>
                <span style="color: red ">¥25</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/39.jpg" alt=""></a>
                <p>床上电脑桌</p>
                <span style="color: red ">¥15</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/40.jpg" alt=""></a>
                <p>青蛙针织毛线帽</p>
                <span style="color: red">¥5</span>
            </div>
        </div>
        <div class="col-md-3">
            <div class="thumbnail">
                <a href="detail.jsp"><img src="${pageContext.request.contextPath}/img/41.jpg" alt=""></a>
                <p>韩国三养火鸡面 4包</p>
                <span style="color: red">¥20</span>
            </div>
        </div>
    </div>

</div>
<!--页脚-->

<br><br><br><br><br><br><br><br><br><br>


</body>
</html>