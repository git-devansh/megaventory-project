package com.megaventory.APIs.inventoryLocation;

public class InventoryLocationPOJO {
    public String APIKEY;
    public MvInventoryLocation mvInventoryLocation;
    public String mvRecordAction;
    public String mvInsertUpdateDeleteSourceApplication;
}

class MvInventoryLocation{
    public int InventoryLocationID;
    public String InventoryLocationName;
    public String InventoryLocationAbbreviation;
    public String InventoryLocationAddress;
    public String InventoryLocationCurrencyCode;
}
