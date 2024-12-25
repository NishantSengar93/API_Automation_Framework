
package com.api.models.request;




public class SignupRequest {


    private String email;

    private String firstName;

    private String lastName;

    private String mobileNumber;

    private String password;

    private String username;



//    public SignupRequest(Builder builder) {
//        this.email = builder.email;
//        this.firstName = builder.firstName;
//        this.lastName = builder.lastName;
//        this.mobileNumber = builder.mobileNumber;
//        this.password = builder.password;
//        this.username = builder.username;
//    }


    public SignupRequest(String email, String firstName, String lastName, String mobileNumber, String password, String username) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.username = username;
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



    public String getPassword() {
        return password;
    }



    public String getUsername() {
        return username;
    }



    @Override
    public String toString() {
        return "SignupRequest{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public static class Builder
    {
        private String email;

        private String firstName;

        private String lastName;

        private String mobileNumber;

        private String password;

        private String username;

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

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public SignupRequest build()
        {
            return new SignupRequest(email,firstName,lastName,mobileNumber,password,username);

        }
    }
}
