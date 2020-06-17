package com.vueserver.manager.entity;

import java.io.Serializable;

public class simStdResultMetrics implements Serializable {
    private String id;

    private String planId;

    private Integer isActual;

    private String warehouseCode;

    private String warehouseName;

    private Integer timeDimType;

    private Long timeDimDate;

    private Integer detailType;

    private String bandName;

    private String catCode;

    private String catName;

    private Double unitTurnDays;

    private Double endUnitTurnDays;

    private Double moneyTurnDays;

    private Double endMoneyTurnDays;

    private Double unitTurnPerYearPercentage;

    private Double endUnitTurnPercentage;

    private Double moneyTurnPerYearPercentage;

    private Double endMoneyTurnPercentage;

    private Double orderFulfillPercentageCountry;

    private Double orderFulfillPercentageLocal;

    private Double unitFulfillPercentageCountry;

    private Double totalOrderUnits;

    private Double unitFulfillPercentageLocal;

    private Double skuFulfillPercentage;

    private Double skuFulfillPercentageLocal;

    private Double instockPercentage;

    private Double outStockPercentage;

    private Double nonSaleSkuPercentage;

    private Long instockSkuNum;

    private Double instockUnits;

    private Double instockValue;

    private Double safeStockUnits;

    private Double safeStockValue;

    private Double stockUnitsOnReplenishing;

    private Double stockValueOnReplenishing;

    private Double targetStockValue;

    private Double nonSaleUnits;

    private Double nonSaleValue;

    private Double saleSkuNum;

    private Double nonSaleSkuNum;

    private Long saleUnits;

    private Double saleValue;

    private Double saleUnitsPerDay;

    private Double saleValuePerDay;

    private Double stockOutUnits;

    private Double stockOutValue;

    private Double stockOutUnitsPerDay;

    private Double stockOutValuePerDay;

    private Long poNum;

    private Double poAvgUnits;

    private Double poAvgValue;

    private Double poTotalUnits;

    private Double poTotalValue;

    private Double poMaxUnits;

    private Double poMaxValue;

    private Double poMinUnits;

    private Double poMinValue;

    private Double inStorageAvgUnits;

    private Double inStorageAvgValue;

    private Long inStorageTotalUnits;

    private Double inStorageTotalValue;

    private Double outstockUnitsPercentage;

    private Double outstockOrderSkusPercentage;

    private Double outstockOrdersPercentage;

    private Double crossBorderUnitsRate;

    private Double crossBorderOrderSkusRate;

    private Double crossBorderOrderRate;

    private Double avgInstockRate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public Integer getIsActual() {
        return isActual;
    }

