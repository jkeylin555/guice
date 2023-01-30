package com.guice.server;

import javax.inject.Inject;
import javax.inject.Provider;

public class SessionManager {
    private final Provider<Long> sessionId;
    @Inject
    public SessionManager(@SessionId Provider<Long> sessionId) {
        super();
        this.sessionId = sessionId;
    }

    public Long getSessionId() {
        return sessionId.get();
    }
}
