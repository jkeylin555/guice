package com.guice.server;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.guice.server.OrderService;
import com.guice.server.ServerModule;
import org.junit.Before;
import org.junit.Test;

public class OrderServiceTest {
    @Inject private OrderService orderService;
    @Before public void setUp() {
        Guice.createInjector(new ServerModule()).injectMembers(this);
    }
    @Test
    public void testSendToPayment() {
        orderService.sendToPayment(1);
    }
}
