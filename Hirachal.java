class Hirarchal
{
    public static void main(String Arg[])
    {
      DerivedX dobj1 = new DerivedX();
      DerivedX dobj2 = new DerivedX();

      
    }
}
class DerivedX extends Base
{
  public int P , Q;
   public DerivedX()
   {
    System.out.println("DerivedX constructor");
   }
}

class Base
{
   public int A,B; 
   {
    System.out.println("Base constructor");
   }

}
class Derived extends Base
{
  public int X,Y;
  public Derived()
  {
    System.out.println("Derived Constructor");
  }
  public void gun()
  {
    System.out.println("Derived gun");
  }
}
