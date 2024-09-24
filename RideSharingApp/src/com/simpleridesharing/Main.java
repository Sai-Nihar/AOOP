package com.simpleridesharing;

public class Main {
    public static void main(String[] args) {
        // Authenticate user using Singleton
        UserAuthentication userAuth = UserAuthentication.getInstance();
        userAuth.authenticateUser("Sai	");

        // Create vehicles using a simple factory method
        Vehicle car = Vehicle.createVehicle("Car");
        car.ride();

        Vehicle bike = Vehicle.createVehicle("Bike");
        bike.ride();

        // Create payment methods using a simple factory method
        PaymentMethod creditCard = PaymentMethod.createPaymentMethod("Credit Card");
        creditCard.pay(20.0);

        PaymentMethod payPal = PaymentMethod.createPaymentMethod("PayPal");
        payPal.pay(15.0);
    }
}
	