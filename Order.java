package com.example.v2;

public class Order {
    private String orderId;
    private String productId;
    private int quantity;
    private double originalPrice;
    private double finalPrice; // 优化：区分原价与最终支付价

    public Order(String orderId, String productId, int quantity, double originalPrice) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.originalPrice = originalPrice;
        this.finalPrice = originalPrice; 
    }

    // Getters and Setters
    public String getOrderId() { return orderId; }
    public String getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public double getOriginalPrice() { return originalPrice; }
    public double getFinalPrice() { return finalPrice; }
    public void setFinalPrice(double finalPrice) { this.finalPrice = finalPrice; }
}