package cn.mejhwu.shop.pojo;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User:   mejhwu
 * Date:   7/12/17
 * Time:   10:05 PM
 * E-mail: mejhwu@163.com
 * Description:
 */

public class OrderItem {
    private String id;
    private String itemId;
    private String orderId;
    private int num;
    private String title;
    private BigInteger price;
    private BigInteger totalFee;
    private String picPath;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public BigInteger getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigInteger totalFee) {
        this.totalFee = totalFee;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id='" + id + '\'' +
                ", itemId='" + itemId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", num=" + num +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", totalFee=" + totalFee +
                ", picPath='" + picPath + '\'' +
                '}';
    }
}
