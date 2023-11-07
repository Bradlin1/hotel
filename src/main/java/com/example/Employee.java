package main.java.com.example;

public class Employee extends Person{
    private int id;
    private String position;

    public Employee(int age,String gender,double height,String name,double weight,int id,String position){
        super(age,gender,height,name,weight);
        this.position=position;
        this.id=id;

    }
    
    public int getId(){
        return this.id ;
    }
    public String getPosition(){
        return this.position;
    }
    public void setId(int newId){
        this.id=newId;
    }
    public void setPosition(String newPosition){
        this.position=newPosition;
    }
}