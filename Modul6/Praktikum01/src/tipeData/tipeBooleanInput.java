package tipeData;

import java.util.Scanner;

public class tipeBooleanInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Deklarasi
		boolean booleanKondisi, booleanStatus;
		int nilai1,nilai2;
		//Isi variabel nilai1 dan nilai2
		System.out.println("Masukkan Nilai 1 dan Nilai 2");
		System.out.println("----------------------------------");
			System.out.print("Masukkan Nilai 1    : ");
			nilai1 = input.nextInt() ;
			System.out.print("Masukkan Nilai 2    : ");
			nilai2 = input.nextInt() ;
			
			booleanKondisi = nilai1 > nilai2;
			booleanStatus = true;
			//Cetak
		   System.out.println("Tipe Data Boolean");
		   System.out.println("----------------------------------");		
		   System.out.println("Nilai BooleanKondisi Nilai 1 > Nilai 2  = "+ booleanKondisi);
		   System.out.println("Nilai booleanStatus          = "+ 
	            booleanStatus);


	}

}
