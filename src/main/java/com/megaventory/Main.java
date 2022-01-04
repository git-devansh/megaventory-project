package com.megaventory;


import com.megaventory.APIs.discount.Discount;
import com.megaventory.APIs.inventoryLocation.InventoryLocation;
import com.megaventory.APIs.product.Product;
import com.megaventory.APIs.salesOrder.SalesOrder;
import com.megaventory.APIs.supplierClient.SupplierClient;
import com.megaventory.APIs.tax.Tax;
import com.megaventory.Resource.Constant;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    static HttpClient client;

    public static void main(String[] args) throws IOException, InterruptedException {
        // java Library (HttpClient) can be used to send requests and retrieve their responses.
        client = HttpClient.newHttpClient();

        /*
         *   Product - ProductUpdate
         */
        Product product = new Product();
        sendHttpRequest(product.setProduct(), "ProductUpdate");

        /*
         *  SupplierClient - SupplierClientUpdate
         */
        SupplierClient supplierClient = new SupplierClient();
        sendHttpRequest(supplierClient.setSupplierClient(), "SupplierClientUpdate");

        /*
         *  InventoryLocation - InventoryLocationUpdate
         */
        InventoryLocation inventoryLocation = new InventoryLocation();
        sendHttpRequest(inventoryLocation.setInventoryLocation(), "InventoryLocationUpdate");

        /*
         *  Tax - TaxUpdate
         */
        Tax tax = new Tax();
        sendHttpRequest(tax.setTax(), "TaxUpdate");

        /*
         *  Discount - DiscountUpdate
         */
        Discount discount = new Discount();
        sendHttpRequest(discount.setDiscount(), "DiscountUpdate");

        /*
         * SalesOrder - SalesOrderUpdate
         */
        SalesOrder salesOrder= new SalesOrder();
        sendHttpRequest(salesOrder.setSaleOrder(), "SalesOrderUpdate");

        /*
         * SalesOrder - SalesOrderUpdate
         */
        sendHttpRequest(salesOrder.createSalesOrder(), "SalesOrderUpdate");
    }


    public static void sendHttpRequest(String requestBody, String urlType) throws IOException, InterruptedException {
        System.out.println("Request Body: " + requestBody);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(Constant.BASE_URL + urlType))
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response: " + response.body());
    }

}
