
package com.api.models.request;

public class LoginRequest {

    private String mPassword;

    private String mUsername;

    public LoginRequest(String mPassword, String mUsername) {
        this.mPassword = mPassword;
        this.mUsername = mUsername;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String username) {
        mUsername = username;
    }

    @Override
    public String toString() {
        return "LoginPayload{" +
                "mPassword='" + mPassword + '\'' +
                ", mUsername='" + mUsername + '\'' +
                '}';
    }

}
