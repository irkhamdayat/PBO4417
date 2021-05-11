public class Individu extends Pembeli{
  public Individu(String nama, int KTP){
    super(nama, KTP);
  }
  public void addMobil(Mobil mobil){
    if (listMobil.size() == 0) {
      System.out.println("Berhasil Menambah Mobil");
      listMobil.add(mobil);
    }else{
      if (mobil.getType() != listMobil.get(0).getType()) {
        System.out.println("Maaf hanya bisa membeli 1 type mobil saja ");
      }else{
        System.out.println("Mobil Berhasil Ditambahkan");
        listMobil.add(mobil);
      }
    }
  }
  public void getMobil(){
    if (listMobil.size() == 0) {
      System.out.println("Belum ada mobil ditambahkan");
    }else{
      System.out.println("Mobil yang sudah ditambahkan");
      Mobil mobil1 = new Mobil();
      for (int i = 0; i < listMobil.size(); i++) {
        mobil1 = listMobil.get(i);
        System.out.println("Harga Mobil : " + mobil1.getHarga());
        System.out.println("Merk Mobil : " + mobil1.getMerk());
        System.out.println("Type Mobil : " + mobil1.getType());
      }
    }
  }
  public int invoice(){
    Mobil mobil1 = new Mobil();
    int totalHarga = 0;
    for (int i = 0; i < listMobil.size(); i++) {
      mobil1 = listMobil.get(i);
      totalHarga = totalHarga + mobil1.getHarga();
    }
    return totalHarga;
  }
}
