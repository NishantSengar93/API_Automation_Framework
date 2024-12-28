package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserMangementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.UserProfileUpdateRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.api.listeners.TestListener.class)
public class UpdateUserProfileTest {
    @Test(description = "Verify Signup functionality...")
    void updateProfile()
    {
        Faker faker = new Faker();
        LoginRequest loginRequest = new LoginRequest("garth.lubowitz123","garth.lubowitz");
        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(loginResponse.getToken());
        Assert.assertEquals(response.statusCode(),200);

        System.out.println("-----------------------------------------------------------------------------");

        UserMangementService userMangementService = new UserMangementService();
        response =userMangementService.getProfile(loginResponse.getToken());
        UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
        Assert.assertEquals(response.statusCode(),200);
        System.out.println(userProfileResponse.getId());

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(loginResponse.getToken());
        UserProfileUpdateRequest userProfileUpdateRequest =  new UserProfileUpdateRequest.Builder()
                .setEmail(faker.internet().emailAddress())
                .setFirstName(faker.name().firstName())
                .setLastName(faker.name().lastName())
                .setMobileNumber(faker.number().digits(10))
                .build();
        response=userMangementService.updateProfile(loginResponse.getToken(), userProfileUpdateRequest);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.statusCode(),200);
    }
}
