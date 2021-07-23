package com.example.animal;

/**
 * @author wangling
 */
public class Dog implements IAnimal{

    private String say = "Woof, woof";

    @Override
    public void say() {
        System.out.println(say);
    }
}
