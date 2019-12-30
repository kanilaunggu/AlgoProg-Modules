package variabel;

public class variabelStaticSepedaKonstanta {
	 /**
	  * variabel hargaSepeda adalah 
	  * modifier private dan
	  * variabel static
	  **/
   private static int hargaSepeda;

   // variabel jenisSepeda konstan
   public static final String JENISSEPEDA = "Sepeda Gunung";
	
public static void main(String[] args) {
  // TODO Auto-generated method stub
  hargaSepeda = 12000000;
  System.out.println(JENISSEPEDA+" harganya : Rp. " + hargaSepeda);

}
}

