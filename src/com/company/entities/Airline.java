package com.company.entities;

import java.util.Scanner;

public class Airline {
    private final static double regularPrice = 100.0;
    private final static int capacity = 10;
    Passenger[] passengers;
    Seat[] seats;

    public Airline() {
        passengers = new Passenger[capacity];
        seats = new Seat[capacity];
        for(int i = 0 ; i < capacity; ++i){
            seats[i] = new Seat(i+1, (i<5?Class.BUSINESS:Class.ECONOMY));
        }
    }

    public void printSeats(){
        for(int i = 0 ;i < capacity ; ++i){
            System.out.printf("%d ", seats[i].getId());
            if(i == 4) System.out.printf("%c ", '|');
        }
        System.out.println();
        for(int i=0; i<capacity; ++i){
            System.out.printf("%c ", (seats[i].isTaken() ? 'X' : 'O'));
            if(i == 4) System.out.printf("%c ", '|');
        }
        System.out.println();
        System.out.printf(" %s    %s\n", Class.BUSINESS, Class.ECONOMY);
    }

    public void assignPassenger(Passenger passenger){
        Scanner in = new Scanner(System.in);
        printSeats();
        System.out.println("Please type 1 for Business Class and 2 for Economy");
        Class cl = (in.nextInt() == 1 ? Class.BUSINESS : Class.ECONOMY);
        int id = (cl == Class.BUSINESS ? 0 : 5);
        int cap = ((cl == Class.BUSINESS ? 5 : 10));
        while(id < cap){
            if(seats[id].isTaken()) ++id;
            else {
                seats[id].setTaken(true);
                passenger.setSeat(seats[id]);
                break;
            }
        }
        if(id == cap){
            System.out.printf("Seems like in %s there are no free seats. Would you like to switch to %s? (1 for yes, 2 for no)", cl, (cl == Class.ECONOMY ? Class.BUSINESS : Class.ECONOMY));
            if (in.nextInt() == 2){
                System.out.println("Next flight leaves in 3 hours.");
                return;
            }
            id = (id == 5 ? 5 : 0);
            cap = (cap == 5 ? 10: 5);
            while(id < cap){
                if(seats[id].isTaken()) ++id;
                else {
                    seats[id].setTaken(true);
                    passenger.setSeat(seats[id]);
                    break;
                }
            }
            if(id == cap){
                System.out.println("Sorry - the plane is full. Next flight leaves in 3 hours.");
                return;
            }
        }
        passenger.setBoardingPass();
        System.out.println(passenger.getBoardingPass());
    }

    public static double getRegularPrice() {
        return regularPrice;
    }
}
