package com.guice.server;

public interface OrderService {
    void sendToPayment(long orderId);
}
