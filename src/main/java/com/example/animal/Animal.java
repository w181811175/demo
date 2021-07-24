package com.example.animal;

/**
 * @author wangling
 */
public class Animal {

    boolean walk(){
        System.out.println("I am walking");
        return true;
    }

    void sing(){
        System.out.println("I am singing");
    }

    public boolean canFly(){
        return false;
    }

    public boolean canWalk(){
        return true;
    }

    public boolean canSing(){
        return true;
    }

    public boolean canSwim(){
        return false;
    }

}
