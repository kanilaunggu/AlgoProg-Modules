package kondisi;

import java.util.Scanner;

public class kondisiIfbersarang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //buat objek input
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("If Bersarang dalam If");
        System.out.println("--------------------");
        System.out.print("Masukkan nilai x : ");
        x = input.nextInt() ;

 
        if (x >= 13)
        {
            // if pertama yang bersarang
            if (x == 13)
                System.out.println("variabel x = 13");
 
            //if kedua yang bersarang
            if (x <= 14)
                System.out.println("variabel x <= 14");
            else
                System.out.println("variabel x > 14");
        }
        else
        {
        	System.out.println("Nilai x < 13");	
        }

	}

}
