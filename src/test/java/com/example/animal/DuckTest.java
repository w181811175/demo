package com.example.animal;

import org.junit.jupiter.api.Test;

public class DuckTest {

    @Test
    void testDuck() {
        Duck duck = new Duck();
        duck.walk();
        duck.fly();
        duck.swim();
        duck.duckSing();
    }

}
