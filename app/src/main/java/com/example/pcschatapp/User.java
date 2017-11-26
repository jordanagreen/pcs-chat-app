package com.example.pcschatapp;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Jordan on 11/25/2017.
 */

public class User implements IUser {

    private Curve25519KeyPair mIdentityKeyPair;
    private Curve25519KeyPair mSignedPreKey;
    private Queue<Curve25519KeyPair> mOneTimePreKeys;

    User(){
        mOneTimePreKeys = new ArrayDeque<>();
    }

}