    public void setIsActual(Integer isActual) {
        this.isActual = isActual;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Integer getTimeDimType() {
        return timeDimType;
    }

    public void setTimeDimType(Integer timeDimType) {
        this.timeDimType = timeDimType;
    }

    public Long getTimeDimDate() {
        return timeDimDate;
    }

    public void setTimeDimDate(Long timeDimDate) {
        this.timeDimDate = timeDimDate;
    }

    public Integer getDetailType() {
        return detailType;
    }

    public void setDetailType(Integer detailType) {
        this.detailType = detailType;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getCatCode() {
        return catCode;
    }

    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Double getUnitTurnDays() {
        return unitTurnDays;
    }

    public void setUnitTurnDays(Double unitTurnDays) {
        this.unitTurnDays = unitTurnDays;
    }

    public Double getEndUnitTurnDays() {
        return endUnitTurnDays;
    }

    public void setEndUnitTurnDays(Double endUnitTurnDays) {
        this.endUnitTurnDays = endUnitTurnDays;
    }

    public Double getMoneyTurnDays() {
        return moneyTurnDays;
    }

    public void setMoneyTurnDays(Double moneyTurnDays) {
        this.moneyTurnDays = moneyTurnDays;
    }

    public Double getEndMoneyTurnDays() {
        return endMoneyTurnDays;
    }

    public void setEndMoneyTurnDays(Double endMoneyTurnDays) {
        this.endMoneyTurnDays = endMoneyTurnDays;
    }

    public Double getUnitTurnPerYearPercentage() {
        return unitTurnPerYearPercentage;
    }

    public void setUnitTurnPerYearPercentage(Double unitTurnPerYearPercentage) {
        this.unitTurnPerYearPercentage = unitTurnPerYearPercentage;
    }

    public Double getEndUnitTurnPercentage() {
        return endUnitTurnPercentage;
    }

    public void setEndUnitTurnPercentage(Double endUnitTurnPercentage) {
        this.endUnitTurnPercentage = endUnitTurnPercentage;
    }

    public Double getMoneyTurnPerYearPercentage() {
        return moneyTurnPerYearPercentage;
    }

    public void setMoneyTurnPerYearPercentage(Double moneyTurnPerYearPercentage) {
        this.moneyTurnPerYearPercentage = moneyTurnPerYearPercentage;
    }

    public Double getEndMoneyTurnPercentage() {
        return endMoneyTurnPercentage;
    }

    public void setEndMoneyTurnPercentage(Double endMoneyTurnPercentage) {
        this.endMoneyTurnPercentage = endMoneyTurnPercentage;
    }

    public Double getOrderFulfillPercentageCountry() {
        return orderFulfillPercentageCountry;
    }

    public void setOrderFulfillPercentageCountry(Double orderFulfillPercentageCountry) {
        this.orderFulfillPercentageCountry = orderFulfillPercentageCountry;
    }

    public Double getOrderFulfillPercentageLocal() {
        return orderFulfillPercentageLocal;
    }

    public void setOrderFulfillPercentageLocal(Double orderFulfillPercentageLocal) {
        this.orderFulfillPercentageLocal = orderFulfillPercentageLocal;
    }

    public Double getUnitFulfillPercentageCountry() {
        return unitFulfillPercentageCountry;
    }

    public void setUnitFulfillPercentageCountry(Double unitFulfillPercentageCountry) {
        this.unitFulfillPercentageCountry = unitFulfillPercentageCountry;
    }

    public Double getTotalOrderUnits() {
        return totalOrderUnits;
    }

    public void setTotalOrderUnits(Double totalOrderUnits) {
        this.totalOrderUnits = totalOrderUnits;
    }

    public Double getUnitFulfillPercentageLocal() {
        return unitFulfillPercentageLocal;
    }

    public void setUnitFulfillPercentageLocal(Double unitFulfillPercentageLocal) {
        this.unitFulfillPercentageLocal = unitFulfillPercentageLocal;
    }

    public Double getSkuFulfillPercentage() {
        return skuFulfillPercentage;
    }

    public void setSkuFulfillPercentage(Double skuFulfillPercentage) {
        this.skuFulfillPercentage = skuFulfillPercentage;
    }

    public Double getSkuFulfillPercentageLocal() {
        return skuFulfillPercentageLocal;
    }

    public void setSkuFulfillPercentageLocal(Double skuFulfillPercentageLocal) {
        this.skuFulfillPercentageLocal = skuFulfillPercentageLocal;
    }

    public Double getInstockPercentage() {
        return instockPercentage;
    }

    public void setInstockPercentage(Double instockPercentage) {
        this.instockPercentage = instockPercentage;
    }

    public Double getOutStockPercentage() {
        return outStockPercentage;
    }

    public void setOutStockPercentage(Double outStockPercentage) {
        this.outStockPercentage = outStockPercentage;
    }

    public Double getNonSaleSkuPercentage() {
        return nonSaleSkuPercentage;
    }

    public void setNonSaleSkuPercentage(Double nonSaleSkuPercentage) {
        this.nonSaleSkuPercentage = nonSaleSkuPercentage;
    }

    public Long getInstockSkuNum() {
        return instockSkuNum;
    }

    public void setInstockSkuNum(Long instockSkuNum) {
        this.instockSkuNum = instockSkuNum;
    }

    public Double getInstockUnits() {
        return instockUnits;
    }

    public void setInstockUnits(Double instockUnits) {
        this.instockUnits = instockUnits;
    }

    public Double getInstockValue() {
        return instockValue;
    }

    public void setInstockValue(Double instockValue) {
        this.instockValue = instockValue;
    }

    public Double getSafeStockUnits() {
        return safeStockUnits;
    }

    public void setSafeStockUnits(Double safeStockUnits) {
        this.safeStockUnits = safeStockUnits;
    }

    public Double getSafeStockValue() {
        return safeStockValue;
    }

    public void setSafeStockValue(Double safeStockValue) {
        this.safeStockValue = safeStockValue;
    }

    public Double getStockUnitsOnReplenishing() {
        return stockUnitsOnReplenishing;
    }

    public void setStockUnitsOnReplenishing(Double stockUnitsOnReplenishing) {
        this.stockUnitsOnReplenishing = stockUnitsOnReplenishing;
    }

    public Double getStockValueOnReplenishing() {
        return stockValueOnReplenishing;
    }

    public void setStockValueOnReplenishing(Double stockValueOnReplenishing) {
        this.stockValueOnReplenishing = stockValueOnReplenishing;
    }

    public Double getTargetStockValue() {
        return targetStockValue;
    }

    public void setTargetStockValue(Double targetStockValue) {
        this.targetStockValue = targetStockValue;
    }

    public Double getNonSaleUnits() {
        return nonSaleUnits;
    }

    public void setNonSaleUnits(Double nonSaleUnits) {
        this.nonSaleUnits = nonSaleUnits;
    }

    public Double getNonSaleValue() {
        return nonSaleValue;
    }

    public void setNonSaleValue(Double nonSaleValue) {
        this.nonSaleValue = nonSaleValue;
    }

    public Double getSaleSkuNum() {
        return saleSkuNum;
    }

    public void setSaleSkuNum(Double saleSkuNum) {
        this.saleSkuNum = saleSkuNum;
    }

    public Double getNonSaleSkuNum() {
        return nonSaleSkuNum;
    }

    public void setNonSaleSkuNum(Double nonSaleSkuNum) {
        this.nonSaleSkuNum = nonSaleSkuNum;
    }

    public Long getSaleUnits() {
        return saleUnits;
    }

    public void setSaleUnits(Long saleUnits) {
        this.saleUnits = saleUnits;
    }

    public Double getSaleValue() {
        return saleValue;
    }

    public void setSaleValue(Double saleValue) {
        this.saleValue = saleValue;
    }

    public Double getSaleUnitsPerDay() {
        return saleUnitsPerDay;
    }

    public void setSaleUnitsPerDay(Double saleUnitsPerDay) {
        this.saleUnitsPerDay = saleUnitsPerDay;
    }

    public Double getSaleValuePerDay() {
        return saleValuePerDay;
    }

    public void setSaleValuePerDay(Double saleValuePerDay) {
        this.saleValuePerDay = saleValuePerDay;
    }

    public Double getStockOutUnits() {
        return stockOutUnits;
    }

    public void setStockOutUnits(Double stockOutUnits) {
        this.stockOutUnits = stockOutUnits;
    }

    public Double getStockOutValue() {
        return stockOutValue;
    }

    public void setStockOutValue(Double stockOutValue) {
        this.stockOutValue = stockOutValue;
    }

    public Double getStockOutUnitsPerDay() {
        return stockOutUnitsPerDay;
    }

    public void setStockOutUnitsPerDay(Double stockOutUnitsPerDay) {
        this.stockOutUnitsPerDay = stockOutUnitsPerDay;
    }

    public Double getStockOutValuePerDay() {
        return stockOutValuePerDay;
    }

    public void setStockOutValuePerDay(Double stockOutValuePerDay) {
        this.stockOutValuePerDay = stockOutValuePerDay;
    }

    public Long getPoNum() {
        return poNum;
    }

    public void setPoNum(Long poNum) {
        this.poNum = poNum;
    }

    public Double getPoAvgUnits() {
        return poAvgUnits;
    }

    public void setPoAvgUnits(Double poAvgUnits) {
        this.poAvgUnits = poAvgUnits;
    }

    public Double getPoAvgValue() {
        return poAvgValue;
    }

    public void setPoAvgValue(Double poAvgValue) {
        this.poAvgValue = poAvgValue;
    }

    public Double getPoTotalUnits() {
        return poTotalUnits;
    }

    public void setPoTotalUnits(Double poTotalUnits) {
        this.poTotalUnits = poTotalUnits;
    }

    public Double getPoTotalValue() {
        return poTotalValue;
    }

    public void setPoTotalValue(Double poTotalValue) {
        this.poTotalValue = poTotalValue;
    }

    public Double getPoMaxUnits() {
        return poMaxUnits;
    }

    public void setPoMaxUnits(Double poMaxUnits) {
        this.poMaxUnits = poMaxUnits;
    }

    public Double getPoMaxValue() {
        return poMaxValue;
    }

    public void setPoMaxValue(Double poMaxValue) {
        this.poMaxValue = poMaxValue;
    }

    public Double getPoMinUnits() {
        return poMinUnits;
    }

    public void setPoMinUnits(Double poMinUnits) {
        this.poMinUnits = poMinUnits;
    }

    public Double getPoMinValue() {
        return poMinValue;
    }

    public void setPoMinValue(Double poMinValue) {
        this.poMinValue = poMinValue;
    }

    public Double getInStorageAvgUnits() {
        return inStorageAvgUnits;
    }

    public void setInStorageAvgUnits(Double inStorageAvgUnits) {
        this.inStorageAvgUnits = inStorageAvgUnits;
    }

    public Double getInStorageAvgValue() {
        return inStorageAvgValue;
    }

    public void setInStorageAvgValue(Double inStorageAvgValue) {
        this.inStorageAvgValue = inStorageAvgValue;
    }

    public Long getInStorageTotalUnits() {
        return inStorageTotalUnits;
    }

    public void setInStorageTotalUnits(Long inStorageTotalUnits) {
        this.inStorageTotalUnits = inStorageTotalUnits;
    }

    public Double getInStorageTotalValue() {
        return inStorageTotalValue;
    }

    public void setInStorageTotalValue(Double inStorageTotalValue) {
        this.inStorageTotalValue = inStorageTotalValue;
    }

    public Double getOutstockUnitsPercentage() {
        return outstockUnitsPercentage;
    }

    public void setOutstockUnitsPercentage(Double outstockUnitsPercentage) {
        this.outstockUnitsPercentage = outstockUnitsPercentage;
    }

    public Double getOutstockOrderSkusPercentage() {
        return outstockOrderSkusPercentage;
    }

    public void setOutstockOrderSkusPercentage(Double outstockOrderSkusPercentage) {
        this.outstockOrderSkusPercentage = outstockOrderSkusPercentage;
    }

    public Double getOutstockOrdersPercentage() {
        return outstockOrdersPercentage;
    }

    public void setOutstockOrdersPercentage(Double outstockOrdersPercentage) {
        this.outstockOrdersPercentage = outstockOrdersPercentage;
    }

    public Double getCrossBorderUnitsRate() {
        return crossBorderUnitsRate;
    }

    public void setCrossBorderUnitsRate(Double crossBorderUnitsRate) {
        this.crossBorderUnitsRate = crossBorderUnitsRate;
    }

    public Double getCrossBorderOrderSkusRate() {
        return crossBorderOrderSkusRate;
    }

    public void setCrossBorderOrderSkusRate(Double crossBorderOrderSkusRate) {
        this.crossBorderOrderSkusRate = crossBorderOrderSkusRate;
    }

    public Double getCrossBorderOrderRate() {
        return crossBorderOrderRate;
    }

    public void setCrossBorderOrderRate(Double crossBorderOrderRate) {
        this.crossBorderOrderRate = crossBorderOrderRate;
    }

    public Double getAvgInstockRate() {
        return avgInstockRate;
    }

    public void setAvgInstockRate(Double avgInstockRate) {
        this.avgInstockRate = avgInstockRate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", planId=").append(planId);
        sb.append(", isActual=").append(isActual);
        sb.append(", warehouseCode=").append(warehouseCode);
        sb.append(", warehouseName=").append(warehouseName);
        sb.append(", timeDimType=").append(timeDimType);
        sb.append(", timeDimDate=").append(timeDimDate);
        sb.append(", detailType=").append(detailType);
        sb.append(", bandName=").append(bandName);
        sb.append(", catCode=").append(catCode);
        sb.append(", catName=").append(catName);
        sb.append(", unitTurnDays=").append(unitTurnDays);
        sb.append(", endUnitTurnDays=").append(endUnitTurnDays);
        sb.append(", moneyTurnDays=").append(moneyTurnDays);
        sb.append(", endMoneyTurnDays=").append(endMoneyTurnDays);
        sb.append(", unitTurnPerYearPercentage=").append(unitTurnPerYearPercentage);
        sb.append(", endUnitTurnPercentage=").append(endUnitTurnPercentage);
        sb.append(", moneyTurnPerYearPercentage=").append(moneyTurnPerYearPercentage);
        sb.append(", endMoneyTurnPercentage=").append(endMoneyTurnPercentage);
        sb.append(", orderFulfillPercentageCountry=").append(orderFulfillPercentageCountry);
        sb.append(", orderFulfillPercentageLocal=").append(orderFulfillPercentageLocal);
        sb.append(", unitFulfillPercentageCountry=").append(unitFulfillPercentageCountry);
        sb.append(", totalOrderUnits=").append(totalOrderUnits);
        sb.append(", unitFulfillPercentageLocal=").append(unitFulfillPercentageLocal);
        sb.append(", skuFulfillPercentage=").append(skuFulfillPercentage);
        sb.append(", skuFulfillPercentageLocal=").append(skuFulfillPercentageLocal);
        sb.append(", instockPercentage=").append(instockPercentage);
        sb.append(", outStockPercentage=").append(outStockPercentage);
        sb.append(", nonSaleSkuPercentage=").append(nonSaleSkuPercentage);
        sb.append(", instockSkuNum=").append(instockSkuNum);
        sb.append(", instockUnits=").append(instockUnits);
        sb.append(", instockValue=").append(instockValue);
        sb.append(", safeStockUnits=").append(safeStockUnits);
        sb.append(", safeStockValue=").append(safeStockValue);
        sb.append(", stockUnitsOnReplenishing=").append(stockUnitsOnReplenishing);
        sb.append(", stockValueOnReplenishing=").append(stockValueOnReplenishing);
        sb.append(", targetStockValue=").append(targetStockValue);
        sb.append(", nonSaleUnits=").append(nonSaleUnits);
        sb.append(", nonSaleValue=").append(nonSaleValue);
        sb.append(", saleSkuNum=").append(saleSkuNum);
        sb.append(", nonSaleSkuNum=").append(nonSaleSkuNum);
        sb.append(", saleUnits=").append(saleUnits);
        sb.append(", saleValue=").append(saleValue);
        sb.append(", saleUnitsPerDay=").append(saleUnitsPerDay);
        sb.append(", saleValuePerDay=").append(saleValuePerDay);
        sb.append(", stockOutUnits=").append(stockOutUnits);
        sb.append(", stockOutValue=").append(stockOutValue);
        sb.append(", stockOutUnitsPerDay=").append(stockOutUnitsPerDay);
        sb.append(", stockOutValuePerDay=").append(stockOutValuePerDay);
        sb.append(", poNum=").append(poNum);
        sb.append(", poAvgUnits=").append(poAvgUnits);
        sb.append(", poAvgValue=").append(poAvgValue);
        sb.append(", poTotalUnits=").append(poTotalUnits);
        sb.append(", poTotalValue=").append(poTotalValue);
        sb.append(", poMaxUnits=").append(poMaxUnits);
        sb.append(", poMaxValue=").append(poMaxValue);
        sb.append(", poMinUnits=").append(poMinUnits);
        sb.append(", poMinValue=").append(poMinValue);
        sb.append(", inStorageAvgUnits=").append(inStorageAvgUnits);
        sb.append(", inStorageAvgValue=").append(inStorageAvgValue);
        sb.append(", inStorageTotalUnits=").append(inStorageTotalUnits);
        sb.append(", inStorageTotalValue=").append(inStorageTotalValue);
        sb.append(", outstockUnitsPercentage=").append(outstockUnitsPercentage);
        sb.append(", outstockOrderSkusPercentage=").append(outstockOrderSkusPercentage);
        sb.append(", outstockOrdersPercentage=").append(outstockOrdersPercentage);
        sb.append(", crossBorderUnitsRate=").append(crossBorderUnitsRate);
        sb.append(", crossBorderOrderSkusRate=").append(crossBorderOrderSkusRate);
        sb.append(", crossBorderOrderRate=").append(crossBorderOrderRate);
        sb.append(", avgInstockRate=").append(avgInstockRate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}