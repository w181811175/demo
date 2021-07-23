package com.example.fish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FishTest {

    @Test
    void swim() {
        Fish fish = new Fish();
        fish.swim();
    }
}