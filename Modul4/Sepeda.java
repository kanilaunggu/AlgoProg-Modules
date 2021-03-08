import paketSepeda.*;

class Sepeda {
  public static void main(String[] args) 	{
    System.out.println("Jenis Sepeda");
  	System.out.println("------------------");
	    //memanggil paket;
	    SepedaGunung sepeda1 = new SepedaGunung();
  	sepeda1.sepedaGunung();
    SepedaSantai sepeda2 = new SepedaSantai();
	    sepeda2.sepedaSantai();
  }
}

