package com.example.butterfly;

import com.example.animal.Animal;

/**
 * @author wangling
 */
public class Butterfly extends Animal implements Insect{

    private Insect state = new CaterpillarState();

    @Override
    public boolean fly(){
        System.out.println("A butterfly can fly");
        return true;
    }

    @Override
    public boolean walk(){
        return true;
    }

    @Override
    public boolean sound() {
        System.out.println("A butterfly does not make a sound");
        return false;
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean canSing() {
        return false;
    }

    /**
     * the metamorphosis from caterpillar to butterfly
     */
    void transform(){
        System.out.println("the metamorphosis from caterpillar to butterfly");
        System.out.println(state.fly());
        System.out.println(state.walk());
        System.out.println(state.sound());
        state = new ButterflyState();
        System.out.println(state.fly());
        System.out.println(state.walk());
        System.out.println(state.sound());
    }


}
