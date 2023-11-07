package main.java.com.example;

public class Guest extends Person{
    private int guestID;
    private boolean breakfast;

    public Guest(int age,String gender,double height,String name,double weight,int guestID,boolean breakfast){
        super(age,gender,height,name,weight);
        this.guestID=guestID;
        this.breakfast=breakfast;
    }
    public int getGuestID(){
        return this.guestID;
    }
    public boolean getBreakfast(){
        return this.breakfast;
    }
    public void setGuestID(int GuestID){
        this.guestID=GuestID;
    }
    public void setBreakfast(boolean newBreakfast){
        this.breakfast=newBreakfast;
    }
       
    
}
