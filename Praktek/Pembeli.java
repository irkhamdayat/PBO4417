import java.util.ArrayList;

public abstract class Pembeli{
  private String nama;
  private int KTP;
  protected ArrayList<Mobil> listMobil = new ArrayList<Mobil>();

  public Pembeli(){
    nama = "NA";
    KTP = 0;
  }
  public Pembeli(String nama, int KTP){
    this.nama = nama;
    this.KTP = KTP;
  }
  public String getNama(){
    return nama;
  }
  public void setNama(String nama){
    this.nama = nama;
  }
  public int getKTP(){
    return KTP;
  }
  public void setKTP(int KTP){
    this.KTP = KTP;
  }
  public abstract void addMobil(Mobil mobil);
  public abstract void getMobil();
  public abstract int invoice();
  public void addMobil(Mobil mobil, int jumlah){}
}
