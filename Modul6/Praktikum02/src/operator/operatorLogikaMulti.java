package operator;

public class operatorLogikaMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int nilaiA = 25;
	      int nilaiB = 40;
	      float nilaiC = 40.4f;
	 
	      boolean a = nilaiA > nilaiB && nilaiB < nilaiC || 
                     nilaiC < nilaiB;
	      boolean b = nilaiA < nilaiB || nilaiB < nilaiC && 
                     nilaiC < nilaiB;
	 
	      //Jika dijalankan
	      System.out.println("Nilai dari a : "+a); //hasilnya: false
	      System.out.println("Nilai dari b : "+b); //hasilnya: true    

	}

}
