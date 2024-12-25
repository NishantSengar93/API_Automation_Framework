package com.api.base;

import io.restassured.response.Response;

public class UserMangementService extends BaseService{

    private static final String BASE_PATH = "/api/users/";

    public Response getProfile(String token)
    {
        setToken(token);
        return getRequest(BASE_PATH+"profile");
    }
}
