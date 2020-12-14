package com.company;

import com.company.entities.Airline;
import com.company.entities.Passenger;

public class Main {

    public static void main(String[] args) {
        Airline a = new Airline();
        Passenger p1 = new Passenger("Pesho", 5);
        Passenger p4 = new Passenger("Tosho", 5);
        Passenger p2 = new Passenger("Sasho", 5);
        Passenger p3 = new Passenger("Gosho", 5);
        Passenger p5 = new Passenger("Ivan", 5);
        Passenger p6 = new Passenger("Dimitar", 5);
        a.assignPassenger(p1);
        a.assignPassenger(p2);
        a.assignPassenger(p3);
        a.assignPassenger(p4);
        a.assignPassenger(p5);
        a.assignPassenger(p6);
        a.printSeats();
    }
}
