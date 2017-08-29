package cn.yz.fresh.pojo;

import java.math.BigDecimal;

public class Account {
    private String orderId;

    private Integer purchaseId;

    private BigDecimal amount;

    private Integer supplyId;

    private BigDecimal supplyAmount;

    private String blanknumber;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(Integer supplyId) {
        this.supplyId = supplyId;
    }

    public BigDecimal getSupplyAmount() {
        return supplyAmount;
    }

    public void setSupplyAmount(BigDecimal supplyAmount) {
        this.supplyAmount = supplyAmount;
    }

    public String getBlanknumber() {
        return blanknumber;
    }

    public void setBlanknumber(String blanknumber) {
        this.blanknumber = blanknumber == null ? null : blanknumber.trim();
    }
}