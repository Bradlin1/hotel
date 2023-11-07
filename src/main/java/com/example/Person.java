package main.java.com.example;

public class Person {
    private int age;
    private String gender;
    private double height;
    private String name;
    private double weight;

    public Person(int age,String gender,double height,String name,double weight){
        this.age=age;
        this.gender=gender;
        this.height=height;
        this.name=name;
        this.weight=weight;
    }
    //get
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }
    public double getHeight(){
        return this.height;
    }
    public String getName(){
        return this.name;
    }
    public double getWeight(){
        return this.weight;
    }

    //set
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setGender(String newGender){
        this.gender = newGender;
    }
    public void setHeight(double newHeight){
        this.height=newHeight;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public void setWeight(double newWeight){
        this.weight= newWeight;
    }
}