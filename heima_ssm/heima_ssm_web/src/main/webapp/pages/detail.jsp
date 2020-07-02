<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/5/25
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>商品详情</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/route-detail.css">
</head>

<body>
<!--头部-->
<div id="header"></div>
<!--detail-->
<div class="bread_box">
    <a href="browse.jsp">首页</a>
</div>
<div class="prosum_box" style="width: 80%">
    <dl class="prosum_left" >
        <dt>
            <img alt="" class="big_img" src="${pageContext.request.contextPath}/img/15.JPG" style="width: 500px;padding-left: 100px">
        </dt>
    </dl>
    <div class="prosum_right" >
        <p class="pros_title">《软件工程》教材 全新 </p><br>
        <div class="pros_other" >
            <p>发布人：爱吃鱼的猫</p>
            <p>交易方式：面交</p>
        </div>
        <div class="pros_price">
            <p class="price"><strong>￥20.00</strong></p>
        </div>
        <br>
        <p class="collect">
            <a href="${pageContext.request.contextPath}/pages/orders-place.jsp" class="btn">立即购买</a>
            <a class="btn">联系卖家</a>
        </p>
    </div>
</div>
<div class="you_need_konw">
    <span>价格说明</span>
    <div class="notice">
        <p>1、划线价格：指商品的专柜价、吊牌价、正品零售价、厂商指导价或该商品的曾经展示过的销售价等，并非原价，仅供参考。</p>
        <p>2、未划线价格：指商品的实时标价，不因表述的差异改变性质。具体成交价格根据商品参加活动，或会员使用优惠券、积分等发生变化，最终以订单结算页价格为准。</p>
        <p>3、商家详情页（含主图）以图片或文字形式标注的一口价、促销价、优惠价等价格可能是在使用优惠券、满减或特定优惠活动和时段等情形下的价格，具体请以结算页面的标价、优惠条件或活动规则为准。</p>
        <p>4、此说明仅当出现价格比较时有效，具体请参见《淘宝价格发布规范》。若商家单独对划线价格进行说明的，以商家的表述为准。</p>
    </div><br><br>
    <span>安全提示</span>
    <div class="notice">
        <p>交易中请勿接收可疑文件和不要点击不明来源的链接，支付前核实好域名和支付详情。邮鱼不会以订单有问题，让您提供任何银行卡、密码、手机验证码！</p>
    </div><br><br>
    <span>内容声明</span>
    <div class="notice">
        <p>
            邮鱼为第三方交易平台及互联网信息服务提供者，邮鱼（含网站、客户端等）所展示的商品/服务的标题、价格、详情等信息内容系由店铺经营者发布，其真实性、准确性和合法性均由卖方负责。邮鱼提醒用户购买商品/服务前注意谨慎核实。如用户对商品/服务的标题、价格、详情等任何信息有任何疑问的，请在购买前与卖家沟通确认；如用户发现卖方有任何违法/侵权信息，请立即向邮鱼举报并提供有效线索。</p>
    </div>
</div>
</body>
</html>
