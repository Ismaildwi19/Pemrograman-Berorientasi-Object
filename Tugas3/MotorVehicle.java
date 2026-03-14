package Tugas3;

public class MotorVehicle extends Vehicle {
    public int sizeofEngine;
    public String licencePlate;

    public MotorVehicle() {
        this.sizeofEngine = 1;
        this.licencePlate = "H 1 IDN";
    }

    public MotorVehicle(int sizeEng, String lcPlate){
        this.sizeofEngine = sizeEng;
        this.licencePlate = lcPlate;
    }

    public int getSizeofEngine(){
        return this.sizeofEngine;
    }

    public String getLicencePlate(){
        return this.licencePlate;
    }


}