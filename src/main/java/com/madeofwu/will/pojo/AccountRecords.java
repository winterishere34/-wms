package com.madeofwu.will.pojo;

public class AccountRecords {
	private String arId;

	private Integer supId;

	private Integer shId;

	private String arDate;

	private String goodsId;

	private String goodsName;

	private String goodsUnit;

	private String goodsType;

	private String goodsColor;

	private Integer arAmount;

	private Integer arPrice;

	private Integer arPayable;

	private Integer arPaid;

	private Integer arArrears;

	private Integer arDiscount;

	private String arAttn;

	private Integer arOperator;

	private String arRemark;

	private Supplier supplier;

	private StoreHouse storeHouse;

	private TUser user;

	public AccountRecords() {
		super();
	}

	public AccountRecords(String arId, Integer supId, Integer shId,
			String arDate, String goodsId, String goodsName, String goodsUnit,
			String goodsType, String goodsColor, Integer arAmount,
			Integer arPrice, Integer arPayable, Integer arPaid,
			Integer arArrears, Integer arDiscount, String arAttn,
			Integer arOperator, String arRemark) {
		super();
		this.arId = arId;
		this.supId = supId;
		this.shId = shId;
		this.arDate = arDate;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsUnit = goodsUnit;
		this.goodsType = goodsType;
		this.goodsColor = goodsColor;
		this.arAmount = arAmount;
		this.arPrice = arPrice;
		this.arPayable = arPayable;
		this.arPaid = arPaid;
		this.arArrears = arArrears;
		this.arDiscount = arDiscount;
		this.arAttn = arAttn;
		this.arOperator = arOperator;
		this.arRemark = arRemark;
	}

	@Override
	public String toString() {
		return "AccountRecords [arId=" + arId + ", supId=" + supId + ", shId="
				+ shId + ", arDate=" + arDate + ", goodsId=" + goodsId
				+ ", goodsName=" + goodsName + ", goodsUnit=" + goodsUnit
				+ ", goodsType=" + goodsType + ", goodsColor=" + goodsColor
				+ ", arAmount=" + arAmount + ", arPrice=" + arPrice
				+ ", arPayable=" + arPayable + ", arPaid=" + arPaid
				+ ", arArrears=" + arArrears + ", arDiscount=" + arDiscount
				+ ", arAttn=" + arAttn + ", arOperator=" + arOperator
				+ ", arRemark=" + arRemark + "]";
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

	public TUser getUser() {
		return user;
	}

	public void setUser(TUser user) {
		this.user = user;
	}

	public String getArId() {
		return arId;
	}

	public void setArId(String arId) {
		this.arId = arId == null ? null : arId.trim();
	}

	public Integer getSupId() {
		return supId;
	}

	public void setSupId(Integer supId) {
		this.supId = supId;
	}

	public Integer getShId() {
		return shId;
	}

	public void setShId(Integer shId) {
		this.shId = shId;
	}

	public String getArDate() {
		return arDate;
	}

	public void setArDate(String arDate) {
		this.arDate = arDate == null ? null : arDate.trim();
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

	public Integer getArAmount() {
		return arAmount;
	}

	public void setArAmount(Integer arAmount) {
		this.arAmount = arAmount;
	}

	public Integer getArPrice() {
		return arPrice;
	}

	public void setArPrice(Integer arPrice) {
		this.arPrice = arPrice;
	}

	public Integer getArPayable() {
		return arPayable;
	}

	public void setArPayable(Integer arPayable) {
		this.arPayable = arPayable;
	}

	public Integer getArPaid() {
		return arPaid;
	}

	public void setArPaid(Integer arPaid) {
		this.arPaid = arPaid;
	}

	public Integer getArArrears() {
		return arArrears;
	}

	public void setArArrears(Integer arArrears) {
		this.arArrears = arArrears;
	}

	public Integer getArDiscount() {
		return arDiscount;
	}

	public void setArDiscount(Integer arDiscount) {
		this.arDiscount = arDiscount;
	}

	public String getArAttn() {
		return arAttn;
	}

	public void setArAttn(String arAttn) {
		this.arAttn = arAttn == null ? null : arAttn.trim();
	}

	public Integer getArOperator() {
		return arOperator;
	}

	public void setArOperator(Integer arOperator) {
		this.arOperator = arOperator;
	}

	public String getArRemark() {
		return arRemark;
	}

	public void setArRemark(String arRemark) {
		this.arRemark = arRemark == null ? null : arRemark.trim();
	}
}