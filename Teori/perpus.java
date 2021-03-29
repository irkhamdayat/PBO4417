public class perpus{
    String judul, pengarang, penerbit;
    int tahun;

    public perpus(String newjudul, String newpengarang, String newpenerbit, int newtahun){
        judul = newjudul;
        pengarang = newpengarang;
        penerbit = newpenerbit;
        tahun = newtahun
    }

    public void cetakdata() {
        System.out.println("Judul Buku : " + judul);
        System.out.println(" Pengarang : " + pengarang);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Tahun : " + tahun);
    }
}