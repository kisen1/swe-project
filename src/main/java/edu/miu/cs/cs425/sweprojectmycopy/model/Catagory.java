package edu.miu.cs.cs425.sweprojectmycopy.model;

import java.util.List;

public class Catagory {
    private String cataName;
    private List<SubCatagory> subCatagoryList;

    public Catagory(String cataName) {
        this.cataName = cataName;
    }

    public void addSubCatagory(String subName) {
        subCatagoryList.add(new SubCatagory(subName, this));
    }

    public SubCatagory removeSubCatagory(int index) {
        SubCatagory temp = subCatagoryList.get(index);
        subCatagoryList.remove(index);
        return temp;
    }

    public String getCataName() {
        return cataName;
    }

    public void setCataName(String cataName) {
        this.cataName = cataName;
    }
}
