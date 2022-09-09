package com.adminMintic.AdminMintic.Entities;

public class Enterprice {

    private String nitEnterprice;
    private String nameEnterprice;
    private String adressEnterprice;
    private String phoneEnterprice;

    public Enterprice(String nitEnterprice, String nameEnterprice, String adressEnterprice, String phoneEnterprice) {
        this.nitEnterprice = nitEnterprice;
        this.nameEnterprice = nameEnterprice;
        this.adressEnterprice = adressEnterprice;
        this.phoneEnterprice = phoneEnterprice;
    }

    public Enterprice(){}

    public String getNitEnterprice() {
        return nitEnterprice;
    }

    public void setNitEnterprice(String nitEnterprice) {
        this.nitEnterprice = nitEnterprice;
    }

    public String getNameEnterprice() {
        return nameEnterprice;
    }

    public void setNameEnterprice(String nameEnterprice) {
        this.nameEnterprice = nameEnterprice;
    }

    public String getAdressEnterprice() {
        return adressEnterprice;
    }

    public void setAdressEnterprice(String adressEnterprice) {
        this.adressEnterprice = adressEnterprice;
    }

    public String getPhoneEnterprice() {
        return phoneEnterprice;
    }

    public void setPhoneEnterprice(String phoneEnterprice) {
        this.phoneEnterprice = phoneEnterprice;
    }
}
