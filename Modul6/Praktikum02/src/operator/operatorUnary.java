package operator;

public class operatorUnary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 5, c = 0, d = 15, e = 12;
        boolean kondisi = true;
 
        // operator pre-increment
        // a = a+1 dan kemudian c = a;
        c = ++a;
        System.out.println("Nilai c (++a) = " + c);
 
        // operator post-increment
        // c=b kemudian b=b+1
        c = b++;
        System.out.println("Nilai c (b++) = " + c);
 
        // operator pre-decrement
        // d=d-1 kemudian c=d + 1
        c = --d + 1;
        System.out.println("Nilai c (--d) = " + c);
 
        // operator post-decrement
        // c=e kemudian e=e-1
        c = --e;
        System.out.println("Nilai c (--e) = " + c);
 
        // Membalik kondisi
        System.out.println("Nilai !kondisi = " + !kondisi);

	}

}
