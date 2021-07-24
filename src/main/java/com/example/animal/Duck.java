package com.example.animal;

/**
 * @author wangling
 */
public class Duck extends Bird implements IAnimal{

    void duckSing(){
        System.out.println("Quack , quack");
    }

    void swim(){
        System.out.println("I am swiming");
    }

    @Override
    public void say() {
        System.out.println("Quack , quack");
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}
