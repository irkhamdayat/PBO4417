public class manusia {
    String nama = "-";
    boolean TVtersedia = false;

    public manusia(){
    }

    public manusia(String newname) {
        nama = newname;
    }
    public void namaorang(){
        System.out.println(nama);

    }

    void beliTV(){
        TVtersedia = true;
    }
    void jualTV(){
        TVtersedia = false;
    }

    public void checkTV(){
        System.out.println(TVtersedia);
    }

    public static void main(String[] args) {
        manusia orang1 = new manusia("adi");
        orang1.namaorang();
        TestTV tvku = new TestTV();
        orang1.beliTV();
        orang1.checkTV();
        orang1.jualTV();
        orang1.checkTV();
    }
}
