package perulangan;

public class perulanganForDalamFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // iterasi for diawali iterasi=1
	    // dan dijalankan sampai pada 
	    // iterasi <=15
		System.out.println("For tan for bersarang");
		System.out.println("-----------------------");
	    for (int iterasi = 1; iterasi <= 10; iterasi++)
	    {
	      System.out.println("*");
	    }
	    
	    
	      System.out.println("\nFor bersarang dalam for");
	      System.out.println("-----------------------");
	      for (int iterasi = 1; iterasi <= 15; iterasi++)
	      {
	        for (int iterasi2 = 1; iterasi2 <= iterasi; iterasi2++)
	        {
	          System.out.print("*");
	        } 
	        System.out.println("");
	      }

	}

}
