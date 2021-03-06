package com.sofn.model.generator;

import com.sofn.core.base.BaseModel;

@SuppressWarnings("serial")
public class AsmsSubjEnforceLaw extends BaseModel {
    private String elName;

    private String elCode;

    private String elType;

    private String elLevel;

    private String elAreaId;

    private String elAddress;

    private String elLeader;

    private String elLeaderPhone;

    private String elContact;

    private String elContactPhone;

    private String elContactQQ;

    private String elContactEmail;

    private String elPostcode;

    private String status;

    private String elUnitNature;

    private String elWorkBody;

    private String elLevelId;

    private String elTypeId;

    private String elArea;

    private String elPeopleNum;

    public String getElName() {
        return elName;
    }

    public void setElName(String elName) {
        this.elName = elName == null ? null : elName.trim();
    }

    public String getElCode() {
        return elCode;
    }

    public void setElCode(String elCode) {
        this.elCode = elCode == null ? null : elCode.trim();
    }

    public String getElType() {
        return elType;
    }

    public void setElType(String elType) {
        this.elType = elType == null ? null : elType.trim();
    }

    public String getElLevel() {
        return elLevel;
    }

    public void setElLevel(String elLevel) {
        this.elLevel = elLevel == null ? null : elLevel.trim();
    }

    public String getElAreaId() {
        return elAreaId;
    }

    public void setElAreaId(String elAreaId) {
        this.elAreaId = elAreaId == null ? null : elAreaId.trim();
    }

    public String getElAddress() {
        return elAddress;
    }

    public void setElAddress(String elAddress) {
        this.elAddress = elAddress == null ? null : elAddress.trim();
    }

    public String getElLeader() {
        return elLeader;
    }

    public void setElLeader(String elLeader) {
        this.elLeader = elLeader == null ? null : elLeader.trim();
    }

    public String getElLeaderPhone() {
        return elLeaderPhone;
    }

    public void setElLeaderPhone(String elLeaderPhone) {
        this.elLeaderPhone = elLeaderPhone == null ? null : elLeaderPhone.trim();
    }

    public String getElContact() {
        return elContact;
    }

    public void setElContact(String elContact) {
        this.elContact = elContact == null ? null : elContact.trim();
    }

    public String getElContactPhone() {
        return elContactPhone;
    }

    public void setElContactPhone(String elContactPhone) {
        this.elContactPhone = elContactPhone == null ? null : elContactPhone.trim();
    }

    public String getElContactQQ() {
        return elContactQQ;
    }

    public void setElContactQQ(String elContactQQ) {
        this.elContactQQ = elContactQQ == null ? null : elContactQQ.trim();
    }

    public String getElContactEmail() {
        return elContactEmail;
    }

    public void setElContactEmail(String elContactEmail) {
        this.elContactEmail = elContactEmail == null ? null : elContactEmail.trim();
    }

    public String getElPostcode() {
        return elPostcode;
    }

