package com.madeofwu.will.pojo;

public class StoreHouseType {
    private Integer id;

    private String storeHouseTypename;
    
    public StoreHouseType(){
    	super();
    }
    public StoreHouseType(Integer id, String storeHouseTypename) {
		super();
		this.id = id;
		this.storeHouseTypename = storeHouseTypename;
	}

	@Override
	public String toString() {
		return "StoreHouseType [id=" + id + ", storeHouseTypename="
				+ storeHouseTypename + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreHouseTypename() {
        return storeHouseTypename;
    }

    public void setStoreHouseTypename(String storeHouseTypename) {
        this.storeHouseTypename = storeHouseTypename == null ? null : storeHouseTypename.trim();
    }
}