package perulangan;

public class perulanganForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String [] Sepeda = {"Gunung", "Santai", "Balap", "Ontel"};

        System.out.println("Jenis Sepeda cetak Array klasik ");
        System.out.println("------------------------------- ");
        //Perulangan  Array klasik
        for (int i = 0; i < Sepeda.length; i++)
        {
            System.out.println(Sepeda[i]);
        }
        
        System.out.println("\nJenis Sepeda cetak dengan Array Java5");
        System.out.println("------------------------------------- ");
        //Perulangan array  yang disederhanakan
        for(String nama_sepeda : Sepeda ) {
           System.out.println( nama_sepeda );
        }

	}

}
