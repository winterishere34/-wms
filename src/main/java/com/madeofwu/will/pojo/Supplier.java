package com.madeofwu.will.pojo;

import java.math.BigDecimal;

public class Supplier implements java.io.Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer supId;

    private String supName;

    private String supLinkman;

    private String supPhone;

    private String supAddress;

    private String supRemark;

    private BigDecimal supPay;

    private Integer supType;

    private SupplierType supplierType;
    
    public Supplier(){
    	super();
    }
    public Supplier(Integer supId, String supName, String supLinkman,
			String supPhone, String supAddress, String supRemark,
			BigDecimal supPay, Integer supType) {
		super();
		this.supId = supId;
		this.supName = supName;
		this.supLinkman = supLinkman;
		this.supPhone = supPhone;
		this.supAddress = supAddress;
		this.supRemark = supRemark;
		this.supPay = supPay;
		this.supType = supType;
	}

	@Override
	public String toString() {
		return "Supplier [supId=" + supId + ", supName=" + supName
				+ ", supLinkman=" + supLinkman + ", supPhone=" + supPhone
				+ ", supAddress=" + supAddress + ", supRemark=" + supRemark
				+ ", supPay=" + supPay + ", supType=" + supType + "]";
	}

	public SupplierType getSupplierType() {
		return supplierType;
	}
	public void setSupplierType(SupplierType supplierType) {
		this.supplierType = supplierType;
	}
	public Integer getSupId() {
        return supId;
    }

    public void setSupId(Integer supId) {
        this.supId = supId;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName == null ? null : supName.trim();
    }

    public String getSupLinkman() {
        return supLinkman;
    }

    public void setSupLinkman(String supLinkman) {
        this.supLinkman = supLinkman == null ? null : supLinkman.trim();
    }

    public String getSupPhone() {
        return supPhone;
    }

    public void setSupPhone(String supPhone) {
        this.supPhone = supPhone == null ? null : supPhone.trim();
    }

    public String getSupAddress() {
        return supAddress;
    }

    public void setSupAddress(String supAddress) {
        this.supAddress = supAddress == null ? null : supAddress.trim();
    }

    public String getSupRemark() {
        return supRemark;
    }

    public void setSupRemark(String supRemark) {
        this.supRemark = supRemark == null ? null : supRemark.trim();
    }

    public BigDecimal getSupPay() {
        return supPay;
    }

    public void setSupPay(BigDecimal supPay) {
        this.supPay = supPay;
    }

    public Integer getSupType() {
        return supType;
    }

    public void setSupType(Integer supType) {
        this.supType = supType;
    }
}