class Mobil {
    //deklarasi atribut
	int Gigi = 0;
    int cepat = 0;
    boolean on;
    boolean m;
    
    //deklarasi method
    void keadaanMobil(boolean on) {
       if (m = on){
                System.out.println("Menyalakan Mobil");
    }
        else {
            System.out.println("Mobil Dimatikan");

    }
    }
    void gantiGigi(int newValue) {
       Gigi = Gigi + newValue;
       System.out.println(" \n Gigi:" + Gigi);

    }
    void Kecepatan(int increment) {
        cepat = cepat + increment;
        System.out.println(" \n Kecepatan Mobil: " + cepat);
    }
    
}

