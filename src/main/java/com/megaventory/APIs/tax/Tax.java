package com.megaventory.APIs.tax;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.megaventory.Resource.Constant;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Tax {

    public String setTax() throws IOException, InterruptedException {
        MvTax mvTax = new MvTax();
        mvTax.TaxName = "VAT";
        mvTax.TaxDescription = "VAT GR";
        mvTax.TaxValue = 24;

        TaxPOJO taxPOJO = new TaxPOJO();
        taxPOJO.APIKEY = Constant.API_KEY;
        taxPOJO.mvTax = mvTax;
        taxPOJO.mvRecordAction = "Insert";

        ObjectMapper ob = new ObjectMapper();
        return ob.writeValueAsString(taxPOJO);
    }
}
