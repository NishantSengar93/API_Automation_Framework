//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.api.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
    private static final String BASE_URL = "http://64.227.160.186:8080";
    private RequestSpecification requestSpecification = RestAssured.given().baseUri("http://64.227.160.186:8080");

    public BaseService() {
    }

    protected void setToken(String token) {
        this.requestSpecification.header("Authorization", "Bearer " + token, new Object[0]);
    }

    protected Response postRequest(Object payload, String endpoint) {
        return (Response)this.requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint, new Object[0]);
    }

    protected Response putRequest(Object payload, String endpoint) {
        return (Response)this.requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint, new Object[0]);
    }

    protected Response getRequest(String endpoint) {
        return (Response)this.requestSpecification.contentType(ContentType.JSON).get(endpoint, new Object[0]);
    }
}
