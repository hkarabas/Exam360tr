package com.exceptions;

public class ReceiveException extends  Exception {
    String receiveMeassage;

    public ReceiveException(String receiveMeassage) {

        this.receiveMeassage = receiveMeassage;
    }

    @Override
    public String toString() {
        return ("Receive Exception Occurred"+this.receiveMeassage);
    }
}
