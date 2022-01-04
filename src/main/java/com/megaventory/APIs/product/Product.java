package com.megaventory.APIs.product;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.megaventory.Resource.Constant;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Product {

//    public String getAllProduct() {
//        System.out.println("Getting all product...");
//        HttpRequest request = HttpRequest.newBuilder()
//                .GET()
//                .uri(URI.create(Constant.BASE_URL + "ProductGet?APIKEY=" + Constant.API_KEY))
//                .build();
//        return httpClient.sendAsync(request,  HttpResponse.BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .join();
//    }

    public HttpRequest getAllProduct() {
        System.out.println("Getting all product...");
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(Constant.BASE_URL + "ProductGet?APIKEY=" + Constant.API_KEY))
                .build();
        return request;
    }

    public String setProduct() throws IOException, InterruptedException {
//        MvProduct mvProduct = new MvProduct();
//        mvProduct.ProductID = 23;
//        mvProduct.ProductType = "Service";
//        mvProduct.ProductSKU = "PRODUCT_900_SERVICE";
//        mvProduct.ProductDescription = "(updated)";
//
//        ProductPOJO up = new ProductPOJO();
//        up.APIKEY = Constant.API_KEY;
//        up.mvProduct = mvProduct;
//        up.mvRecordAction = "Update";
//        up.mvInsertUpdateDeleteSourceApplication = "WooCommerce";

        MvProduct mvProduct = new MvProduct();
        mvProduct.ProductID = 0;
        mvProduct.ProductSKU = "1112256";
        mvProduct.ProductDescription = "Nike shoes";
        mvProduct.ProductSellingPrice = 99.9;
        mvProduct.ProductPurchasePrice = 44.99;

        ProductPOJO up = new ProductPOJO();
        up.APIKEY = Constant.API_KEY;
        up.mvProduct = mvProduct;
        up.mvRecordAction = "Insert";

        ObjectMapper ob = new ObjectMapper();

        return ob.writeValueAsString(up);
    }

}
