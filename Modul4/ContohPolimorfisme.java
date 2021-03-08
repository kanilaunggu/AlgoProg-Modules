//Super Class
class Sepeda {
    public void jenisSepeda ( ) 
    {
     System.out.println("Karakteristik Sepeda" + "belum didefinisikan");
    }
  }
  // mendefinisikan kelas-kelas turunan dari kelas Sepeda
  //Sub Class Sepeda Gunung
  class sepedaGunung extends Sepeda 
    {
  // melakukan override terhadap method jenisSepeda ( )
    public void jenisSepeda ( ) 
    {
      System.out.println("Jenis Sepeda Gunung");
      System.out.println("Jenis Sepeda dengan Ban Kasar");
    }
  }
  //Sub Class Sepeda Santai
  class sepedaSantai extends Sepeda {
    public void jenisSepeda ( ) 
    {
      System.out.println("Jenis Sepeda Santai");
      System.out.println("Jenis Sepeda dengan Ban Halus");
    }
  }
  //Main Class
  public class ContohPolimorfisme {
    public static void main (String[] args) 
    {
      Sepeda Jenis;
  
      sepedaGunung banKasar = new sepedaGunung ( );
      sepedaSantai banHalus = new sepedaSantai ( );
  
      // Jenis mengacu pada objek sepedaGunung
      Jenis = banKasar; 
      // akan memanggil method pada kelas sepedaGunung
      Jenis.jenisSepeda ( );
   
      System.out.println("");
   
      // Jenis mengacu pada objek sepedaSantai 
      Jenis = banHalus;
      // akan memanggil method pada kelas sepedaSantai
      Jenis.jenisSepeda ( );
     }
  }
  
