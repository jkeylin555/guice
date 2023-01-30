package com.guice.server;

public class PriceServiceImpl implements PriceService {
    @Override
    public long getPrice(long orderId) {
        return 100;
    }
}
