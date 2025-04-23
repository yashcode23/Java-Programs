class Single
{
    public static void main(String Arg[])
    {
      Derived dobj = new Derived();
      dobj.fun();
      dobj.gun();
    }
}
class Base
{
   public int A,B;
   public Base()
   {
    System.out.println("Base constructor");
   }
   public void fun()
   {
    System.out.println("Base fun");
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
//E:\PPA>javac Single.java

//E:\PPA>java Single.java

