package com;

public class servicepromotion { private String username;
    private String password;
    private String clientType;

    @Override
    public String toString() {
        return "servicepromotion{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", clientType='" + clientType + '\'' +
                ", notes='" + notes + '\'' +
                ", loginStatus=" + loginStatus +
                '}';
    }

    public servicepromotion(String username) {
        this.username = username;
    }

    private String notes;

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    private boolean loginStatus;
}

