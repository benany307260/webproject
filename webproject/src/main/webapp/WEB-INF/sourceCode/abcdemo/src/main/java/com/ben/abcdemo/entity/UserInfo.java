package com.ben.abcdemo.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user_info")
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
    /**
    * 
    */
	@Id
    @GeneratedValue
    @Column(name = "ID")
    private String id;
    
    /**
    * 
    */
    @Column(name = "USERNAME")
    private String username;
    
    /**
    * 
    */
    @Column(name = "PASSWORD")
    private String password;
    
    /**
    * 
    */
    @Column(name = "USER_TYPE")
    private String userType;
    
    /**
    * 
    */
    @Column(name = "USER_FROM")
    private String userFrom;
    
    /**
    * 
    */
    @Column(name = "USER_NO")
    private String userNo;
    
    /**
    * 
    */
    @Column(name = "USER_REAL_NAME")
    private String userRealName;
    
    /**
    * 
    */
    @Column(name = "ORG_CODE")
    private String orgCode;
    
    /**
    * 
    */
    @Column(name = "IS_ENABLED")
    private String isEnabled;
    
    /**
    * 
    */
    @Column(name = "LOCALE")
    private String locale;
    
    /**
    * 
    */
    @Column(name = "TIMEZONE")
    private String timezone;
    
    /**
    * 
    */
    @Column(name = "THEME")
    private String theme;
    
    /**
    * 
    */
    @Column(name = "SEX")
    private String sex;
    
    /**
    * 
    */
    @Column(name = "MOBILE")
    private String mobile;
    
    /**
    * 
    */
    @Column(name = "EMAIL")
    private String email;
    
    /**
    * 
    */
    @Column(name = "CREATE_USERID")
    private String createUserid;
    
    /**
    * 
    */
    @Column(name = "UPDATE_USERID")
    private String updateUserid;
    
    /**
    * 
    */
    @Column(name = "CREATE_TIME")
    private String createTime;
    
    /**
    * 
    */
    @Column(name = "UPDATE_TIME")
    private String updateTime;
    
	
	
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return this.userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserFrom() {
        return this.userFrom;
    }

    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

    public String getUserNo() {
        return this.userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserRealName() {
        return this.userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getIsEnabled() {
        return this.isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getLocale() {
        return this.locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTheme() {
        return this.theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreateUserid() {
        return this.createUserid;
    }

    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid;
    }

    public String getUpdateUserid() {
        return this.updateUserid;
    }

    public void setUpdateUserid(String updateUserid) {
        this.updateUserid = updateUserid;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

}