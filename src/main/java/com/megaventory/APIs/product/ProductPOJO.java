package com.megaventory.APIs.product;

public class ProductPOJO {
    public String APIKEY;
    public MvProduct mvProduct;
    public String mvRecordAction;
    public String mvInsertUpdateDeleteSourceApplication;
}

class MvProduct{
    public int ProductID;
    public String ProductSKU;
    public String ProductType;
    public String ProductDescription;

    public double ProductSellingPrice;
    public double ProductPurchasePrice;
}

