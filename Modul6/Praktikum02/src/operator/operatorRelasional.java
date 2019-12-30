package operator;

public class operatorRelasional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 2, b = 3;
        String x = "Relasional", y = "relasional";
        int ar[] = { 1, 2, 3 };
        int br[] = { 1, 2, 3 };
        boolean kondisi = true;
 
        //Penggunaan operator relasional
        System.out.println("Penggunaan operator relasional");
        System.out.println("------------------------------");
        System.out.println("a == a : " + (a == b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a <  b : " + (a <  b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a >  b : " + (a >  b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a != b : " + (a != b));
 
        // Untuk Array tidak bisa di bandingkan 
        // menggunakan operator relasional
        // nilai akan menghasil false
        System.out.println("x == y : " + (ar == br));
 
        System.out.println("kondisi==true :" + (kondisi == true));
        System.out.println("\nKeterangan: a=2 dan b=3");
        System.out.println("x='Relasional' dan y='relasional'");

	}

}
