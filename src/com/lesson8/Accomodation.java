package com.lesson8;

public class Accomodation {

    Hotel[] hotels;

    public int totalCapacity() {
        int sum = 0;
        for (int i = 0; i < hotels.length; i++) {
            Hotel h = hotels[i];
            sum += h.getCapacity();
        }
        return sum;
    }
}
