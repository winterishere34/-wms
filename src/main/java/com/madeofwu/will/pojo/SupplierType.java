package com.madeofwu.will.pojo;

public class SupplierType implements java.io.Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String supplierTypename;

    public SupplierType(){
    	super();
    }
    public SupplierType(Integer id, String supplierTypename) {
		super();
		this.id = id;
		this.supplierTypename = supplierTypename;
	}

	@Override
	public String toString() {
		return "SupplierType [id=" + id + ", supplierTypename="
				+ supplierTypename + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplierTypename() {
        return supplierTypename;
    }

    public void setSupplierTypename(String supplierTypename) {
        this.supplierTypename = supplierTypename == null ? null : supplierTypename.trim();
    }
}