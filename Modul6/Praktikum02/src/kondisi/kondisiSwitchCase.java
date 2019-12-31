package kondisi;

import java.util.Scanner;

public class kondisiSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner  input = new Scanner(System.in);
        int angka;
        
        
        do
        {
        	System.out.print("Masukkan angka [1-9] : ");
        	angka = input.nextInt();
            switch (angka)
            {
            case 1:
                System.out.println("Angka Satu");
                break;
            case 2:
            	System.out.println("Angka Dua");
                break;
            case 3:
            	System.out.println("Angka Tiga");
                break;
            case 4:
                System.out.println("Angka Empat");
                break;
            case 5:
            	System.out.println("Angka Lima");
                break;
            case 6:
            	System.out.println("Angka Enam");
                break;
            case 7:
                System.out.println("Angka Tujuh");
                break;
            case 8:
            	System.out.println("Angka Delapan");
                break;
            case 9:
            	System.out.println("Angka Sembilan");
                break;                
            default:
                System.out.println("Anda memilih keluar");
            }
        	
        }
        while (angka > 0);

	}

}
