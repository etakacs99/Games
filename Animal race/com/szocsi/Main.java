package com.szocsi;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Throwable {

        try (BufferedReader input = new BufferedReader(new FileReader("com/resources/players.txt"))) {
            String line;
            ArrayList<Animal> participants = new ArrayList<>();
            ArrayList<Animal> winners = new ArrayList<>();

            System.out.println("The players:");

            while ((line = input.readLine()) != null) {
                String[] data = line.split(" ");
                String animalName = data[0];
                int year = Integer.parseInt(data[1]);

                Animal currentAnimal = new Animal(animalName, year);

                participants.add(currentAnimal);

                System.out.println(currentAnimal.getAnimalName() + " " + currentAnimal.getYear());
            }

            System.out.println("The winner(s):");

            winners.add(participants.get(0));
            for (int i = 1; i < participants.size(); i++) {
                if (winners.get(0).getFinalPoints() < participants.get(i).getFinalPoints()) {
                    winners.clear();
                    winners.add(participants.get(i));
                } else if (winners.get(0).getFinalPoints() == participants.get(i).getFinalPoints()) {
                    winners.add(participants.get(i));
                }
            }

            participants.sort((x, y) -> {
                return y.getFinalPoints() - x.getFinalPoints();
            });
            for (Animal winner : winners) {
                System.out.println(winner.toString());
            }

            System.out.println("Participants points:");
            for (Animal participant : participants) {
                System.out.println(participant.toString());
            }
        }
    }
}