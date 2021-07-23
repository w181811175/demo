package com.example.fish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClownfishTest {

    @Test
    void makeJokes() {
        Clownfish clownfish = new Clownfish("small","colourful (orange)");
        clownfish.swim();
        clownfish.makeJokes();
    }
}