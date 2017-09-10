package com.madeofwu.will.pojo;

public class StoreHouse {
    private Integer shId;

    private String shName;

    private String shResponsible;

    private String shPhone;

    private String shAddress;

    private Integer shType;

    private String shRemark;

    private StoreHouseType storeHouseType;
    public StoreHouse(){
    	super();
    }
    public StoreHouse(Integer shId, String shName, String shResponsible,
			String shPhone, String shAddress, Integer shType, String shRemark) {
		super();
		this.shId = shId;
		this.shName = shName;
		this.shResponsible = shResponsible;
		this.shPhone = shPhone;
		this.shAddress = shAddress;
		this.shType = shType;
		this.shRemark = shRemark;
	}

	@Override
	public String toString() {
		return "StoreHouse [shId=" + shId + ", shName=" + shName
				+ ", shResponsible=" + shResponsible + ", shPhone=" + shPhone
				+ ", shAddress=" + shAddress + ", shType=" + shType
				+ ", shRemark=" + shRemark + "]";
	}

	

	public StoreHouseType getStoreHouseType() {
		return storeHouseType;
	}
	public void setStoreHouseType(StoreHouseType storeHouseType) {
		this.storeHouseType = storeHouseType;
	}
	public Integer getShId() {
        return shId;
    }

    public void setShId(Integer shId) {
        this.shId = shId;
    }

    public String getShName() {
        return shName;
    }

    public void setShName(String shName) {
        this.shName = shName == null ? null : shName.trim();
    }

    public String getShResponsible() {
        return shResponsible;
    }

    public void setShResponsible(String shResponsible) {
        this.shResponsible = shResponsible == null ? null : shResponsible.trim();
    }

    public String getShPhone() {
        return shPhone;
    }

    public void setShPhone(String shPhone) {
        this.shPhone = shPhone == null ? null : shPhone.trim();
    }

    public String getShAddress() {
        return shAddress;
    }

    public void setShAddress(String shAddress) {
        this.shAddress = shAddress == null ? null : shAddress.trim();
    }

    public Integer getShType() {
        return shType;
    }

    public void setShType(Integer shType) {
        this.shType = shType;
    }

    public String getShRemark() {
        return shRemark;
    }

    public void setShRemark(String shRemark) {
        this.shRemark = shRemark == null ? null : shRemark.trim();
    }
}