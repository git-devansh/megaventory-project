package com.megaventory.APIs.discount;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.megaventory.Resource.Constant;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Discount {

    public String setDiscount() throws IOException, InterruptedException {

        MvDiscount mvDiscount = new MvDiscount();
        mvDiscount.DiscountName = "Loyalty";
        mvDiscount.DiscountDescription = "Loyalty Customer Discount";
        mvDiscount.DiscountValue = 50;

        DiscountPOJO discountPOJO = new DiscountPOJO();
        discountPOJO.APIKEY = Constant.API_KEY;
        discountPOJO.mvDiscount = mvDiscount;
        discountPOJO.mvRecordAction = "Insert";

        ObjectMapper ob = new ObjectMapper();

        return ob.writeValueAsString(discountPOJO);
    }
}

