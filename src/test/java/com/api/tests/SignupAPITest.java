package com.api.tests;

import com.api.base.AuthService;
import com.api.models.request.SignupRequest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupAPITest {

        @Test(description = "Verify Signup functionality...")
        void signupTest()
        {
            SignupRequest signupRequest = new SignupRequest("yash@gmail.com","yash","Niwas","9033890812","Yash123","Yash");
            AuthService authService = new AuthService();
            Response response = authService.signup(signupRequest);
            System.out.println(response.asPrettyString());
            Assert.assertEquals(response.statusCode(),200);
        }
    }
