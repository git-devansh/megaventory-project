package com.megaventory.APIs.salesOrder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.megaventory.Resource.Constant;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class SalesOrder {

    public String createSalesOrder() throws JsonProcessingException {
        SalesOrderDetail salesOrderDetail = new SalesOrderDetail();
        salesOrderDetail.SalesOrderRowProductSKU = "1112256";
        salesOrderDetail.SalesOrderRowQuantity = "10";
        salesOrderDetail.SalesOrderRowShippedQuantity = "0";
        salesOrderDetail.SalesOrderRowInvoicedQuantity = "0";
        salesOrderDetail.SalesOrderRowUnitPriceWithoutTaxOrDiscount = "0.93";

        List<SalesOrderDetail> salesOrderDetailList = new ArrayList<>();
        salesOrderDetailList.add(salesOrderDetail);

        MvSalesOrder mvSalesOrder = new MvSalesOrder();
//        mvSalesOrder.SalesOrderId = 0;
//        mvSalesOrder.SalesOrderNo = "0";
        mvSalesOrder.SalesOrderClientId = 9;
        mvSalesOrder.SalesOrderTypeId = 3;
//        mvSalesOrder.SalesOrderInventoryLocationID = 0;
        mvSalesOrder.SalesOrderDetails = salesOrderDetailList;
//        mvSalesOrder.SalesOrderShipDocumentTypeID = 3;
        mvSalesOrder.SalesOrderStatus = "Pending";

        SalesOrderPOJO salesOrderPOJO = new SalesOrderPOJO();
        salesOrderPOJO.APIKEY = Constant.API_KEY;
        salesOrderPOJO.mvSalesOrder = mvSalesOrder;
        salesOrderPOJO.mvRecordAction = "Insert";

        ObjectMapper ob = new ObjectMapper();

        return ob.writeValueAsString(salesOrderPOJO);
    }


    public String setSaleOrder() throws IOException, InterruptedException {

        SalesOrderDetail salesOrderDetail = new SalesOrderDetail();
        salesOrderDetail.SalesOrderRowProductSKU = "product";
        salesOrderDetail.SalesOrderRowQuantity = "10";
        salesOrderDetail.SalesOrderRowShippedQuantity = "0";
        salesOrderDetail.SalesOrderRowInvoicedQuantity = "0";
        salesOrderDetail.SalesOrderRowUnitPriceWithoutTaxOrDiscount = "0.93";

        List<SalesOrderDetail> salesOrderDetailList = new ArrayList<>();
        salesOrderDetailList.add(salesOrderDetail);

        MvSalesOrder mvSalesOrder = new MvSalesOrder();
//        mvSalesOrder.SalesOrderId = 0;
//        mvSalesOrder.SalesOrderNo = "0";
        mvSalesOrder.SalesOrderClientId = 9;
        mvSalesOrder.SalesOrderTypeId = 3;
//        mvSalesOrder.SalesOrderInventoryLocationID = 0;
        mvSalesOrder.SalesOrderDetails = salesOrderDetailList;
//        mvSalesOrder.SalesOrderShipDocumentTypeID = 3;
        mvSalesOrder.SalesOrderStatus = "Pending";

        SalesOrderPOJO salesOrderPOJO = new SalesOrderPOJO();
        salesOrderPOJO.APIKEY = Constant.API_KEY;
        salesOrderPOJO.mvSalesOrder = mvSalesOrder;
        salesOrderPOJO.mvRecordAction = "Insert";

        ObjectMapper ob = new ObjectMapper();

        return ob.writeValueAsString(salesOrderPOJO);
    }

//    public void updateSaleOrder() throws IOException, InterruptedException {
//        SalesOrderDetail salesOrderDetail = new SalesOrderDetail();
////        salesOrderDetail.SalesOrderRowDetailID = 76069;
////        salesOrderDetail.SalesOrderRowProductID = 59373;
//        salesOrderDetail.SalesOrderRowProductSKU = "product";
//        salesOrderDetail.SalesOrderRowQuantity = "10";
//        salesOrderDetail.SalesOrderRowShippedQuantity = "0";
//        salesOrderDetail.SalesOrderRowInvoicedQuantity = "0";
//        salesOrderDetail.SalesOrderRowUnitPriceWithoutTaxOrDiscount = "0.93";
//
//        List<SalesOrderDetail> salesOrderDetailList = new ArrayList<>();
//        salesOrderDetailList.add(salesOrderDetail);
//
//        MvSalesOrder mvSalesOrder = new MvSalesOrder();
////        mvSalesOrder.SalesOrderId = 0;
////        mvSalesOrder.SalesOrderNo = "0";
//        mvSalesOrder.SalesOrderClientId = 9;
//        mvSalesOrder.SalesOrderTypeId = 3;
////        mvSalesOrder.SalesOrderInventoryLocationID = 0;
//        mvSalesOrder.SalesOrderDetails = salesOrderDetailList;
////        mvSalesOrder.SalesOrderShipDocumentTypeID = 3;
//        mvSalesOrder.SalesOrderStatus = "Pending";
//
//        SalesOrderPOJO salesOrderPOJO = new SalesOrderPOJO();
//        salesOrderPOJO.APIKEY = Constant.API_KEY;
//        salesOrderPOJO.mvSalesOrder = mvSalesOrder;
//        salesOrderPOJO.mvRecordAction = "Insert";
//
//        ObjectMapper ob = new ObjectMapper();
//        String requestBody = ob.writeValueAsString(salesOrderPOJO);
//
//        System.out.println(requestBody);
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(Constant.BASE_URL + "SalesOrderUpdate"))
//                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
//                .build();
//
//        HttpResponse<String> response = client.send(request,
//                HttpResponse.BodyHandlers.ofString());
//
//        System.out.println("Status code: " + response.statusCode());
//        System.out.println("Response: " + response.body());
//    }
}
