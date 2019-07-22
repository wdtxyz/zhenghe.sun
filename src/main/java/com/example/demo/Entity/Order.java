package com.example.demo.Entity;

import java.util.Date;

public class Order {
    private int orderId;
    private int clientId;
    private Date orderDate;
    private int quantity;
    private String commont;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCommont() {
        return commont;
    }

    public void setCommont(String commont) {
        this.commont = commont;
    }
    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", clientId=" + clientId + ",orderDate="+orderDate+", quantity="+quantity+",commont=" + commont +"]";
    }

}
