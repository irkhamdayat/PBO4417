class mobildemo2{
    public static void main(String[] args){
        //membuat objek
        Mobil Mobilku = new Mobil();

        //memanggil atribut dan memberi nilai
        Mobilku.keadaanMobil(true);
        Mobilku.cepat=60;
                Mobilku.Gigi=4;

        //memanggil method
        Mobilku.Kecepatan(100);
        Mobilku.gantiGigi(4);
        Mobilku.keadaanMobil(false);

    }
}