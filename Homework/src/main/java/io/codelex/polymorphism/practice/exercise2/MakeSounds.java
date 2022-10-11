package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        Parrot parrot = new Parrot();
        Firework firework = new Firework();
        Radio radio = new Radio();
        List<Sound> sounds = new ArrayList<>(Arrays.asList(parrot, firework, radio, parrot, parrot, radio, firework));

        for (Sound makeSomeNoise : sounds) {
            makeSomeNoise.playSound();
        }
    }
}
