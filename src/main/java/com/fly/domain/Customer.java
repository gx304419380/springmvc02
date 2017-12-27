package com.fly.domain;

import java.util.Date;

public class Customer {
    private Long custId;

    private String custName;

    private Long custUserId;

    private Long custCreateId;

    private String custSource;

    private String custIndustry;

    private String custLevel;

    private String custLinkman;

    private String custPhone;

    private String custMobile;

    private String custZipcode;

    private String custAddress;

    private Date custCreatetime;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Long getCustUserId() {
        return custUserId;
    }

    public void setCustUserId(Long custUserId) {
        this.custUserId = custUserId;
    }

    public Long getCustCreateId() {
        return custCreateId;
    }

    public void setCustCreateId(Long custCreateId) {
        this.custCreateId = custCreateId;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustLinkman() {
        return custLinkman;
    }

    public void setCustLinkman(String custLinkman) {
        this.custLinkman = custLinkman;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }

    public String getCustZipcode() {
        return custZipcode;
    }

    public void setCustZipcode(String custZipcode) {
        this.custZipcode = custZipcode;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public Date getCustCreatetime() {
        return custCreatetime;
    }

    public void setCustCreatetime(Date custCreatetime) {
        this.custCreatetime = custCreatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", custId=").append(custId);
        sb.append(", custName=").append(custName);
        sb.append(", custUserId=").append(custUserId);
        sb.append(", custCreateId=").append(custCreateId);
        sb.append(", custSource=").append(custSource);
        sb.append(", custIndustry=").append(custIndustry);
        sb.append(", custLevel=").append(custLevel);
        sb.append(", custLinkman=").append(custLinkman);
        sb.append(", custPhone=").append(custPhone);
        sb.append(", custMobile=").append(custMobile);
        sb.append(", custZipcode=").append(custZipcode);
        sb.append(", custAddress=").append(custAddress);
        sb.append(", custCreatetime=").append(custCreatetime);
        sb.append("]");
        return sb.toString();
    }
}