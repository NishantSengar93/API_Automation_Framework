package com.api.tests;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.request.SignupRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupAPITest {

    @Test(description = "Verify Signup functionality...")
    void signupTest()
    {
        SignupRequest signupRequest = new SignupRequest.Builder()
                .setEmail("Prakhar@gmail.com")
                .setFirstName("Prakhar")
                .setLastName("Saxena")
                .setMobileNumber("9033890823")
                .setPassword("Prakhar123")
                .setUsername("Prakhar")
                .build();

        System.out.println(signupRequest.getFirstName());

//            AuthService authService = new AuthService();
//            Response response = authService.signup(signupRequest);
//            System.out.println(response.asPrettyString());
//            Assert.assertEquals(response.statusCode(),200);

//            LoginRequest loginRequest = new LoginRequest("Prakhar123","Prakhar");
//            AuthService authService = new AuthService();
//            Response response = authService.login(loginRequest);
//            LoginResponse loginResponse = response.as(LoginResponse.class);
//            System.out.println(loginResponse.getToken());
//            Assert.assertEquals(response.statusCode(),200);
    }
}
