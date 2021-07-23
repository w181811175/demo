package com.example.butterfly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ButterflyTest {

    @Test
    void fly() {
        Butterfly butterfly = new Butterfly();
        butterfly.fly();
    }
}