package com.example.v1;

public class Order {
    private String orderId;
    private String productId;
    private int quantity;
    private double totalPrice;

    public Order(String orderId, String productId, int quantity, double totalPrice) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    // Getters and Setters
    public String getOrderId() { return orderId; }
    public String getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public double getTotalPrice() { return totalPrice; }
}