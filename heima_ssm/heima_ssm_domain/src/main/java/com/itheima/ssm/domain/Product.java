package com.itheima.ssm.domain;

import com.itheima.ssm.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 产品信息
 */
public class Product {
    private Integer id; // 主键
    private String productNum; // 编号 唯一
    private String productName; // 名称
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date tradeTime; // 发布时间
    private String tradeTimeStr;
    private Double productPrice; // 产品价格
    private String productDesc; // 产品描述
    private Integer productStatus; // 状态 0 关闭 1 开启
    private String productStatusStr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date gettradeTime() {
        return tradeTime;
    }

    public void setDepartureTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String gettradeTimeStr() {
        if(tradeTime!=null){
            tradeTimeStr= DateUtils.date2String(tradeTime,"yyyy-MM-dd HH:mm:ss");
        }
        return tradeTimeStr;
    }

    public void settradeTimeStr(String tradeTimeStr) {
        this.tradeTimeStr = tradeTimeStr;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductStatusStr() {
        if (productStatus != null) {
            // 状态 0 关闭 1 开启
            if(productStatus==0)
                productStatusStr="关闭";
            if(productStatus==1)
                productStatusStr="开启";
        }
        return productStatusStr;
    }

    public void setProductStatusStr(String productStatusStr) {
        this.productStatusStr = productStatusStr;
    }
}
