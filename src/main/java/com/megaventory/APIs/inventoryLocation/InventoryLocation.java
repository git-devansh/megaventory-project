package com.megaventory.APIs.inventoryLocation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.megaventory.Resource.Constant;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class InventoryLocation {

    public String setInventoryLocation() throws IOException, InterruptedException {
//        MvInventoryLocation mvInventoryLocation = new MvInventoryLocation();
//        mvInventoryLocation.InventoryLocationID = 3410;
//        mvInventoryLocation.InventoryLocationName = "Megaventory Warehouse";
//        mvInventoryLocation.InventoryLocationAbbreviation = "MVWH";
//        mvInventoryLocation.InventoryLocationAddress = "Megaventory Central Warehouse, Texas";
//        mvInventoryLocation.InventoryLocationCurrencyCode = "USD";
//
//        InventoryLocationPOJO inventoryLocationPOJO = new InventoryLocationPOJO();
//        inventoryLocationPOJO.APIKEY = Constant.API_KEY;
//        inventoryLocationPOJO.mvInventoryLocation = mvInventoryLocation;
//        inventoryLocationPOJO.mvRecordAction = "InsertOrUpdateNonEmptyFields";

        MvInventoryLocation mvInventoryLocation = new MvInventoryLocation();
        mvInventoryLocation.InventoryLocationName = "Test Project Location";
        mvInventoryLocation.InventoryLocationAbbreviation = "Test";
        mvInventoryLocation.InventoryLocationAddress = "Example 20, Athens ";

        InventoryLocationPOJO inventoryLocationPOJO = new InventoryLocationPOJO();
        inventoryLocationPOJO.APIKEY = Constant.API_KEY;
        inventoryLocationPOJO.mvInventoryLocation = mvInventoryLocation;
        inventoryLocationPOJO.mvRecordAction = "Insert";


        ObjectMapper ob = new ObjectMapper();

        return ob.writeValueAsString(inventoryLocationPOJO);
    }
}
