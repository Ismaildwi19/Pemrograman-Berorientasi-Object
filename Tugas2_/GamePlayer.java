package Tugas2;

public class GamePlayer
{
    //encapsulation
    private double width, height;
    private int positionX, positionY;

    //constructor kosong
    public GamePlayer(){

    }

    //constructor dengan parameter width dan height
    public GamePlayer(double width, double height){
        this.width = width;
        this.height = height;
    }

    //constructor dengan parameter width, height, positionX, dan positionY
    public GamePlayer(double width, double height, int positionX, int positionY){
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    //method setter untuk width dan height
    public void setDimension(double width, double height){
        this.width = width;
        this.height = height;
    }

    //method setter untuk positionX dan positionY
    public void setPosition(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }

    //method getter untuk width
    public double getWidth(){
        return this.width;
    }

    //method getter untuk height
    public double getHeight(){
        return this.height;
    }

    //method getter untuk positionX
    public int getX(){
        return this.positionX;
    }

    //method getter untuk positionY
    public int getY(){
        return this.positionY;
    }

    //method run player
    public void Run(){
        System.out.println("Player is running");
    }

    //method untuk run player dengan parameter incrementX
    public void Run(int incrementX){
        this.positionX += incrementX;
        System.out.println("Player still running...current X position= " + this.positionX);
    }


}