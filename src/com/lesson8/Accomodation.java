package com.lesson8;

public class Accomodation {

    Housing[] housings;

    public int totalCapacity() {
        int sum = 0;
        for (int i = 0; i < housings.length; i++) {
            Housing h = housings[i];
            sum += h.getCapacity();
        }
        return sum;
    }

    public void printAll() {
        System.out.println("All housing: ");
        for (int i = 0; i < housings.length; i++) {
            Housing h = housings[i];
            System.out.println(h.getPritnable());
        }
    }

    public Housing findForGroup(int groupSize) {
        for (int i = 0; i < housings.length; i++) {
            Housing h = housings[i];
            if (h.getCapacity() >= groupSize) {
                return h;
            }
        }
        return null;
    }
}
