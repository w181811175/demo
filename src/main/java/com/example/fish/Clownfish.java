package com.example.fish;

/**
 * @author wangling
 */
public class Clownfish extends Fish{

    public Clownfish(String size,String colour) {
        this.setSize(size);
        this.setColour(colour);
        System.out.println("Clownfish are " + this);
    }

    void makeJokes(){
        System.out.println("Clownfish make jokes");
    }

}
