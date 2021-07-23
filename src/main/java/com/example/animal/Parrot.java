package com.example.animal;

/**
 * @author wangling
 */
public class Parrot extends Bird{

    private IAnimal iAnimal;

    void liveWith(IAnimal iAnimal){
        this.iAnimal = iAnimal;
    }

    void parrotSing(){
        iAnimal.say();
    }

}
