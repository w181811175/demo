package com.example.fish;

/**
 * @author wangling
 */
public class Shark extends Fish{

    public Shark(String size,String colour) {
        this.setSize(size);
        this.setColour(colour);
        System.out.println("Shark are " + this);
    }

    void eatFish(){
        System.out.println("Sharks eat other fish");
    }
}
