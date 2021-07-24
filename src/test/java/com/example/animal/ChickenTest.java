package com.example.animal;

import com.example.animal.Chicken;
import org.junit.jupiter.api.Test;

public class ChickenTest {

    @Test
    void testChicken() {
        Chicken chicken = new Chicken();
        chicken.chickenSing();
    }

}
