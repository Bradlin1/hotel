package main.java.com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hotel pitbull = new Hotel("Brad's Hotel");
        Room econmyRoom = new Room(2, 420, false);
        Room deluxeRoom = new Room(2, 6900, false);
        Room thebestRoom = new Room(2, 12345, false);
        Room theMidRoom = new Room(1000, 12333333, false);

        Guest Lake= new Guest(45,"male", 179,"Lake",69,1234,false);
        Guest Michael = new Guest(35,"female",179,"Gekko", 69,1234,false); 

        Employee rudydy = new Employee(69, "female", 120, "Rudydy", 69,1234,"normal worker");
        System.out.println(rudydy.getName());
        System.out.println(rudydy.getGender());
        Employee Gaygon = new Employee(69, "homo", 120, "Gaygon", 69,1234,"normal worker");
        System.out.println(Gaygon.getName());
        System.out.println(Gaygon.getGender());

        ArrayList<Room> theBestList = new ArrayList<Room>();
        for (Employee employee:pitbull.getEmList()){
            System.out.println(employee.getGender());
            System.out.println(employee.getName());
        }

        theBestList.add(econmyRoom);
        theBestList.add(deluxeRoom);
        theBestList.add(thebestRoom);
        theBestList.add(theMidRoom);
        pitbull.setRoom(theBestList);

        System.out.println(pitbull.getName());
        

        pitbull.book(69, 42000);
        for (Room room  : pitbull.getList()) {
            System.out.println(room.getPrice());
            System.out.println(room.getOccupied());
            System.out.println(room.getOccupancy());
        }
    }
}
