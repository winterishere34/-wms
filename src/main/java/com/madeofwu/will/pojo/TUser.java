package com.madeofwu.will.pojo;

import java.io.Serializable;

public class TUser implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Long id;

    private String username;

    private String password;

    private String truename;

    private String phone;

    private String email;

    private String address;

    private Integer roleid;

    private Boolean locaked;

    private String salt;
    
    private Boolean locked = Boolean.FALSE;
    
    public TUser() {  
    }  
  
    public TUser(String username, String password) {  
        this.username = username;  
        this.password = password;  
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Boolean getLocaked() {
        return locaked;
    }

    public void setLocaked(Boolean locaked) {
        this.locaked = locaked;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }
    
    public String getCredentialsSalt() {  
        return username + salt;  
    }
    
    @Override  
    public boolean equals(Object o) {  
        if (this == o)  
            return true;  
        if (o == null || getClass() != o.getClass())  
            return false;  
  
        TUser user = (TUser) o;  
  
        if (id != null ? !id.equals(user.id) : user.id != null)  
            return false;  
  
        return true;  
    }
    
    @Override  
    public int hashCode() {  
        return id != null ? id.hashCode() : 0;  
    }
    
    @Override  
    public String toString() {  
        return "TUser{" + "id=" + id + ", username='" + username + '\''  
                + ", password='" + password + '\'' + ", salt='" + salt + '\''  
                + ", locked=" + locked + '}';  
    } 
    
    
}