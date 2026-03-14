package Tugas3;

public class Vehicle{
    public double speed;
    public String color;

    public Vehicle(){
        this.speed = 0;
        this.color = "Orange";
    }

    public void goStraight(){
        System.out.println("Maju..");
    }

    public void turnLeft(){
        System.out.println("Belok kiri..");
    }

    public void turnRight(){
        System.out.println("Belok kanan..");
    }
}