package com.classes;

import com.exceptions.ReceiveException;
import com.exceptions.SenderException;

public class Player extends BasePlayer<Player> {

    String role;

    public Player(String role) {
        super();
        this.role = role;
    }

    @Override
    public void SendMessage(Player player) throws SenderException {
        System.out.println("Send Message to player as role"+role);

        try {
            if  (!"".equals( player.SendReceiveMessage(this))){
                receiveMessageCount++;
            }
        }catch (ReceiveException e) {
            System.out.println("ReceiveException --"+e.getMessage());
        }

    }

    @Override
    public String SendReceiveMessage(Player player) throws ReceiveException {
        String receiveMessage="";
        try{
            player.SendReceiveMessage(this);
            System.out.println("Send Receive Message to Player as role"+role);
            senderMessageCount++;
            receiveMessage = "Success";
            return  receiveMessage;
        }catch (ReceiveException e) {
            System.out.println("ReceiveException --"+e.getMessage());
            return  receiveMessage;
        }



    }
}
