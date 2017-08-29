package cn.yz.fresh.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private String orderId;

    private Integer goodId;

    private Integer goodNums;

    private BigDecimal goodsPrice;

    private Integer purchaseId;

    private Integer supplyId;

    private Integer purchaseOrderStatus;

    private Date purchasePayDate;

    private Integer supplyOrderStatus;

    private Date supplyDeliverDate;

    private String purchaseEvaluation;

    private String supplyEvaluation;

    private Integer dealerId;

    private String remarks;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getGoodNums() {
        return goodNums;
    }

    public void setGoodNums(Integer goodNums) {
        this.goodNums = goodNums;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(Integer supplyId) {
        this.supplyId = supplyId;
    }

    public Integer getPurchaseOrderStatus() {
        return purchaseOrderStatus;
    }

    public void setPurchaseOrderStatus(Integer purchaseOrderStatus) {
        this.purchaseOrderStatus = purchaseOrderStatus;
    }

    public Date getPurchasePayDate() {
        return purchasePayDate;
    }

    public void setPurchasePayDate(Date purchasePayDate) {
        this.purchasePayDate = purchasePayDate;
    }

    public Integer getSupplyOrderStatus() {
        return supplyOrderStatus;
    }

    public void setSupplyOrderStatus(Integer supplyOrderStatus) {
        this.supplyOrderStatus = supplyOrderStatus;
    }

    public Date getSupplyDeliverDate() {
        return supplyDeliverDate;
    }

    public void setSupplyDeliverDate(Date supplyDeliverDate) {
        this.supplyDeliverDate = supplyDeliverDate;
    }

    public String getPurchaseEvaluation() {
        return purchaseEvaluation;
    }

    public void setPurchaseEvaluation(String purchaseEvaluation) {
        this.purchaseEvaluation = purchaseEvaluation == null ? null : purchaseEvaluation.trim();
    }

    public String getSupplyEvaluation() {
        return supplyEvaluation;
    }

    public void setSupplyEvaluation(String supplyEvaluation) {
        this.supplyEvaluation = supplyEvaluation == null ? null : supplyEvaluation.trim();
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}