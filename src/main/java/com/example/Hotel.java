package main.java.com.example;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> roomList;
    private String name;
    private ArrayList<Employee> employeeList;

    public Hotel(String name) {
        this.name = name;
        this.roomList = new ArrayList<Room>();
        this.employeeList=new ArrayList<Employee>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Room> getList() {
        return this.roomList;
    }
     public ArrayList<Employee> getEmList() {
        return this.employeeList;
    }
    public void setEmlist(ArrayList<Employee> employees){
        this.employeeList = employees;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setRoom(ArrayList<Room> room) {
        this.roomList = room;
    }
    public void hireEmployee(Employee employee){
        this.employeeList.add(employee);
    }
    public void fireEmployee(Employee employee){
        this.employeeList.remove(employee);
    }

    public ArrayList<Room> findAvailableRooms() {
        ArrayList<Room> availableRoomList = new ArrayList<Room>();
        for (Room room : roomList) {
            if (room.getOccupied() == false) {
                availableRoomList.add(room);
            }
        }
        return availableRoomList;
    }

    public boolean book(int people, double budget) {
        // ArrayList<Room> affordable = new ArrayList<Room>();
        ArrayList<Room> available = this.findAvailableRooms();
        // for (Room room : selected) {
        //     if (room.getPrice() <= budget) {
        //         affordable.add(room);
        //     }
        // }

        for (int i = 0; i < available.size(); i++) {
            for (int j = 0; j < available.size() - 1 - i; j++) {
                if (available.get(j).getPrice() > available.get(j + 1).getPrice()) {
                    Room temp = available.get(j);
                    available.set(j, available.get(j + 1));
                    available.set(j + 1, temp);
                }
            }
        }
        // get the number of rooms required for people

        ArrayList<Room> roomForBooking = new ArrayList<Room>();
        for (Room room : available){
            if (budget-room.getPrice()>0 && people>0) {
                budget -= room.getPrice();
                people -= room.getOccupancy();
                roomForBooking.add(room);
            }
            else if (budget-room.getPrice()<0 && people>0) {
                return false;
            }
            else {
                break;
            }
        }
        //
        
        for (Room room: roomForBooking) {
            room.setOccupied(true);
            System.out.println(room.getOccupancy());
            System.out.println(room.getPrice());
            System.out.println(room.getOccupied());
        }
        
        return true;

    }

    public char[] getOccupied() {
        return null;
    }

    public char[] getPrice() {
        return null;
    }

    public char[] getOccupancy() {
        return null;
    }

}