package operator.latihan;

public class latihanOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("Operator Aritmetika");
        int a = 6 + 7;
        int b = a * 5;
        int c = b / 3;
        int d = (c - a) + 2;
        int e = -d - 5;

        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        System.out.println(" c = " + c);
        System.out.println(" d = " + d);
        System.out.println(" e = " + e);
        
        System.out.println("Operator Boolean");
        
		boolean op_a = !false;
		boolean op_b = true;
		boolean op_c = op_a | op_b;
	    boolean op_d = op_a & op_b;
		boolean op_e = op_a ^ op_b;
		boolean op_f = (!op_a & op_b) | (op_a & !op_b);
		boolean op_g = !op_a;

		System.out.println(" op_a               = " + op_a);
		System.out.println(" op_b               = " + op_b);
		System.out.println(" op_a | op_b        = " + op_c);
		System.out.println(" op_a&op_b             = " + op_d);
		System.out.println(" op_a^op_b             = " + op_e);
		System.out.println(" !op_a&op_b|op_a&!op_b = " + op_f);
		System.out.println(" !op_a              = " + op_g);

	}

}
