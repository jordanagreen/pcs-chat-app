package com.example.pcschatapp;

/**
 * Created by Jordan on 11/25/2017.
 */

public interface IChatServer {

    void sendMessage(ChatMessage message);
    ChatMessage getMessage();

}
