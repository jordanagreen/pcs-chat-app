package com.example.pcschatapp;

import org.whispersystems.curve25519.Curve25519;
import org.whispersystems.curve25519.Curve25519KeyPair;

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
        mIdentityKeyPair = Curve25519.getInstance(Curve25519.BEST).generateKeyPair();
        mSignedPreKey = Curve25519.getInstance(Curve25519.BEST).generateKeyPair();
        mOneTimePreKeys = new ArrayDeque<>();
    }

}
