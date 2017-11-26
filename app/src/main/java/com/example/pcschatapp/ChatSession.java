package com.example.pcschatapp;

/**
 * Created by Jordan on 11/25/2017.
 */

public class ChatSession implements IChatSession {

    private byte[] mRootKey = new byte[32];
    private byte[] mChainKey = new byte[32];
    private byte[] mMessageKey = new byte[80];

}
