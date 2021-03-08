//Contoh 4.16.  Penggunaan variabel lokal dalam pemrograman Java 
public class Kecepatan {
    public void tambahKecepatan() {
       int cepat = 0;
       cepat = cepat + 40;
       System.out.println("Penambahan Kecepatan : " + cepat);
    }
 
    public static void main(String args[]) {
       Kecepatan kecepatan = new Kecepatan();
       kecepatan.tambahKecepatan();
    }
 }
 
