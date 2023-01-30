package com.guice.server;

import javax.inject.Provider;

public class PaymentServiceImpl implements PaymentService{
    @Override
    public void pay(Long sessionId, long orderId, long price) {
        System.out.println("PaymentServiceImpl.pay");
    }
}
