package com.madeofwu.will.pojo;

public class BuyOrder {
    private String boId;

    private Integer supId;

    private Integer shId;

    private String boDate;

    private Integer boPayable;

    private Integer boPaid;

    private Integer boArrears;

    private String boOriginal;

    private String boRemark;

    private String boAttn;

    private Integer boOperator;
    
    private Supplier supplier;
    
    private StoreHouse storeHouse;
    
    private TUser user;
    
    public BuyOrder(){
    	super();
    }

    public BuyOrder(String boId, Integer supId, Integer shId, String boDate,
			Integer boPayable, Integer boPaid, Integer boArrears,
			String boOriginal, String boRemark, String boAttn,
			Integer boOperator) {
		super();
		this.boId = boId;
		this.supId = supId;
		this.shId = shId;
		this.boDate = boDate;
		this.boPayable = boPayable;
		this.boPaid = boPaid;
		this.boArrears = boArrears;
		this.boOriginal = boOriginal;
		this.boRemark = boRemark;
		this.boAttn = boAttn;
		this.boOperator = boOperator;
	}

	@Override
	public String toString() {
		return "BuyOrder [boId=" + boId + ", supId=" + supId + ", shId=" + shId
				+ ", boDate=" + boDate + ", boPayable=" + boPayable
				+ ", boPaid=" + boPaid + ", boArrears=" + boArrears
				+ ", boOriginal=" + boOriginal + ", boRemark=" + boRemark
				+ ", boAttn=" + boAttn + ", boOperator=" + boOperator + "]";
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

	public String getBoId() {
        return boId;
    }

    public void setBoId(String boId) {
        this.boId = boId == null ? null : boId.trim();
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

    public String getBoDate() {
        return boDate;
    }

    public void setBoDate(String boDate) {
        this.boDate = boDate == null ? null : boDate.trim();
    }

    public Integer getBoPayable() {
        return boPayable;
    }

    public void setBoPayable(Integer boPayable) {
        this.boPayable = boPayable;
    }

    public Integer getBoPaid() {
        return boPaid;
    }

    public void setBoPaid(Integer boPaid) {
        this.boPaid = boPaid;
    }

    public Integer getBoArrears() {
        return boArrears;
    }

    public void setBoArrears(Integer boArrears) {
        this.boArrears = boArrears;
    }

    public String getBoOriginal() {
        return boOriginal;
    }

    public void setBoOriginal(String boOriginal) {
        this.boOriginal = boOriginal == null ? null : boOriginal.trim();
    }

    public String getBoRemark() {
        return boRemark;
    }

    public void setBoRemark(String boRemark) {
        this.boRemark = boRemark == null ? null : boRemark.trim();
    }

    public String getBoAttn() {
        return boAttn;
    }

    public void setBoAttn(String boAttn) {
        this.boAttn = boAttn == null ? null : boAttn.trim();
    }

    public Integer getBoOperator() {
        return boOperator;
    }

    public void setBoOperator(Integer boOperator) {
        this.boOperator = boOperator;
    }
}