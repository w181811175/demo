package com.example.animal;

/**
 * @author wangling
 */
public class Rooster extends Chicken implements IAnimal {

    private String sing = "Cock-a-doodle-doo";

    /**
     * rooster is a subclass extends Chicken
     * if without using inheritance,We can modify the chicken class to interface.
     */
    public void roosterSing(){
        System.out.println(sing);
    }

    @Override
    public void say() {
        System.out.println(sing);
    }

    public void roosterSay(String language){
        if(language != null && !language.equals("")){
            System.out.println(RoosterLanguage.getSound(language));
        }else{
            System.out.println(sing);
        }
    }
}
