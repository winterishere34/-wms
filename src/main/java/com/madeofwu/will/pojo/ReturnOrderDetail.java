package com.madeofwu.will.pojo;

public class ReturnOrderDetail {
    private String rodId;

    private String goodsId;

    private String goodsUnit;

    private String goodsName;

    private String goodsType;

    private String goodsColor;

    private Integer rodAmount;

    private Integer rodReturnPrice;

    private Integer rodTotalPrice;

    private String roId;

    public ReturnOrderDetail(){
    	super();
    }
    public ReturnOrderDetail(String rodId, String goodsId, String goodsUnit,
			String goodsName, String goodsType, String goodsColor,
			Integer rodAmount, Integer rodReturnPrice, Integer rodTotalPrice,
			String roId) {
		super();
		this.rodId = rodId;
		this.goodsId = goodsId;
		this.goodsUnit = goodsUnit;
		this.goodsName = goodsName;
		this.goodsType = goodsType;
		this.goodsColor = goodsColor;
		this.rodAmount = rodAmount;
		this.rodReturnPrice = rodReturnPrice;
		this.rodTotalPrice = rodTotalPrice;
		this.roId = roId;
	}

	@Override
	public String toString() {
		return "ReturnOrderDetail [rodId=" + rodId + ", goodsId=" + goodsId
				+ ", goodsUnit=" + goodsUnit + ", goodsName=" + goodsName
				+ ", goodsType=" + goodsType + ", goodsColor=" + goodsColor
				+ ", rodAmount=" + rodAmount + ", rodReturnPrice="
				+ rodReturnPrice + ", rodTotalPrice=" + rodTotalPrice
				+ ", roId=" + roId + "]";
	}

	public String getRodId() {
        return rodId;
    }

    public void setRodId(String rodId) {
        this.rodId = rodId == null ? null : rodId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit == null ? null : goodsUnit.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public String getGoodsColor() {
        return goodsColor;
    }

    public void setGoodsColor(String goodsColor) {
        this.goodsColor = goodsColor == null ? null : goodsColor.trim();
    }

    public Integer getRodAmount() {
        return rodAmount;
    }

    public void setRodAmount(Integer rodAmount) {
        this.rodAmount = rodAmount;
    }

    public Integer getRodReturnPrice() {
        return rodReturnPrice;
    }

    public void setRodReturnPrice(Integer rodReturnPrice) {
        this.rodReturnPrice = rodReturnPrice;
    }

    public Integer getRodTotalPrice() {
        return rodTotalPrice;
    }

    public void setRodTotalPrice(Integer rodTotalPrice) {
        this.rodTotalPrice = rodTotalPrice;
    }

    public String getRoId() {
        return roId;
    }

    public void setRoId(String roId) {
        this.roId = roId == null ? null : roId.trim();
    }
}