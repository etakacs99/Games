package utils;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Throwable {
        try (BufferedReader input = new BufferedReader(new FileReader("sources/movies.csv"))) {
            String line;
            ArrayList<Movie> movies = new ArrayList<>();

            while ((line = input.readLine()) != null) {
                String[] data = line.split(";");
                String title = data[0];
                String date = data[1];

                data[2] = data[2].startsWith("$") ? data[2].substring(1) : data[2];
                double income = Double.parseDouble(data[2].replace(",",""));

                data[3] = data[3].startsWith("$") ? data[3].substring(1) : data[3];
                double cost = Double.parseDouble(data[3].replace(" million",""));
                cost *= 1_000_000;

                Movie currentMovie = new Movie(title, date, income, cost);
                movies.add(currentMovie);
            }

           Movie max = movies.get(0);
           Movie min = movies.get(0);
           for(int i = 1; i < movies.size(); i++){
               System.out.println(movies.get(i).getTitle() + " " + movies.get(i).getProductionIndex());
               if(movies.get(i).getProductionIndex() >= max.getProductionIndex()){
                    max = movies.get(i);
               }
               if(movies.get(i).getProductionIndex()  <= min.getProductionIndex()){
                   min = movies.get(i);
               }
           } 
           System.out.println(min.getTitle() + " brought the lowest income. " + max.getTitle() + " brought the highest income.");
        }
    }   
}