package com;

public class SalesExecutiveWorkflow {private String username;
    private String clientType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "SalesExecutiveWorkflow{" +
                "username='" + username + '\'' +
                ", clientType='" + clientType + '\'' +
                ", selectedService='" + selectedService + '\'' +
                '}';
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getSelectedService() {
        return selectedService;
    }

    public void setSelectedService(String selectedService) {
        this.selectedService = selectedService;
    }

    public SalesExecutiveWorkflow(String selectedService, String clientType, String username) {
        this.selectedService = selectedService;
        this.clientType = clientType;
        this.username = username;
    }

    private String selectedService;
}
