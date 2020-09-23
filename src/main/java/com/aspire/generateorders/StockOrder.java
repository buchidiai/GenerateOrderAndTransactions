/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspire.generateorders;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *
 * @author louie
 */
public class StockOrder {

    private int id;

    private String status;

    private String side;

    private int quantity;

    private Timestamp datetime;

    private BigDecimal price;

    private String stock_id;

    public StockOrder(int id, String status, String side, int quantity, Timestamp datetime, BigDecimal price, String stock_id) {
        this.id = id;
        this.status = status;
        this.side = side;
        this.quantity = quantity;
        this.datetime = datetime;
        this.price = price;
        this.stock_id = stock_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStock_id() {
        return stock_id;
    }

    public void setStock_id(String stock_id) {
        this.stock_id = stock_id;
    }

    @Override
    public String toString() {

        return "INSERT INTO stock_order " + "(side,status,stock_id,quantity,datetime,price) " + "VALUES " + "('" + side + "','" + status + "','" + stock_id + "','" + quantity + "','" + datetime + "','" + price + "');";
    }

}
