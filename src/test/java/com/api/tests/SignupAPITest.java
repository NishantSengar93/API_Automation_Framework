package com.api.tests;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.request.SignupRequest;
import com.api.models.response.LoginResponse;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.api.listeners.TestListener.class)
public class SignupAPITest {

    @Test(description = "Verify Signup functionality...")
    void signupTest()
    {
        Faker faker = new Faker();
        String email =faker.internet().emailAddress();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String mobileNumber = faker.number().digits(10);
        String userName = faker.name().username();
        String password = userName+"123";
        SignupRequest signupRequest = new SignupRequest.Builder()
                .setEmail(email)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setMobileNumber(mobileNumber)
                .setPassword(password)
                .setUsername(userName)
                .build();

//        System.out.println(signupRequest.getFirstName());

            AuthService authService = new AuthService();
            Response response = authService.signup(signupRequest);
            System.out.println(response.asPrettyString());
            Assert.assertEquals(response.statusCode(),200);

            LoginRequest loginRequest = new LoginRequest(password,userName);
             authService = new AuthService();
             response = authService.login(loginRequest);
            LoginResponse loginResponse = response.as(LoginResponse.class);
            System.out.println(loginResponse.getToken());
            Assert.assertEquals(response.statusCode(),200);
    }
}
