package com.guice.server;

import javax.inject.Provider;

public interface PaymentService {
    void pay(Long sessionId, long orderId, long price);

}
