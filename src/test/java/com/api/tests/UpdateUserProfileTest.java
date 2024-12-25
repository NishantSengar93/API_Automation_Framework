package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserMangementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.UserProfileUpdateRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateUserProfileTest {
    @Test
    void updateProfile()
    {
        LoginRequest loginRequest = new LoginRequest("Nishant123","Nishant");
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
                .setEmail("newemail@gmail.com")
                .setFirstName("Nishant")
                .setLastName("Sengar")
                .setMobileNumber("9033890098")
                .build();
        response=userMangementService.updateProfile(loginResponse.getToken(), userProfileUpdateRequest);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.statusCode(),200);
    }
}
