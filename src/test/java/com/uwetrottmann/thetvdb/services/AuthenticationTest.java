package com.uwetrottmann.thetvdb.services;

import com.uwetrottmann.thetvdb.BaseTestCase;
import com.uwetrottmann.thetvdb.entities.LoginData;
import com.uwetrottmann.thetvdb.entities.Token;
import org.junit.Ignore;
import org.junit.Test;

public class AuthenticationTest extends BaseTestCase {


    private static final String API_KEY = "";

    @Ignore
    @Test
    public void test_login() {
        if (API_KEY.length() == 0) {
            throw new IllegalArgumentException("Set your TheTVDB API key to test login.");
        }

        Token token = getTheTvdb().authentication().login(new LoginData(API_KEY));
        System.out.println("Retrieved token: " + token.token + " (valid for 1 hour)");
    }

    @Ignore
    @Test
    public void test_refreshToken() {
        Token token = getTheTvdb().authentication().refreshToken();
        System.out.println("Refreshed token: " + token.token + " (valid for 1 hour)");
    }

}
