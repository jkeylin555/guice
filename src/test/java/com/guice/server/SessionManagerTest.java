package com.guice.server;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.assertNotEquals;

public class SessionManagerTest {
    @Inject SessionManager sessionManager;
    @Before public void setUp() {
        Guice.createInjector(new ServerModule()).injectMembers(this);
    }
    @Test
    public void testSessionManager() throws InterruptedException {
        Long sessionId =  sessionManager.getSessionId();
        Thread.sleep(1000);
        Long sessionId2 =  sessionManager.getSessionId();
        assertNotEquals(sessionId, sessionId2);

    }
}
