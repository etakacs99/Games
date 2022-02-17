package com;

public class TestMyArray {

    public static void main(String[] args) {
        MyArray test = new MyArray(5);

        if (test.isEmpty() && test.getSize() == 0) {
            System.out.println("Passed: The array is empty.");
            ;
        } else {
            System.err.println("Failed: The array must be empty.");
        }

        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);

        if (test.getSize() == 5 && !test.isEmpty()) {
            for (int i = 0; i < test.getSize(); i++) {
                if (test.get(i) == i + 1) {
                    System.out.println("Passed: The array elements are in their given places.");
                }
            }
        } else {
            System.err.println("Failed: The elements are in the wrong place.");
        }

        test.remove();
        if(test.getSize() == 4 ){
            System.out.println("Passed: The last element was removed.");
        } else {
            System.err.println("Failed: The remove() method failed.");
        }

        test.add(5);

        try {
            test.add(6);
        } catch (IllegalStateException ie) {
            System.out.println("Passed: " + ie.getMessage());
        }
        try {
            test.get(-1);
        } 
        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Passed: " + ae.getMessage());
        }
        try {
            test.get(10);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Passed: " + ae.getMessage());
        }

        int size = test.getSize();
        for (int i = 0; i < size; i++) {
            test.remove();
        }
        
        try{
            test.remove();  
        } catch (IllegalStateException ie) {
            System.out.println("Passed: " + ie.getMessage());
        }
    }
}