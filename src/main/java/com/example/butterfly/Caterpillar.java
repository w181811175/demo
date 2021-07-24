package com.example.butterfly;

import com.example.animal.Animal;

/**
 * @author wangling
 */
public class Caterpillar extends Animal implements Insect{

    @Override
    public boolean fly() {
        System.out.println("A caterpillar cannot fly");
        return false;
    }

    @Override
    public boolean walk(){
        System.out.println("A caterpillar can walk (crawl)");
        return true;
    }

    @Override
    public boolean sound() {
        return false;
    }

}
