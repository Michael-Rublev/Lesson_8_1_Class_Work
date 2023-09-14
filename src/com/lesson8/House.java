package com.lesson8;

public class House extends Housing {

    public House(int id, String ownersName, int bedrooms) {

    }

    String ownersName;

    int bedrooms;

    public int getCopacity() {
        return bedrooms * 2;
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    public String getPritnable() {
        return id + ":: " + ownersName + "'s house witch capacity of " + getCopacity();
    }
}
