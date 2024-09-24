package com.simpleridesharing;

public class PaymentMethod {
    private String method;

    private PaymentMethod(String method) {
        this.method = method;
    }

    public void pay(double amount) {
        System.out.println("Paying " + amount + " with " + method + ".");
    }

    public static PaymentMethod createPaymentMethod(String method) {
        return new PaymentMethod(method);
    }
}
