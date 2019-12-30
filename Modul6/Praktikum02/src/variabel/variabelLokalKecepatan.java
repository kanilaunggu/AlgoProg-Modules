package variabel;

public class variabelLokalKecepatan {

	public void tambahKecepatan() {
	    int cepat = 0;
	    System.out.println("Kecepatan Awal : " + cepat);
	    cepat = cepat + 40;
	    System.out.println("Penambahan Kecepatan : " + cepat);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variabelLokalKecepatan kecepatan = new variabelLokalKecepatan();
	    kecepatan.tambahKecepatan();

	}

}
