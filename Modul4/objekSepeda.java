//class cetak biru
class Sepeda {

    int kecepatan = 0;


    void tambahKecepatan(int tambah) {
         kecepatan = kecepatan + tambah;   
    }

    void kurangiKecepatan(int kurang) {
         kecepatan = kecepatan - kurang;   
    }

    void printTambah() {
         System.out.println("Naik ke Kecepatan\t:" + kecepatan );
    }
    
    void printKurang() {
         System.out.println("Turun ke Kecepatan\t:" + kecepatan );
    }

}
//Class Utama
public class objekSepeda {
    public static void main(String[] args) {
        // membuat objek 
        // dengan nama SepedaGunung
        Sepeda sepedaGunung = new Sepeda();

        // memanggil method pada objek
        System.out.println("Sepeda Gunung");
        System.out.println("--------------------------");
        sepedaGunung.tambahKecepatan(50);
        sepedaGunung.printTambah();
        sepedaGunung.kurangiKecepatan(10);
        sepedaGunung.printKurang();
    }
}
