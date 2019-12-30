package variabel;

import java.util.Scanner;

public class variabelInstanceSepedaInput {
	
	//variabel instance ini dapat digunakan oleh 
	//semua subkelas.
	 public String namaSepeda;
	 public int hargaSepeda;

	//variabel namaSepeda dan hargaSepeda
	//diinisialisasikan dalam konstruktor.
	//diinisialisasikan dalam konstruktor.
	 public variabelInstanceSepedaInput(String NamaSepeda, int HargaSepeda)
	 {
	  namaSepeda  = NamaSepeda;
	  hargaSepeda = HargaSepeda; 
	 }

	//Method ini menampilkan informasi sepeda.
	 public void tampilSepeda()
	 {
	   System.out.println("Masukkan Nama Sepeda dan Harga Sepeda");
	   System.out.println("----------------------------------");		 
	   System.out.println("Nama sepeda  : "+namaSepeda);
	   System.out.println("Harga sepeda : "+hargaSepeda);
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String namaSepeda;
		  int hargaSepeda;
		  Scanner input = new Scanner(System.in);
		  System.out.println("Masukkan Nama Sepeda dan Harga Sepeda");
		  System.out.println("----------------------------------");
		  System.out.print("Masukkan Nama Sepeda  : ");
		  namaSepeda = input.nextLine() ;
		  System.out.print("Masukkan Harga Sepeda : ");
		  hargaSepeda = input.nextInt() ;
		  
		  variabelInstanceSepedaInput sepeda = new
	      variabelInstanceSepedaInput(namaSepeda,hargaSepeda);
	    sepeda.tampilSepeda();


	}

}
