package com.lesson8;

public class Prison extends Housing {

    int cells;
    public int getCapacity() {
        return cells;
    }
    public String getPritnable() {
        return "I'm Prison! + :" + getCapacity() + " inmates";
    }

    @Override
    public boolean isSuitableForPeople() {
        return false;
    }
}
