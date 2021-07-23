package com.example.animal;

/**
 * @author wangling
 */
public class TelephoneBooth implements IAnimal{

    private String say = "Ring ring";

    @Override
    public void say() {
        System.out.println(say);
    }

}
