package com.SiddhantBhatia.JAVA_II.POLYMORPHISM.PracticeQuestions;

import java.util.Scanner;

// Parent Class
class Ride {
    int baseFare;
    double distance;

    public Ride(int baseFare, double distance) {
        this.baseFare = baseFare;
        this.distance = distance;
    }

    public double calculateFare() {
        return 0.0;
    }
}

// Child Classes
class Mini extends Ride {
    public Mini(int baseFare, double distance) {
        super(baseFare, distance);
    }

    @Override
    public double calculateFare() {
        return baseFare + distance * 10;
    }
}

class Sedan extends Ride {
    public Sedan(int baseFare, double distance) {
        super(baseFare, distance);
    }

    @Override
    public double calculateFare() {
        return baseFare + distance * 12;
    }
}

class SUV extends Ride {
    public SUV(int baseFare, double distance) {
        super(baseFare, distance);
    }

    @Override
    public double calculateFare() {
        return baseFare + distance * 15;
    }
}

// Main Class
public class RideFareCalcSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rideType = sc.next();
        int baseFare = sc.nextInt();
        double distance = sc.nextDouble();

        Ride ride;

        if (rideType.equals("Mini"))
            ride = new Mini(baseFare, distance);
        else if (rideType.equals("Sedan"))
            ride = new Sedan(baseFare, distance);
        else
            ride = new SUV(baseFare, distance);

        System.out.println("Final Fare: " + ride.calculateFare());
    }
}