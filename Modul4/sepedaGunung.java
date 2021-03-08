abstract class  Sepeda //superClass
{
    private int kecepatan = 12;
    public void info()
    {
        System.out.println("Kecepatan = \t "+kecepatan);
        System.out.println("Panggil dari sub-class "+
                            this.getClass().getName());
    }
}
//Sub class
public class  sepedaGunung extends Sepeda
{
  public static void main(String[] args)
  {
      //membuat objek
      sepedaGunung objek = new sepedaGunung();
      //memanggil objek
      objek.info();
  }
}

