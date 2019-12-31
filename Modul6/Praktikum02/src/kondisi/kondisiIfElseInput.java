package kondisi;

import java.util.Scanner;

public class kondisiIfElseInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//membuat objek input
		Scanner input = new Scanner(System.in);
		int Angka = 0;
		System.out.print("Masukkan angka 1-100 : ");
		
	          //input nilai kedalam variabel Angka
		Angka = input.nextInt();
		
		//kondisi if..else..
		if (Angka > 1 && Angka <= 50)
		{
		  System.out.println("Anda tidak lulus");	
		}
		else
		{
		  System.out.println("Anda lulus");	
		}

	}

}
