package com.example.fish;

import com.example.animal.Animal;

/**
 * @author wangling
 */
public class Fish extends Animal implements IFish{

    private String size;

    private String colour;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return size + " and " + colour;
    }

    @Override
    public void swim() {
        System.out.println("I am swiming");
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return false;
    }

    @Override
    public boolean canSing() {
        return false;
    }
}
