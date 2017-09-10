package com.madeofwu.will.pojo;

public class BuyOrderDetail {
    private String bodId;

    private String goodsId;

    private String goodsName;

    private String goodsUnit;

    private String goodsType;

    private String goodsColor;

    private String goodsProducer;

    private Integer bodAmount;

    private Integer bodBuyPrice;

    private Integer bodTotalPrice;

    private String boId;

    public BuyOrderDetail(){
    	super();
    }
    public BuyOrderDetail(String bodId, String goodsId, String goodsName,
			String goodsUnit, String goodsType, String goodsColor,
			String goodsProducer, Integer bodAmount, Integer bodBuyPrice,
			Integer bodTotalPrice, String boId) {
		super();
		this.bodId = bodId;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsUnit = goodsUnit;
		this.goodsType = goodsType;
		this.goodsColor = goodsColor;
		this.goodsProducer = goodsProducer;
		this.bodAmount = bodAmount;
		this.bodBuyPrice = bodBuyPrice;
		this.bodTotalPrice = bodTotalPrice;
		this.boId = boId;
	}

	@Override
	public String toString() {
		return "BuyOrderDetail [bodId=" + bodId + ", goodsId=" + goodsId
				+ ", goodsName=" + goodsName + ", goodsUnit=" + goodsUnit
				+ ", goodsType=" + goodsType + ", goodsColor=" + goodsColor
				+ ", goodsProducer=" + goodsProducer + ", bodAmount="
				+ bodAmount + ", bodBuyPrice=" + bodBuyPrice
				+ ", bodTotalPrice=" + bodTotalPrice + ", boId=" + boId + "]";
	}

	public String getBodId() {
        return bodId;
    }

    public void setBodId(String bodId) {
        this.bodId = bodId == null ? null : bodId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit == null ? null : goodsUnit.trim();
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

    public String getGoodsProducer() {
        return goodsProducer;
    }

    public void setGoodsProducer(String goodsProducer) {
        this.goodsProducer = goodsProducer == null ? null : goodsProducer.trim();
    }

    public Integer getBodAmount() {
        return bodAmount;
    }

    public void setBodAmount(Integer bodAmount) {
        this.bodAmount = bodAmount;
    }

    public Integer getBodBuyPrice() {
        return bodBuyPrice;
    }

    public void setBodBuyPrice(Integer bodBuyPrice) {
        this.bodBuyPrice = bodBuyPrice;
    }

    public Integer getBodTotalPrice() {
        return bodTotalPrice;
    }

    public void setBodTotalPrice(Integer bodTotalPrice) {
        this.bodTotalPrice = bodTotalPrice;
    }

    public String getBoId() {
        return boId;
    }

    public void setBoId(String boId) {
        this.boId = boId == null ? null : boId.trim();
    }
}