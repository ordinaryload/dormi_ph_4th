package com.dormi.domain;

public class Administrators {

    private Integer adminId;

    private String adminCard;

    private String adminPhone;

    private String adminPassword;

    private String adminName;

    private String adminBuilding;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminCard() {
        return adminCard;
    }

    public void setAdminCard(String adminCard) {
        this.adminCard = adminCard == null ? null : adminCard.trim();
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminBuilding() {
        return adminBuilding;
    }

    public void setAdminBuilding(String adminBuilding) {
        this.adminBuilding = adminBuilding == null ? null : adminBuilding.trim();
    }
}