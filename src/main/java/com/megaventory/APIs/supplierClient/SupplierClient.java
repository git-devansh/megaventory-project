package com.megaventory.APIs.supplierClient;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.megaventory.APIs.product.ProductPOJO;
import com.megaventory.Resource.Constant;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SupplierClient {

    public String setSupplierClient() throws IOException, InterruptedException {

        MvSupplierClient mvSupplierClient = new MvSupplierClient();
        mvSupplierClient.SupplierClientName = "babis";
        mvSupplierClient.SupplierClientEmail = " babis@exampletest.com ";
        mvSupplierClient.SupplierClientShippingAddress1 = "Example 8, Athens";
        mvSupplierClient.SupplierClientPhone1 = "1235698967";

        SupplierClientPOJO sc = new SupplierClientPOJO();
        sc.APIKEY = Constant.API_KEY;
        sc.mvSupplierClient = mvSupplierClient;
        sc.mvRecordAction = "Insert";

        ObjectMapper ob = new ObjectMapper();

        return ob.writeValueAsString(sc);
    }

}
