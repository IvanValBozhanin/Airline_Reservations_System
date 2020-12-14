package com.company.entities;

public class Passenger {
    private String name;
    private int extraLuggage;
    private Seat seat;
    private String boardingPass;


    public Passenger(String name, int extraLuggage) {
        this.name = name;
        this.extraLuggage = extraLuggage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExtraLuggage() {
        return extraLuggage;
    }

    public void setExtraLuggage(int extraLuggage) {
        this.extraLuggage = extraLuggage;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public String getBoardingPass() {
        return boardingPass;
    }

    public void setBoardingPass() {
        boardingPass = String.format("Name: %s\n", name) +
                String.format("Extra Luggage: %d\n", extraLuggage) +
                String.format("Seat Id: %d, %s\n", seat.getId(), seat.get_class()) +
                String.format("Total Price: %.2f", Airline.getRegularPrice() + 5 * extraLuggage);
    }
}
