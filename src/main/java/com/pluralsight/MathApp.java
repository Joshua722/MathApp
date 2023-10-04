package com.pluralsight;

import javax.sound.midi.Soundbank;

public class MathApp {
    public static void main (String[] args) {
        int bobSalary = 47_000;
        int garySalary = 81_000;
        int highestSalary = Math.max(bobSalary,garySalary);

            System.out.println("The highest salary is .." + highestSalary );

        int carPrice = 40_000;
        int truckPrice = 500_000;
        int lowestPrice = Math.min(carPrice, truckPrice);
            System.out.println("The lowest price of night is.... " + lowestPrice);

        float areaCircle = (float) (Math.PI * 7.25);
            System.out.println("The area of special circle is... " + areaCircle);

        float squareRoot = (float) (Math.sqrt(5.0));
            System.out.println("The square root is.... " + squareRoot);

        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            System.out.println("The distance between both points are... " + distance) ;


        double x = -3.8;
        double result = Math.abs(x);

            System.out.println("This is the absolute value... " + result);

        double randomNumber = Math.random();
            System.out.println("This is my best friend randomNumber!..." + randomNumber);



    }

}
