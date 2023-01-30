package com.guice.server;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class ServerModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(OrderService.class).to(OrderServiceImpl.class);
        bind(PriceService.class).to(PriceServiceImpl.class);
        bind(PaymentService.class).to(PaymentServiceImpl.class);
//        bind(SessionManager.class).toInstance(new SessionManager());
    }
    @Provides @SessionId Long gerarSessionId() {
        return System.currentTimeMillis();
    }
}
