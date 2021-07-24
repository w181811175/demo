package com.example.butterfly;

import org.junit.jupiter.api.Test;

class ButterflyTest {

    @Test
    void fly() {
        Caterpillar caterpillar = new Caterpillar();
        caterpillar.fly();
        caterpillar.walk();
        Butterfly butterfly = new Butterfly();
        butterfly.fly();
        butterfly.sound();
        butterfly.transform();
    }
}