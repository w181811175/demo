package com.example.butterfly;

/**
 * @author wangling
 */
public class ButterflyState implements Insect{

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public boolean sound() {
        return false;
    }

    @Override
    public boolean walk() {
        return true;
    }
}
