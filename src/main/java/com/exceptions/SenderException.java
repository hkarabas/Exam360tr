package com.exceptions;

public class SenderException extends Exception {
    String senderMessage;
    public  SenderException(String senderMessage){
        this.senderMessage = senderMessage;
    }

    @Override
    public String toString() {
        return ("Sender Exception Occurred"+senderMessage);
    }
}