package com.example.fish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DolphinTest {

    @Test
    void swim() {
        Dolphin dolphin = new Dolphin();
        dolphin.swim();
    }
}