package com.example.animal;

/**
 * @author wangling
 */
public class Cat implements IAnimal{

    private String say = "Me ow";

    @Override
    public void say() {
        System.out.println(say);
    }

}
