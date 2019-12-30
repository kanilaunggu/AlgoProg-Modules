package operator;

public class operatorPenugasan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Deklarasi dan INISIASI nilai awal
        int a = 20, b = 10, c, d, e = 10, f = 4;
 
        // contoh penugasa sederhana
        c = b;
        System.out.println("Nilai c = " + c);
 
        // contoh operasi 
        // penambahan, pengurangan,
        // perkalian, dan pembagian
        // dengan cara biasa
        a = a + 1;
        b = b - 1;
        e = e * 2;
        f = f / 2;
        System.out.println("Nilai dengan operan BIASA");
        System.out.println("--------------------------");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai e = " + e);
        System.out.println("Nilai f = " + f);
        System.out.println("");
        // mengembalikan ke nilai awal sepert pada
        // saat INISIASI nilai awal
        a = a - 1;
        b = b + 1;
        e = e / 2;
        f = f * 2;
 
        // menggunakan operator penugasa singkat
        // yang hasilnya sama dengan operasi biasa
        a += 1;
        b -= 1;
        e *= 2;
        f /= 2;
        System.out.println("Nilai dengan operan SINGKAT");
        System.out.println("--------------------------");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai e = " + e);
        System.out.println("Nilai f = " + f);
        System.out.println("");

        // menggunakan operator Modulus
        f %= 2;
        System.out.println("Modulus");
        System.out.println("--------------------------");

    System.out.println("Nilai f = " + f);

	}

}
