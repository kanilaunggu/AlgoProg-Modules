package variabel.latihan;

import java.util.Scanner;

public class variabelLokalProfileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String nama,alamat,email,hp;
		  Scanner input = new Scanner(System.in);
		  System.out.println("Masukkan Data Anda");
		  System.out.println("----------------------------------");
		  System.out.print("Masukkan Nama   : ");
		  nama = input.nextLine() ;
		  System.out.print("Masukkan Alamat : ");
		  alamat = input.nextLine() ;	  
		  System.out.print("Masukkan Email  : ");
		  email = input.nextLine() ;
		  System.out.print("Masukkan No.HP  : ");
		  hp = input.nextLine() ;

	}

}
