package com.lesson8;

public abstract class Housing {

    public int id;


    public abstract int getCapacity();

    public abstract String getPritnable();

    public boolean isSuitableForPeople() {
        return true;
    }
}
