package com.example.animal;

/**
 * @author wangling
 */
public class Chicken extends Bird {

    void chickenSing() {
        System.out.println("Cluck, cluck");
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
