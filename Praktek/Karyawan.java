public class Karyawan {
  private String nama;
  private String jabatan;
  private int lamaKerja;
  private int gaji;

  public Karyawan(){
    nama = "NA";
    jabatan = "NA";
    lamaKerja = 0;
    gaji = 0;
  }
  public Karyawan(String nama, String jabatan, int lamaKerja){
    this.nama = nama;
    this.jabatan = jabatan;
    this.lamaKerja = lamaKerja;
  }
  public String getNama(){
    return nama;
  }
  public void setNama(String nama){
    this.nama = nama;
  }
  public int getGaji(){
    return gaji;
  }
  public void setGaji(int gaji){
    this.gaji += gaji/10;
  }
  public String getJabatan(){
    return jabatan;
  }
  public void setJabatan(String jabatan){
    this.jabatan = jabatan;
  }
  public int getLamaKerja(){
    return lamaKerja;
  }
  public void setLamaKerja(int lamaKerja){
    this.lamaKerja = lamaKerja;
  }
  public void getDataMobil(Mobil mobil){
    
  }
  public void setHargaMobil(Mobil mobil, int harga){
    mobil.setHarga(harga);
  }
  public void getPembeli(Pembeli pembeli){
    System.out.println("Data Pembeli");
    System.out.println("Nama Pembeli : " + pembeli.getNama());
    System.out.println("KTP Pembeli : " + pembeli.getKTP());
    System.out.println("Mobil yang dibeli : ");
    pembeli.getMobil();
  }
}
