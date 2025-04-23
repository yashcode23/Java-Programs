
class Multilevel
{
    public static void main(String Arg[])
    {
      DerivedX dobj = new DerivedX();
      
      dobj.gun();
      dobj.fun();
     
    }
}

class Base
{
   public int A,B;
   public Base()
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

class DerivedX extends Derived
{
  public int P , Q;
   public DerivedX()
   {
    System.out.println("DerivedX constructor");
   }
   public void fun()
  {
    System.out.println("Derived fun");
  }
}