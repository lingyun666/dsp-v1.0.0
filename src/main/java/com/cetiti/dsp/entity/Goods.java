package com.cetiti.dsp.entity;

import java.io.Serializable;
import java.util.Date;

public class Goods {
    private long goodsId;
    private String title;
    private float price;
    private short state;
    private int number;
    private Date createTime;
    private Date updateTime;

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", state=" + state +
                ", number=" + number +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
