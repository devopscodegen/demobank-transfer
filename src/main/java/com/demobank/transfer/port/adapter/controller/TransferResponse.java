package com.demobank.transfer.port.adapter.controller;

public class TransferResponse {
    private String status;

    public TransferResponse() {}

    public TransferResponse(String status) {
        setStatus(status);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}