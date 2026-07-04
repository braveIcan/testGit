package com.example.v2;

public class OrderService {
    // 优化：引入新增的优惠券服务（组合模式）
    private final CouponService couponService = new CouponService();

    public void createOrder(Order order) {
        System.out.println("--- [V2 优化版] 正在处理订单: " + order.getOrderId() + " ---");
        
        // 1. 业务逻辑解耦：调用新增的程序计算优惠
        double discount = couponService.calculateDiscount(order.getOriginalPrice());
        order.setFinalPrice(order.getOriginalPrice() - discount);
        
        // 2. 模拟库存扣减（实际开发中会注入单独的 InventoryService）
        checkInventory(order.getProductId(), order.getQuantity());
        
        // 3. 订单保存
        System.out.println("[数据库] 订单已保存。原价: $" + order.getOriginalPrice() + " -> 优惠后实付: $" + order.getFinalPrice());
    }

    private void checkInventory(String productId, int quantity) {
        System.out.println("[库存系统] 独立库存模块成功扣减商品 [" + productId + "] 数量: " + quantity);
    }
}