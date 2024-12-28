package com.api.tests;



import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import  io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.api.listeners.TestListener.class)
public class LoginAPITest {
    @Test(description = "Verify Login functionality...")
    void loginTest()
    {
        LoginRequest loginRequest = new LoginRequest("Nishant123","Nishant");
        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(loginResponse.getToken());
        Assert.assertEquals(response.statusCode(),200);
    }
}
