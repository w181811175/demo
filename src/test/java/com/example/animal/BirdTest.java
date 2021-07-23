package com.example.animal;

import org.junit.jupiter.api.Test;

public class BirdTest {

    @Test
    void testBird() {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }



}
