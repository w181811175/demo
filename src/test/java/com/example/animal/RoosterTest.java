package com.example.animal;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RoosterTest {

    @Test
    void roosterSing() {
        Rooster rooster = new Rooster();
        rooster.roosterSing();
    }

    @Test
    void roosterSay() {
        Rooster rooster = new Rooster();
        Arrays.stream(RoosterLanguage.values()).forEach(roosterLanguage -> {
            rooster.roosterSay(roosterLanguage.language);
        });
    }
}