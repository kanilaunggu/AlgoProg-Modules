package variabel;

public class variabelInstanceSepeda {
	
	//variabel instance ini dapat digunakan oleh 
	//semua subkelas.
	 public String namaSepeda;
	 public int hargaSepeda;

	//variabel namaSepeda dan hargaSepeda
	//diinisialisasikan dalam konstruktor.
	//diinisialisasikan dalam konstruktor.
	 public variabelInstanceSepeda(String NamaSepeda, int HargaSepeda)
	 {
	  namaSepeda  = NamaSepeda;
	  hargaSepeda = HargaSepeda; 
	 }

	//Method ini menampilkan informasi sepeda.
	 public void tampilSepeda()
	 {
	   System.out.println("Nama sepeda  : "+namaSepeda);
	   System.out.println("Harga sepeda : "+hargaSepeda);
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variabelInstanceSepeda sepeda = 
			    new variabelInstanceSepeda("Sepeda Gunung",100000);
			  sepeda.tampilSepeda();

	}

}