    public void setElPostcode(String elPostcode) {
        this.elPostcode = elPostcode == null ? null : elPostcode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getElUnitNature() {
        return elUnitNature;
    }

    public void setElUnitNature(String elUnitNature) {
        this.elUnitNature = elUnitNature == null ? null : elUnitNature.trim();
    }

    public String getElWorkBody() {
        return elWorkBody;
    }

    public void setElWorkBody(String elWorkBody) {
        this.elWorkBody = elWorkBody == null ? null : elWorkBody.trim();
    }

    public String getElLevelId() {
        return elLevelId;
    }

    public void setElLevelId(String elLevelId) {
        this.elLevelId = elLevelId == null ? null : elLevelId.trim();
    }

    public String getElTypeId() {
        return elTypeId;
    }

    public void setElTypeId(String elTypeId) {
        this.elTypeId = elTypeId == null ? null : elTypeId.trim();
    }

    public String getElArea() {
        return elArea;
    }

    public void setElArea(String elArea) {
        this.elArea = elArea == null ? null : elArea.trim();
    }

    public String getElPeopleNum() {
        return elPeopleNum;
    }

    public void setElPeopleNum(String elPeopleNum) {
        this.elPeopleNum = elPeopleNum == null ? null : elPeopleNum.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elName=").append(elName);
        sb.append(", elCode=").append(elCode);
        sb.append(", elType=").append(elType);
        sb.append(", elLevel=").append(elLevel);
        sb.append(", elAreaId=").append(elAreaId);
        sb.append(", elAddress=").append(elAddress);
        sb.append(", elLeader=").append(elLeader);
        sb.append(", elLeaderPhone=").append(elLeaderPhone);
        sb.append(", elContact=").append(elContact);
        sb.append(", elContactPhone=").append(elContactPhone);
        sb.append(", elContactQQ=").append(elContactQQ);
        sb.append(", elContactEmail=").append(elContactEmail);
        sb.append(", elPostcode=").append(elPostcode);
        sb.append(", status=").append(status);
        sb.append(", elUnitNature=").append(elUnitNature);
        sb.append(", elWorkBody=").append(elWorkBody);
        sb.append(", elLevelId=").append(elLevelId);
        sb.append(", elTypeId=").append(elTypeId);
        sb.append(", elArea=").append(elArea);
        sb.append(", elPeopleNum=").append(elPeopleNum);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AsmsSubjEnforceLaw other = (AsmsSubjEnforceLaw) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getElName() == null ? other.getElName() == null : this.getElName().equals(other.getElName()))
            && (this.getElCode() == null ? other.getElCode() == null : this.getElCode().equals(other.getElCode()))
            && (this.getElType() == null ? other.getElType() == null : this.getElType().equals(other.getElType()))
            && (this.getElLevel() == null ? other.getElLevel() == null : this.getElLevel().equals(other.getElLevel()))
            && (this.getElAreaId() == null ? other.getElAreaId() == null : this.getElAreaId().equals(other.getElAreaId()))
            && (this.getElAddress() == null ? other.getElAddress() == null : this.getElAddress().equals(other.getElAddress()))
            && (this.getElLeader() == null ? other.getElLeader() == null : this.getElLeader().equals(other.getElLeader()))
            && (this.getElLeaderPhone() == null ? other.getElLeaderPhone() == null : this.getElLeaderPhone().equals(other.getElLeaderPhone()))
            && (this.getElContact() == null ? other.getElContact() == null : this.getElContact().equals(other.getElContact()))
            && (this.getElContactPhone() == null ? other.getElContactPhone() == null : this.getElContactPhone().equals(other.getElContactPhone()))
            && (this.getElContactQQ() == null ? other.getElContactQQ() == null : this.getElContactQQ().equals(other.getElContactQQ()))
            && (this.getElContactEmail() == null ? other.getElContactEmail() == null : this.getElContactEmail().equals(other.getElContactEmail()))
            && (this.getElPostcode() == null ? other.getElPostcode() == null : this.getElPostcode().equals(other.getElPostcode()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getElUnitNature() == null ? other.getElUnitNature() == null : this.getElUnitNature().equals(other.getElUnitNature()))
            && (this.getElWorkBody() == null ? other.getElWorkBody() == null : this.getElWorkBody().equals(other.getElWorkBody()))
            && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()))
            && (this.getElLevelId() == null ? other.getElLevelId() == null : this.getElLevelId().equals(other.getElLevelId()))
            && (this.getElTypeId() == null ? other.getElTypeId() == null : this.getElTypeId().equals(other.getElTypeId()))
            && (this.getElArea() == null ? other.getElArea() == null : this.getElArea().equals(other.getElArea()))
            && (this.getElPeopleNum() == null ? other.getElPeopleNum() == null : this.getElPeopleNum().equals(other.getElPeopleNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getElName() == null) ? 0 : getElName().hashCode());
        result = prime * result + ((getElCode() == null) ? 0 : getElCode().hashCode());
        result = prime * result + ((getElType() == null) ? 0 : getElType().hashCode());
        result = prime * result + ((getElLevel() == null) ? 0 : getElLevel().hashCode());
        result = prime * result + ((getElAreaId() == null) ? 0 : getElAreaId().hashCode());
        result = prime * result + ((getElAddress() == null) ? 0 : getElAddress().hashCode());
        result = prime * result + ((getElLeader() == null) ? 0 : getElLeader().hashCode());
        result = prime * result + ((getElLeaderPhone() == null) ? 0 : getElLeaderPhone().hashCode());
        result = prime * result + ((getElContact() == null) ? 0 : getElContact().hashCode());
        result = prime * result + ((getElContactPhone() == null) ? 0 : getElContactPhone().hashCode());
        result = prime * result + ((getElContactQQ() == null) ? 0 : getElContactQQ().hashCode());
        result = prime * result + ((getElContactEmail() == null) ? 0 : getElContactEmail().hashCode());
        result = prime * result + ((getElPostcode() == null) ? 0 : getElPostcode().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getElUnitNature() == null) ? 0 : getElUnitNature().hashCode());
        result = prime * result + ((getElWorkBody() == null) ? 0 : getElWorkBody().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        result = prime * result + ((getElLevelId() == null) ? 0 : getElLevelId().hashCode());
        result = prime * result + ((getElTypeId() == null) ? 0 : getElTypeId().hashCode());
        result = prime * result + ((getElArea() == null) ? 0 : getElArea().hashCode());
        result = prime * result + ((getElPeopleNum() == null) ? 0 : getElPeopleNum().hashCode());
        return result;
    }
}