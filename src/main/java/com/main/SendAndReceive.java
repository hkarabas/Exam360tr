package com.main;

import com.classes.Player;
import com.exceptions.SenderException;

public class SendAndReceive {
    public static void main(String[] args)  {
        Player firstPlayer = new Player("initiator");
        Player secondPlayer = new Player("second player");

        while(firstPlayer.getReceiveMessageCount()<=10 && secondPlayer.getSenderMessageCount()<=10 ) {
            try {
                firstPlayer.SendMessage(secondPlayer);
            } catch (SenderException e) {
                e.printStackTrace();
            }
        }
    }
}
