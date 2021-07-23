package com.example.animal;

import com.example.demo.Rooster;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTest {

    @Test
    void parrotSing() {
        Parrot parrotOne = new Parrot();
        Dog dog = new Dog();
        parrotOne.liveWith(dog);
        parrotOne.parrotSing();

        Parrot parrotTwo = new Parrot();
        Cat cat = new Cat();
        parrotTwo.liveWith(cat);
        parrotTwo.parrotSing();

        Rooster rooster = new Rooster();
        Parrot parrotThree = new Parrot();
        parrotThree.liveWith(rooster);
        parrotThree.parrotSing();

        Duck duck = new Duck();
        Parrot parrotFour = new Parrot();
        parrotFour.liveWith(duck);
        parrotFour.parrotSing();

        TelephoneBooth telephoneBooth = new TelephoneBooth();
        Parrot parrotFive = new Parrot();
        parrotFive.liveWith(telephoneBooth);
        parrotFive.parrotSing();
    }
}