package perulangan;
import java.util.Scanner;
public class perulanganExit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//buat objek input
		Scanner input = new Scanner(System.in);
		//Deklarasi variabel angka
		int angka, Perulangan = 0;

	   do
         {
	       Perulangan++;
           System.out.print("Perulangan ke "+Perulangan+", Nilai angka [1-9] atau 0 untuk keluar : ");
            angka = input.nextInt(); 
            if(Perulangan==10) break;        
        }
        while (angka > 0);
		
	   System.out.println("Anda keluar dari perulangan");
	   System.out.println("Perulangan selama: "+Perulangan+ " kali");

	}
}

