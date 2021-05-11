import java.util.Scanner;
public class test {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Mobil mobil1 = new Sedan("V5","Toyota Vios","CVT",10000000);
    Mobil mobil2 = new Minibus("Diesel","Mitsubishi Xpander","GLS",40000000);
    Mobil mobil3 = new Bus("VT","Hino Bus","RN",80000000);

    Karyawan karyawan1 = new Karyawan("Seto","Sales",4);


    System.out.println("======= Pembeli Individu Dan Type Dua Mobil =======");
    Pembeli pembeli1 = new Individu("Ramadhan",12344);
    pembeli1.addMobil(mobil1);
    pembeli1.addMobil(mobil2);
    karyawan1.getPembeli(pembeli1);



    System.out.println("======= Gaji Karyawan ======="); 


    karyawan1.setGaji(pembeli1.invoice());
    System.out.println("Gaji Karyawan : Rp." + karyawan1.getGaji());


    System.out.println("======= Pembeli Borongan =======");
    Pembeli pembeli2 = new Borongan("Irkham",1234567);
    pembeli2.addMobil(mobil3,4);
    karyawan1.getPembeli(pembeli2);

    System.out.println("======= Gaji Karyawan =======");



    karyawan1.setGaji(pembeli2.invoice());
    System.out.println("Gaji Karyawan : Rp." + karyawan1.getGaji());




  }
}
