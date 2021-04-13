public class Motor extends MotorVehicle{
    int numGear = 0;

    Motor(){

    }
    public void AturGearFoot(int nmGear){
        this.numGear = nmGear;
    }
    public int DapatGearFoot(){
        return numGear;
    }
    public void Cek() {
        System.out.println(numGear);

    }
}