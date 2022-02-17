package com.szocsi;

import java.util.*;
import java.time.LocalDate;

public class Animal {
    private static final int maxAge = 20;
    
    private final String animalName;
    private final int beauty;
    private final int behaviour;
    private final int year;
    private int finalPoints;

    public Animal(String name, int year) {
        animalName = name;
        this.year = year;

        Random random = new Random();
        beauty = random.nextInt(11);
        behaviour = random.nextInt(11);
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getBeauty() {
        return beauty;
    }
    
    public int getBehaviour() {
        return behaviour;
    }

    public int getFinalPoints() {
        calculateFinalPoints();
        return finalPoints;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return animalName + " All points: " + finalPoints + " Beauty points: " + beauty + ", Behaviour points: " + behaviour;
    }

    private void calculateFinalPoints() {
        LocalDate date = LocalDate.now();
        int age = date.getYear() - year;
        if (age >= maxAge) {
            finalPoints = 0;
        } else {
            finalPoints = ((maxAge - age ) * getBeauty()) + 2 * getBehaviour();
        }
    }
}

