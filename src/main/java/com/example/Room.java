package main.java.com.example;
import java.util.ArrayList;

public class Room{
    private int occupancy;
    private double price;
    private boolean occupied;
    private ArrayList<Guest> guestList;

    public Room(int occupancy,double price,boolean occupied){
        this.occupancy=occupancy;
        this.price=price;
        this.occupied=occupied;
        this.guestList=new ArrayList<Guest>();
    }
    public ArrayList<Guest> getGusetList() {
        return this.guestList;
    }
    public int getOccupancy(){
        return this.occupancy;
    }
    public double getPrice(){
        return this.price;
    }
    public boolean getOccupied(){
        return this.occupied;
    }
    public void setOccupancy(int newOccupancy){
        this.occupancy=newOccupancy;
    }
    public void setPrice(double newPrice){
        this.price=newPrice;
    }
    public void setOccupied(boolean newOccupied){
        this.occupied=newOccupied;
    }
    public void addBreakfast(Guest guest){
        this.guestList.add(guest);
    }
    public void removeBreakfast(Guest guest){
        this.guestList.remove(guest);
    }

}
