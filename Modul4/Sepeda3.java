//Contoh 4.19. Contoh lain dengan variabel static dengan konstan
public class Sepeda3 {

    /**
     * variabel hargaSepeda adalah 
     * modifier private dan
     * variabel static
    **/
    private static int hargaSepeda;
 
    // variabel jenisSepeda konstan
    public static final String JENISSEPEDA = "Sepeda Gunung";
 
    public static void main(String args[]) {
       hargaSepeda = 12000000;
       System.out.println(JENISSEPEDA+" harganya : Rp. " + 
                          hargaSepeda);
    }
 }
 