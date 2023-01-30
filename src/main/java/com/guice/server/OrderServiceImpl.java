package com.guice.server;

import javax.inject.Inject;

public class OrderServiceImpl implements OrderService{
    private final PriceService priceService;
    private PaymentService paymentService;
    private final SessionManager sessionManager;
    private Long ordersPaid = 0L;
    @Inject
    public OrderServiceImpl(PriceService priceService, PaymentService paymentService, SessionManager sessionManager) {
        super();
        this.priceService = priceService;
        this.paymentService = paymentService;
        this.sessionManager = sessionManager;
    }
    public void sendToPayment(long orderId) {
        long price = priceService.getPrice(orderId);
        paymentService.pay(sessionManager.getSessionId(), orderId, price);
        ordersPaid = ordersPaid + 1;
        throw new RuntimeException(
            "Price: " + price + ", Orders paid: " + ordersPaid + ", SessionId: " + sessionManager.getSessionId()
        );
    }
}
