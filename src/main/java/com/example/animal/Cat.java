package com.example.animal;

/**
 * @author wangling
 */
public class Cat extends Animal implements IAnimal{

    private String say = "Me ow";

    @Override
    public void say() {
        System.out.println(say);
    }

}
