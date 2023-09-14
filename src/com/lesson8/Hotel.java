package com.lesson8;

public class Hotel extends Housing {
    String name;
    int singleRooms;
    int doubleRooms;

    public int getCapacity() { //метод подсчёта номерного фонда
        return singleRooms + doubleRooms * 2;
    }

    public String getPritnable() {
        return id + "::" +  "Hotel " + name + " я могу вместить: " + getCapacity();
    }
}
