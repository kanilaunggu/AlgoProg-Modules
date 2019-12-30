package operator;

public class operatorTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nilai1 = 50;
		   String keterangan;
		        
		   //Menggunakan if else
		   if (nilai1 >= 50)
		       keterangan = "lolos seleksi!";
		   else
		       keterangan = "tidak lolos seleksi!";	
		        
		   System.out.println("hasil VAR keterangan dari if-else");
		   System.out.println("------------------------------------------");
		   System.out.println(keterangan+'\n'); 
		        
		   int nilai2 = 50; 
		   //Menggunakan ternary
		   keterangan = (nilai2 >= 50)? "lolos seleksi!" : "tidak lolos seleksi!";
		        
		   System.out.println("hasil VAR keterangan dari Operator Ternary");
		   System.out.println("------------------------------------------");
		   System.out.println(keterangan+'\n');  

	}

}
