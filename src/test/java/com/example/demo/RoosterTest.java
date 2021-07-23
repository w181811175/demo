package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoosterTest {

    @Test
    void roosterSing() {
        Rooster rooster = new Rooster();
        rooster.roosterSing();
    }
}