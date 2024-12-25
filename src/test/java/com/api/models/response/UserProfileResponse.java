package com.api.models.response;

public class UserProfileResponse {

    int id;
    String username;
    String email;
    String firstName;
    String lastName;
    String mobileNumber;

    public UserProfileResponse() {
    }

    public UserProfileResponse(int id, String username, String email, String firstName, String lastName, String mobileNumber) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
    }

    public int getId() {
        return id;
    }

    public UserProfileResponse setId(int id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserProfileResponse setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserProfileResponse setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserProfileResponse setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserProfileResponse setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public UserProfileResponse setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    @Override
    public String toString() {
        return "UserProfileResponse{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
