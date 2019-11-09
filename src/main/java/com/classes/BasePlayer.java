package com.classes;

import com.exceptions.ReceiveException;
import com.exceptions.SenderException;

public abstract class  BasePlayer<T extends  BasePlayer> {
    int senderMessageCount;
    int receiveMessageCount;
    public abstract void SendMessage(T player ) throws SenderException, ReceiveException;
    public abstract String SendReceiveMessage(T player) throws ReceiveException;

    public BasePlayer() {
        this.senderMessageCount = 0;
        this.receiveMessageCount = 0;
    }

    public int getSenderMessageCount() {
        return senderMessageCount;
    }

    public void setSenderMessageCount(int senderMessageCount) {
        this.senderMessageCount = senderMessageCount;
    }

    public int getReceiveMessageCount() {
        return receiveMessageCount;
    }

    public void setReceiveMessageCount(int receiveMessageCount) {
        this.receiveMessageCount = receiveMessageCount;
    }
}
