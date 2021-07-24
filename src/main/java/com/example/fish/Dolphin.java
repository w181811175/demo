package com.example.fish;

import com.example.animal.Animal;

/**
 * @author wangling
 */
public class Dolphin extends Animal implements IFish{

    @Override
    public void swim() {
        System.out.println("Dolphins are not exactly fish, yet, they are good swimmers");
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}
