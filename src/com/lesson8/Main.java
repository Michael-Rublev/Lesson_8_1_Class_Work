package com.lesson8;

public class Main {

    // классы это способ построения компонентов, внутри себя содержат даенные, и каким то образом умеют с этим
    // работать , для построения более сложных систем
    public static void main(String[] args) {
        Hotel tourist = new Hotel();
        tourist.id = 1;
        tourist.name = "Турист";
        tourist.singleRooms = 10;
        tourist.doubleRooms = 30;

        Hotel hilton = new Hotel();
        hilton.id = 2;
        hilton.name = "Хилтон";
        hilton.singleRooms = 100;
        hilton.doubleRooms = 100;

        House jacks = new House();
        jacks.id = 15;
        jacks.ownersName = "Jacks";
        jacks.bedrooms = 10;

        Prison singSing = new Prison();
        singSing.id = 33;
        singSing.cells = 100;


//        Hotel[] allHotels = new Hotel[] {tourist, hilton};

        Accomodation accomodation = new Accomodation();
        accomodation.housings = new Housing[]{tourist, hilton, jacks, singSing};

        accomodation.printAll();

        System.out.println(accomodation.findForGroup(100).getPritnable());
        System.out.println(accomodation.findForGroup(30).getPritnable());

        Housing hotel = accomodation.findForGroup(2001);
        if (hotel != null) {
            System.out.println(hotel.getPritnable());
        } else {
            System.out.println("Nothing found");
        }
    }
}