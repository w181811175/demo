package com.example.count;

import com.example.animal.*;
import com.example.butterfly.Butterfly;
import com.example.animal.Chicken;
import com.example.animal.Rooster;
import com.example.fish.Clownfish;
import com.example.fish.Dolphin;
import com.example.fish.Fish;
import com.example.fish.Shark;

import java.util.Arrays;

/**
 * @author wangling
 */
public class CountAnimals {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark("large","grey"),
                new Clownfish("small","colourful (orange)"),
                new Dolphin(),
                new Frog (),
                new Dog(),
                new Butterfly(),
                new Cat()
        };

        System.out.println(animals.length);
        System.out.println(Arrays.stream(animals).filter(animal -> animal.canFly()).count());
        System.out.println(Arrays.stream(animals).filter(animal -> animal.canWalk()).count());
        System.out.println(Arrays.stream(animals).filter(animal -> animal.canSing()).count());
        System.out.println(Arrays.stream(animals).filter(animal -> animal.canSwim()).count());

    }

}
