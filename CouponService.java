package com.example.v2;

/**
 * 本版本新增的独立优惠券处理程序
 */
public class CouponService {

    /**
     * 根据订单金额计算优惠券抵扣金额
     * 策略：满 100 减 20，否则打 9 折
     */
    public double calculateDiscount(double amount) {
        System.out.println("[优惠券系统] 正在计算金额 $" + amount + " 的最优优惠策略...");
        if (amount >= 100.0) {
            System.out.println("[优惠券系统] 匹配到满减规则：满 100 减 20");
            return 20.0;
        } else {
            System.out.println("[优惠券系统] 匹配到普惠规则：享受 9 折优惠");
            return amount * 0.1;
        }
    }
}