package com.example.cs425sweprojectwebshopapp.model;

public class SubCatagory {
    private String subCataName;
    private Catagory catagory;

    public SubCatagory(String subCataName, Catagory catagory) {
        this.subCataName = subCataName;
        this.catagory = catagory;
    }

    public String getSubCataName() {
        return subCataName;
    }

    public void setSubCataName(String subCataName) {
        this.subCataName = subCataName;
    }

    public Catagory getCatagory() {
        return catagory;
    }

    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }
}
