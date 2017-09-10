package com.madeofwu.will.pojo;

public class Goods {
    private String goodsId;

    private String goodsName;

    private String goodsUnit;

    private String goodsType;

    private String goodsColor;

    private Integer goodsStore;

    private String goodsProducer;

    private String goodsRemark;

    private Integer goodsSelPrice;

    private Integer goodsBuyPrice;

    private Integer goodsStoreId;

    private Integer goodsSupplierId;

    private String goodsCreated;

    private String goodsUpdated;
    
    private Supplier supplier;
    
    private StoreHouse storeHouse;
    
    public Goods(){
    	super();
    }

    public Goods(String goodsId, String goodsName, String goodsUnit,
			String goodsType, String goodsColor, Integer goodsStore,
			String goodsProducer, String goodsRemark, Integer goodsSelPrice,
			Integer goodsBuyPrice, Integer goodsStoreId,
			Integer goodsSupplierId, String goodsCreated, String goodsUpdated) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsUnit = goodsUnit;
		this.goodsType = goodsType;
		this.goodsColor = goodsColor;
		this.goodsStore = goodsStore;
		this.goodsProducer = goodsProducer;
		this.goodsRemark = goodsRemark;
		this.goodsSelPrice = goodsSelPrice;
		this.goodsBuyPrice = goodsBuyPrice;
		this.goodsStoreId = goodsStoreId;
		this.goodsSupplierId = goodsSupplierId;
		this.goodsCreated = goodsCreated;
		this.goodsUpdated = goodsUpdated;
	}

	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName
				+ ", goodsUnit=" + goodsUnit + ", goodsType=" + goodsType
				+ ", goodsColor=" + goodsColor + ", goodsStore=" + goodsStore
				+ ", goodsProducer=" + goodsProducer + ", goodsRemark="
				+ goodsRemark + ", goodsSelPrice=" + goodsSelPrice
				+ ", goodsBuyPrice=" + goodsBuyPrice + ", goodsStoreId="
				+ goodsStoreId + ", goodsSupplierId=" + goodsSupplierId
				+ ", goodsCreated=" + goodsCreated + ", goodsUpdated="
				+ goodsUpdated + "]";
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public StoreHouse getStoreHouse() {
		return storeHouse;
	}

	public void setStoreHouse(StoreHouse storeHouse) {
		this.storeHouse = storeHouse;
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

    public Integer getGoodsStore() {
        return goodsStore;
    }

    public void setGoodsStore(Integer goodsStore) {
        this.goodsStore = goodsStore;
    }

    public String getGoodsProducer() {
        return goodsProducer;
    }

    public void setGoodsProducer(String goodsProducer) {
        this.goodsProducer = goodsProducer == null ? null : goodsProducer.trim();
    }

    public String getGoodsRemark() {
        return goodsRemark;
    }

    public void setGoodsRemark(String goodsRemark) {
        this.goodsRemark = goodsRemark == null ? null : goodsRemark.trim();
    }

    public Integer getGoodsSelPrice() {
        return goodsSelPrice;
    }

    public void setGoodsSelPrice(Integer goodsSelPrice) {
        this.goodsSelPrice = goodsSelPrice;
    }

    public Integer getGoodsBuyPrice() {
        return goodsBuyPrice;
    }

    public void setGoodsBuyPrice(Integer goodsBuyPrice) {
        this.goodsBuyPrice = goodsBuyPrice;
    }

    public Integer getGoodsStoreId() {
        return goodsStoreId;
    }

    public void setGoodsStoreId(Integer goodsStoreId) {
        this.goodsStoreId = goodsStoreId;
    }

    public Integer getGoodsSupplierId() {
        return goodsSupplierId;
    }

    public void setGoodsSupplierId(Integer goodsSupplierId) {
        this.goodsSupplierId = goodsSupplierId;
    }

    public String getGoodsCreated() {
        return goodsCreated;
    }

    public void setGoodsCreated(String goodsCreated) {
        this.goodsCreated = goodsCreated;
    }

    public String getGoodsUpdated() {
        return goodsUpdated;
    }

    public void setGoodsUpdated(String goodsUpdated) {
        this.goodsUpdated = goodsUpdated;
    }
}