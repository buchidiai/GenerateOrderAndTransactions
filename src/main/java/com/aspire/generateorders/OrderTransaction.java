/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspire.generateorders;

import java.sql.Timestamp;

/**
 *
 * @author louie
 */
public class OrderTransaction {

    private int id;

    private int quantity;

    private java.sql.Timestamp datetime;

    private String transactiontype;

    private String stock_order_id;

    public OrderTransaction(int quantity, Timestamp datetime, String transactiontype, String stock_order_id) {

        this.quantity = quantity;
        this.datetime = datetime;
        this.transactiontype = transactiontype;
        this.stock_order_id = stock_order_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    public String getStock_order_id() {
        return stock_order_id;
    }

    public void setStock_order_id(String stock_order_id) {
        this.stock_order_id = stock_order_id;
    }

    @Override
    public String toString() {

        return "INSERT INTO order_transaction " + "(quantity, datetime, transactiontype, stock_order_id) " + "VALUES " + "('" + quantity + "','" + datetime + "','" + transactiontype + "','" + stock_order_id + "');";
    }

}
