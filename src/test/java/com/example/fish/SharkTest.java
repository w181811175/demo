package com.example.fish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharkTest {

    @Test
    void eatFish() {
        Shark shark = new Shark("large","grey");
        shark.swim();
        shark.eatFish();
    }
}