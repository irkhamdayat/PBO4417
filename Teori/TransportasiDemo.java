import transportasi.Bycycle;
import transportasi.Mobil;

public class TransportasiDemo{
    public static void main(String[] args){
        Bycycle sepeda = new Bycycle();
        System.out.println("++++++++ sepeda +++++++");
        sepeda.goStraight();
        sepeda.turnLeft();
        Mobil mobilku = new Mobil();
        System.out.println("+++++++ MOBIl++++++");
        mobilku.Menu();
    
    }
}