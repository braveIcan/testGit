package com.example.v1;

public class OrderService {
    
    // 创建订单：库存扣减逻辑直接硬编码在服务中，难以维护
    public void createOrder(Order order) {
        System.out.println("--- 正在处理订单: " + order.getOrderId() + " ---");
        
        // 硬编码的库存检查
        System.out.println("[库存系统] 正在检查商品 " + order.getProductId() + " 的库存...");
        System.out.println("[库存系统] 成功扣减库存数量: " + order.getQuantity());
        
        // 订单保存
        System.out.println("[数据库] 订单 " + order.getOrderId() + " 已成功保存入库。");
        System.out.println("订单处理完成！总金额: $" + order.getTotalPrice());
    }
}