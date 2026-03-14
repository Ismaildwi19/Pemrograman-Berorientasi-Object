package Tugas3;
public class UjiKendaraan{
    public static void main(String[] args){
        Vehicle vhc = new Vehicle();
        System.out.println("Kecepatan: " + vhc.speed);
        System.out.println("Warna: " + vhc.color);

        Bicycle bcl = new Bicycle();
        bcl.ringBell();

        MotorVehicle mtrVhc = new MotorVehicle(150, "H 1234 ABC");
        System.out.println("Ukuran Mesin: " + mtrVhc.getSizeofEngine() + " cc");
        System.out.println("Plat Nomor: " + mtrVhc.getLicencePlate());
    }
}