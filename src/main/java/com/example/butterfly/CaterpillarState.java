package com.example.butterfly;

/**
 * @author wangling
 */
public class CaterpillarState implements Insect{
    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean sound() {
        return true;
    }

    @Override
    public boolean walk() {
        return true;
    }
}
