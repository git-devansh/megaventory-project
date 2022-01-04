package com.megaventory.APIs.discount;

public class DiscountPOJO {
    public String APIKEY;
    public MvDiscount mvDiscount;
    public String mvRecordAction;
}
class MvDiscount{
    public int DiscountID;
    public String DiscountDescription;
    public String DiscountName;
    public double DiscountValue;
}
