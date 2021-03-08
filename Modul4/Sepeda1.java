//Contoh 4.17.  Penggunaan variabel instance dalam pemrograman Java
public class Sepeda1 {
    //variabel instance ini dapat digunakan oleh 
    //semua subkelas.
     public String namaSepeda;
     public int hargaSepeda;
    
     //variabel namaSepeda dan hargaSepeda
     //diinisialisasikan dalam konstruktor.
     public Sepeda1 (String NamaSepeda, int HargaSepeda)
     {
      namaSepeda  = NamaSepeda;
      hargaSepeda = HargaSepeda; 
     }
    
     //Method ini menampilkan informasi sepeda.
     public void tampilSepeda()
     {
       System.out.println("Nama sepeda  : "+namaSepeda);
       System.out.println("Harga sepeda : "+hargaSepeda);
     }
     
      public static void main(String[] args) {
       Sepeda1 namasepeda = new Sepeda1("Sepeda Gunung",100000);
       namasepeda.tampilSepeda();
      }
    }
    
