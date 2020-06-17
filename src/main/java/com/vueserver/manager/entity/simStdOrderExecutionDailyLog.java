package com.vueserver.manager.entity;

import java.io.Serializable;
import java.util.Date;

public class simStdOrderExecutionDailyLog implements Serializable {
    private String planId;

    private String taskId;

    private Date simOrderDate;

    private Date dt;

    private Long instockOrders;

    private Long orders;

    private Long nstockOrderUnits;

    private Long totalOrderUnits;

    private Long localInstockOrderUnits;

    private Long totalLocalOutboundOrderUnits;

    private Long instockOrderSkus;

    private Long totalOrderSkus;

    private Long localInstockOrderSkus;

    private Long totalOutboundOrderSkus;

    private Long localInstockOrders;

    private Long outboundOrders;

    private Long instockWarehouseSkus;

    private Long everInstockWarehouseSkus;

    private Double instockValue;

    private Double salesValue;

    private Long instockUnits;

    private Long salesUnits;

    private Long safeStockUnits;

    private Double safeStockValue;

    private Byte isTodayRestocking;

    private Long targetStockUnits;

    private Double targetStockValue;

    private Long demandUnits;

    private Double demandValue;

    private Long outboundUnits;

    private Double outboundValue;

    private Long poOrders;

    private Long poUnits;

    private Long poTimes;

    private Long poValue;

    private static final long serialVersionUID = 1L;

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Date getSimOrderDate() {
        return simOrderDate;
    }

