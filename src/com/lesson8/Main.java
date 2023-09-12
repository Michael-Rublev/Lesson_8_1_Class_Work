package com.lesson8;

public class Main {

    // классы это способ построения компонентов, внутри себя содержат даенные, и каким то образом умеют с этим
    // работать , для построения более сложных систем
    public static void main(String[] args) {
        Hotel tourist = new Hotel();
        tourist.nameHotel = "Турист";
        tourist.singleRooms = 10;
        tourist.doubleRooms = 30;

    //    System.out.println(tourist.nameHotel + ": " + tourist.getCapacity());

        Hotel hilton = new Hotel();
        hilton.nameHotel = "Hilton";
        hilton.singleRooms = 100;
        hilton.doubleRooms = 100;

    //    System.out.println(hilton.nameHotel + ": " + hilton.getCapacity());

        Hotel[] allHotels = new Hotel[] {tourist, hilton};
        Accomodation acc = new Accomodation();
        acc.hotels = allHotels;

        System.out.println(acc.totalCapacity());
    }
}