
class Overriding
{
    public static void main(String arg[])
    {
Base bobj = new Derived(); //up
// Base bobj = new Base(); //no
// Derived dobj = new Derived();//No
// Derived dobj = new Base();//down
bobj.fun();
bobj.gun();

bobj.sun();

bobj.run();

//bobj.run(11);
//bobj.mun();

    }
}
class Base
{
    public void fun()
    {
        System.out.println("Inside base fun");
    }
     public void gun()
    {
        System.out.println("Inside base gun");
    }
     public void sun()
    {
        System.out.println("Inside base sun");
    }
     public void run()
    {
        System.out.println("Inside base run");
    }

}
class Derived extends Base
{
  public void fun() //5000
  {
    System.out.println("Inside derived fun");
  }
  public void sun() //6000
  {
    System.out.println("Inside derived sun");
  }
  public void run(int A )  //7000
  {
    System.out.println("Inside derived run with parameter");
  }
  public void mun()   //8000
  {
    System.out.println("Inside derived mun");
  }
}