    public void setSimOrderDate(Date simOrderDate) {
        this.simOrderDate = simOrderDate;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public Long getInstockOrders() {
        return instockOrders;
    }

    public void setInstockOrders(Long instockOrders) {
        this.instockOrders = instockOrders;
    }

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getNstockOrderUnits() {
        return nstockOrderUnits;
    }

    public void setNstockOrderUnits(Long nstockOrderUnits) {
        this.nstockOrderUnits = nstockOrderUnits;
    }

    public Long getTotalOrderUnits() {
        return totalOrderUnits;
    }

    public void setTotalOrderUnits(Long totalOrderUnits) {
        this.totalOrderUnits = totalOrderUnits;
    }

    public Long getLocalInstockOrderUnits() {
        return localInstockOrderUnits;
    }

    public void setLocalInstockOrderUnits(Long localInstockOrderUnits) {
        this.localInstockOrderUnits = localInstockOrderUnits;
    }

    public Long getTotalLocalOutboundOrderUnits() {
        return totalLocalOutboundOrderUnits;
    }

    public void setTotalLocalOutboundOrderUnits(Long totalLocalOutboundOrderUnits) {
        this.totalLocalOutboundOrderUnits = totalLocalOutboundOrderUnits;
    }

    public Long getInstockOrderSkus() {
        return instockOrderSkus;
    }

    public void setInstockOrderSkus(Long instockOrderSkus) {
        this.instockOrderSkus = instockOrderSkus;
    }

    public Long getTotalOrderSkus() {
        return totalOrderSkus;
    }

    public void setTotalOrderSkus(Long totalOrderSkus) {
        this.totalOrderSkus = totalOrderSkus;
    }

    public Long getLocalInstockOrderSkus() {
        return localInstockOrderSkus;
    }

    public void setLocalInstockOrderSkus(Long localInstockOrderSkus) {
        this.localInstockOrderSkus = localInstockOrderSkus;
    }

    public Long getTotalOutboundOrderSkus() {
        return totalOutboundOrderSkus;
    }

    public void setTotalOutboundOrderSkus(Long totalOutboundOrderSkus) {
        this.totalOutboundOrderSkus = totalOutboundOrderSkus;
    }

    public Long getLocalInstockOrders() {
        return localInstockOrders;
    }

    public void setLocalInstockOrders(Long localInstockOrders) {
        this.localInstockOrders = localInstockOrders;
    }

    public Long getOutboundOrders() {
        return outboundOrders;
    }

    public void setOutboundOrders(Long outboundOrders) {
        this.outboundOrders = outboundOrders;
    }

    public Long getInstockWarehouseSkus() {
        return instockWarehouseSkus;
    }

    public void setInstockWarehouseSkus(Long instockWarehouseSkus) {
        this.instockWarehouseSkus = instockWarehouseSkus;
    }

    public Long getEverInstockWarehouseSkus() {
        return everInstockWarehouseSkus;
    }

    public void setEverInstockWarehouseSkus(Long everInstockWarehouseSkus) {
        this.everInstockWarehouseSkus = everInstockWarehouseSkus;
    }

    public Double getInstockValue() {
        return instockValue;
    }

    public void setInstockValue(Double instockValue) {
        this.instockValue = instockValue;
    }

    public Double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(Double salesValue) {
        this.salesValue = salesValue;
    }

    public Long getInstockUnits() {
        return instockUnits;
    }

    public void setInstockUnits(Long instockUnits) {
        this.instockUnits = instockUnits;
    }

    public Long getSalesUnits() {
        return salesUnits;
    }

    public void setSalesUnits(Long salesUnits) {
        this.salesUnits = salesUnits;
    }

    public Long getSafeStockUnits() {
        return safeStockUnits;
    }

    public void setSafeStockUnits(Long safeStockUnits) {
        this.safeStockUnits = safeStockUnits;
    }

    public Double getSafeStockValue() {
        return safeStockValue;
    }

    public void setSafeStockValue(Double safeStockValue) {
        this.safeStockValue = safeStockValue;
    }

    public Byte getIsTodayRestocking() {
        return isTodayRestocking;
    }

    public void setIsTodayRestocking(Byte isTodayRestocking) {
        this.isTodayRestocking = isTodayRestocking;
    }

    public Long getTargetStockUnits() {
        return targetStockUnits;
    }

    public void setTargetStockUnits(Long targetStockUnits) {
        this.targetStockUnits = targetStockUnits;
    }

    public Double getTargetStockValue() {
        return targetStockValue;
    }

    public void setTargetStockValue(Double targetStockValue) {
        this.targetStockValue = targetStockValue;
    }

    public Long getDemandUnits() {
        return demandUnits;
    }

    public void setDemandUnits(Long demandUnits) {
        this.demandUnits = demandUnits;
    }

    public Double getDemandValue() {
        return demandValue;
    }

    public void setDemandValue(Double demandValue) {
        this.demandValue = demandValue;
    }

    public Long getOutboundUnits() {
        return outboundUnits;
    }

    public void setOutboundUnits(Long outboundUnits) {
        this.outboundUnits = outboundUnits;
    }

    public Double getOutboundValue() {
        return outboundValue;
    }

    public void setOutboundValue(Double outboundValue) {
        this.outboundValue = outboundValue;
    }

    public Long getPoOrders() {
        return poOrders;
    }

    public void setPoOrders(Long poOrders) {
        this.poOrders = poOrders;
    }

    public Long getPoUnits() {
        return poUnits;
    }

    public void setPoUnits(Long poUnits) {
        this.poUnits = poUnits;
    }

    public Long getPoTimes() {
        return poTimes;
    }

    public void setPoTimes(Long poTimes) {
        this.poTimes = poTimes;
    }

    public Long getPoValue() {
        return poValue;
    }

    public void setPoValue(Long poValue) {
        this.poValue = poValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", planId=").append(planId);
        sb.append(", taskId=").append(taskId);
        sb.append(", simOrderDate=").append(simOrderDate);
        sb.append(", dt=").append(dt);
        sb.append(", instockOrders=").append(instockOrders);
        sb.append(", orders=").append(orders);
        sb.append(", nstockOrderUnits=").append(nstockOrderUnits);
        sb.append(", totalOrderUnits=").append(totalOrderUnits);
        sb.append(", localInstockOrderUnits=").append(localInstockOrderUnits);
        sb.append(", totalLocalOutboundOrderUnits=").append(totalLocalOutboundOrderUnits);
        sb.append(", instockOrderSkus=").append(instockOrderSkus);
        sb.append(", totalOrderSkus=").append(totalOrderSkus);
        sb.append(", localInstockOrderSkus=").append(localInstockOrderSkus);
        sb.append(", totalOutboundOrderSkus=").append(totalOutboundOrderSkus);
        sb.append(", localInstockOrders=").append(localInstockOrders);
        sb.append(", outboundOrders=").append(outboundOrders);
        sb.append(", instockWarehouseSkus=").append(instockWarehouseSkus);
        sb.append(", everInstockWarehouseSkus=").append(everInstockWarehouseSkus);
        sb.append(", instockValue=").append(instockValue);
        sb.append(", salesValue=").append(salesValue);
        sb.append(", instockUnits=").append(instockUnits);
        sb.append(", salesUnits=").append(salesUnits);
        sb.append(", safeStockUnits=").append(safeStockUnits);
        sb.append(", safeStockValue=").append(safeStockValue);
        sb.append(", isTodayRestocking=").append(isTodayRestocking);
        sb.append(", targetStockUnits=").append(targetStockUnits);
        sb.append(", targetStockValue=").append(targetStockValue);
        sb.append(", demandUnits=").append(demandUnits);
        sb.append(", demandValue=").append(demandValue);
        sb.append(", outboundUnits=").append(outboundUnits);
        sb.append(", outboundValue=").append(outboundValue);
        sb.append(", poOrders=").append(poOrders);
        sb.append(", poUnits=").append(poUnits);
        sb.append(", poTimes=").append(poTimes);
        sb.append(", poValue=").append(poValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}