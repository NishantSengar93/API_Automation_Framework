
package com.api.models.request;


public class UserProfileUpdateRequest {


    private String email;

    private String firstName;

    private String lastName;

    private String mobileNumber;

    public UserProfileUpdateRequest(String email, String firstName, String lastName, String mobileNumber) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public static class Builder
    {
        private String email;

        private String firstName;

        private String lastName;

        private String mobileNumber;

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public UserProfileUpdateRequest build()
        {
            return new UserProfileUpdateRequest(email,firstName,lastName,mobileNumber);
        }
    }



}
