package com.megaventory.APIs.salesOrder;

import java.util.List;

public class SalesOrderPOJO {
    public String APIKEY;
    public MvSalesOrder mvSalesOrder;
    public String mvRecordAction;
}

class SalesOrderDetail{
    public String SalesOrderRowProductSKU;
    public String SalesOrderRowQuantity;
    public String SalesOrderRowShippedQuantity;
    public String SalesOrderRowInvoicedQuantity;
    public String SalesOrderRowUnitPriceWithoutTaxOrDiscount;
}

class MvSalesOrder{
    public int SalesOrderClientId;
    public int SalesOrderTypeId;
    public String SalesOrderStatus;
    public List<SalesOrderDetail> SalesOrderDetails;
}
