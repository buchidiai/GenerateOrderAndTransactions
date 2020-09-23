/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspire.generateorders;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author louie
 */
public class App {

    public static void main(String[] args) {

        String[] names = new String[]{"APPLE", "Amazon", "Netflix", "Tesla", "Walmart", "NVIDIA Corporation", "JPMorgan Chase & Co.", "Google", "Alibaba Group Holding Limited"};
        String[] Symbols = new String[]{"AAPL", "AMAZN", "NFLX", "TSLA", "WMT", "NVDA", "JPM", "GOOG", "BABA"};

        List<Stock> allStocks = new ArrayList<>();

        int stockId = 0;
        for (String n : names) {
            //create stock
            Stock stock = new Stock(stockId + 1, n, Symbols[stockId]);
            //increment id
            stockId++;
            //add stocks
            allStocks.add(stock);

            System.out.println(stock.toString());

        }

        int buyStockOrderId = 0;

        String BUY = "BUY";
        String STATUS = "IN-PROGRESS";

        List<StockOrder> allStockOrders = new ArrayList<>();

        while (buyStockOrderId < 50) {
            Random r = new Random();
            int low = 1;
            int high = 100;
            int randomQuantity = r.nextInt(high - low) + low;

            Date date = new Date();
            Timestamp ts = new Timestamp(date.getTime());

            int low1 = 1;
            int high2 = 9;
            int randomIndex = r.nextInt(high2 - low1) + low1;

            BigDecimal randomPrice = new BigDecimal(BigInteger.valueOf(new Random().nextInt(1000001)), 2);

            StockOrder buyStockOrder = new StockOrder(buyStockOrderId + 1, STATUS, BUY, randomQuantity, ts, randomPrice, String.valueOf(allStocks.get(randomIndex).getId()));

            System.out.println(buyStockOrder.toString());
            buyStockOrderId++;

            allStockOrders.add(buyStockOrder);

        }

        int sellStockOrderId = buyStockOrderId;

        String SELL = "SELL";

        while (sellStockOrderId < (buyStockOrderId * 2)) {
            Random r = new Random();
            int low = 1;
            int high = 100;
            int randomQuantity = r.nextInt(high - low) + low;

            Date date = new Date();
            Timestamp ts = new Timestamp(date.getTime());

            int low1 = 1;
            int high2 = 9;
            int randomIndex = r.nextInt(high2 - low1) + low1;

            BigDecimal randomPrice = new BigDecimal(BigInteger.valueOf(new Random().nextInt(1000001)), 2);

            StockOrder sellStockOrder = new StockOrder(sellStockOrderId + 1, STATUS, SELL, randomQuantity, ts, randomPrice, String.valueOf(allStocks.get(randomIndex).getId()));

            System.out.println(sellStockOrder.toString());
            sellStockOrderId++;

            allStockOrders.add(sellStockOrder);

        }

        String TRANSTYPE = "CREATED";

        for (StockOrder o : allStockOrders) {

            //int quantity, Timestamp datetime, String transactiontype, String stock_order_id
            OrderTransaction ot = new OrderTransaction(o.getQuantity(), o.getDatetime(), TRANSTYPE, String.valueOf(o.getId()));

            System.out.println(ot.toString());
        }

    }

}
