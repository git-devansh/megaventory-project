package com.megaventory.APIs.tax;

public class TaxPOJO {
    public String APIKEY;
    public MvTax mvTax;
    public String mvRecordAction;
}

class MvTax{
    public String TaxName;
    public String TaxDescription;
    public double TaxValue;
}
