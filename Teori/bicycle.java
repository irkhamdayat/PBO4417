import java.io.*;
public class bicycle{

int roda;
int rantai;
int rem;
int gear;
boolean on;
boolean b;

bicycle() {
}
    void setroda(int rodabaru){
        roda = rodabaru;
    }
    void setrantai(int pasangrantai){
        rantai = pasangrantai;
    }
    void setrem(int pasangrem){
        rem = pasangrem;
    }
    void nambahgear(){
        ++gear;
    }
    void turunkangear(){
        --gear;
    }

    public static void main(String[] args) {
        bicycle sepeda = new bicycle();
        System.out.println("======= ATRIBUT / StATE ========");
        sepeda.setroda(2);
        System.out.println(" roda Sepeda: " + sepeda.roda);
        sepeda.setrantai(1);
        System.out.println(" Rantai Sepeda: " + sepeda.rantai);
        sepeda.setrem(2);
        System.out.println(" Rem Sepeda: " + sepeda.rem);

        bicycle sepeda2 = new bicycle();
        System.out.println("+++++++ Behavior( Naikkan Gear) ++++++");
        sepeda2.nambahgear();
        sepeda2.nambahgear();
        System.out.println(" Gear sepeda: " + sepeda2.gear);
        System.out.println(" +++++++ Turunkan Gear ++++++++");
        sepeda2.turunkangear();
        System.out.println("Gear Sepeda: " + sepeda2.gear);




    
    }
}
