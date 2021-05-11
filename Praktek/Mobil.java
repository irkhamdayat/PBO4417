/**
 * Mobil
 */
public class Mobil {

  private String mesin,type,merk,model;
  private int harga,jmlKursi;


  public Mobil(){
    mesin = "NA";
    merk = "NA";
    model = "NA";
    type = "NA";
    harga = 0;
    jmlKursi = 4;
  }
  public Mobil(String mesin, String merk, String model, int harga){
    this.mesin = mesin;
    this.merk = merk;
    this.merk = model;
    this.harga = harga;
  }
  public int getHarga(){
    return harga;
  }
  public void setHarga(int harga){
    this.harga = harga;
  }
  public String getMerk(){
    return merk;
  }
  public void setMerk(String merk){
    this.merk = merk;
  }
  public String getType(){
    return type;
  }
  public void setType(String type){
    this.type = type;
  }
  public String getMesin(){
    return mesin;
  }
  public void setMesin(String mesin){
    this.mesin = mesin;
  }
  public String getModel(){
    return model;
  }
  public void setModel(String model){
    this.model = model;
  }
  public int getJmlKursi(){
    return jmlKursi;
  }
  public void setJmlKursi(int jmlKursi){
    this.jmlKursi = jmlKursi;
  }
}