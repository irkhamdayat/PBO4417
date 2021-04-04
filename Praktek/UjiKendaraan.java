public class UjiKendaraan{
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Bycycle sepeda = new Bycycle();
        MotorVehicle motor = new MotorVehicle(3, "K 15 VC");

        sepeda.goStraight();
        sepeda.ringBell();
        motor.mtr();
        kendaraan.turnLeft();
        motor.getSizeofEngine();
    }
}