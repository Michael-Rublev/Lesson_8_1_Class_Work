package com.lesson8;

public class Hotel {
    String nameHotel;
    int singleRooms;
    int doubleRooms;

    public int getCapacity() { //метод подсчёта номерного фонда
        return singleRooms + doubleRooms * 2;
    }

}
