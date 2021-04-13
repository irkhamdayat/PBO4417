public class Mobil extends MotorVehicle{
    boolean seatbelt = false;


    Mobil(){

    }
    public void AturSeatBelt(int seatbelt){
        if(seatbelt == 1){
            this.seatbelt = true;
        }
        else{
            this.seatbelt = false;
        }
        
    }
    public boolean DapatSeatBelt(){
        return seatbelt;
    }

}