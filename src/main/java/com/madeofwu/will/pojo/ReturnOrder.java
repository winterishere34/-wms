package com.madeofwu.will.pojo;

public class ReturnOrder {
	private String roId;

	private Integer supId;

	private Integer shId;

	private String roDate;

	private Integer roPayable;

	private Integer roPaid;

	private String roOriginal;

	private String roRemark;

	private String roAttn;

	private Integer roOperator;

	private Supplier supplier;

	private StoreHouse storeHouse;

	private TUser user;

	public ReturnOrder() {
		super();
	}

	public ReturnOrder(String roId, Integer supId, Integer shId, String roDate,
			Integer roPayable, Integer roPaid, String roOriginal,
			String roRemark, String roAttn, Integer roOperator) {
		super();
		this.roId = roId;
		this.supId = supId;
		this.shId = shId;
		this.roDate = roDate;
		this.roPayable = roPayable;
		this.roPaid = roPaid;
		this.roOriginal = roOriginal;
		this.roRemark = roRemark;
		this.roAttn = roAttn;
		this.roOperator = roOperator;
	}

	@Override
	public String toString() {
		return "ReturnOrder [roId=" + roId + ", supId=" + supId + ", shId="
				+ shId + ", roDate=" + roDate + ", roPayable=" + roPayable
				+ ", roPaid=" + roPaid + ", roOriginal=" + roOriginal
				+ ", roRemark=" + roRemark + ", roAttn=" + roAttn
				+ ", roOperator=" + roOperator + "]";
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

	public String getRoId() {
		return roId;
	}

	public void setRoId(String roId) {
		this.roId = roId == null ? null : roId.trim();
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

	public String getRoDate() {
		return roDate;
	}

	public void setRoDate(String roDate) {
		this.roDate = roDate == null ? null : roDate.trim();
	}

	public Integer getRoPayable() {
		return roPayable;
	}

	public void setRoPayable(Integer roPayable) {
		this.roPayable = roPayable;
	}

	public Integer getRoPaid() {
		return roPaid;
	}

	public void setRoPaid(Integer roPaid) {
		this.roPaid = roPaid;
	}

	public String getRoOriginal() {
		return roOriginal;
	}

	public void setRoOriginal(String roOriginal) {
		this.roOriginal = roOriginal == null ? null : roOriginal.trim();
	}

	public String getRoRemark() {
		return roRemark;
	}

	public void setRoRemark(String roRemark) {
		this.roRemark = roRemark == null ? null : roRemark.trim();
	}

	public String getRoAttn() {
		return roAttn;
	}

	public void setRoAttn(String roAttn) {
		this.roAttn = roAttn == null ? null : roAttn.trim();
	}

	public Integer getRoOperator() {
		return roOperator;
	}

	public void setRoOperator(Integer roOperator) {
		this.roOperator = roOperator;
	}
}