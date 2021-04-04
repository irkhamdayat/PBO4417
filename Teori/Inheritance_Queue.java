import java.util.Queue;
import java.util.LinkedList;
public class Inheritance_Queue {
      public static void main(String args[]){
            Sayur sayur = new Sayur();
            System.out.println(sayur.sisaSayur());
 
            sayur.tambahSayur("Bayam");
            sayur.tambahSayur("Kangkung");
            sayur.tambahSayur("Sawi");
            sayur.tambahSayur("Pepaya");
            sayur.tambahSayur("Singkong");
            System.out.println(sayur.sisaSayur());
 
            sayur.sayurBusuk(3);
            System.out.println(sayur.sisaSayur());
      }      
}

class Toko_Sayur {
      Queue<String> vegetable = new LinkedList<String>();
 
      public Toko_Sayur(){
 
      }
      public void setSayur(Queue<String> vegetable) {
            this.vegetable = vegetable;
      }
      public Queue<String> getSayur(){
            return this.vegetable;
      }
}

class Sayur extends Toko_Sayur {
      public void tambahSayur(String vegetable){
            super.getSayur().add(vegetable);
      }
      public void sayurBusuk(int index){
            System.out.println(super.getSayur().poll());
      }
      public Queue<String> sisaSayur(){
            return super.getSayur();
      }
} 