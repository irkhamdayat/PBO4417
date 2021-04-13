public class UjiKendaraan {
    static void KendaraanMelaju(Vehicle vehicle){
        vehicle.goStraight();
    }

    public static void main(String[] args) {
        Bycycle spd = new Bycycle();
        MotorVehicle mesinmotor = new MotorVehicle();
        Motor mtr = new Motor();
        Mobil mbl = new Mobil();

        spd.ringBell();
        KendaraanMelaju(spd);

        mesinmotor.Cek();
        KendaraanMelaju(mesinmotor);

        mtr.AturGearFoot(2);
        mtr.Cek();
        KendaraanMelaju(mtr);

        mbl.AturSeatBelt(1);
        System.out.println("Sabuk Sekarang : "+mbl.DapatSeatBelt());

    }

}