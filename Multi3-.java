class Multi3
{
    public static void main(String arg[])
    {
        System.out.println("Current thread is :"+Thread.currentThread().getName());
        Demo obj1 = new Demo(); //New state
        Demo obj2 = new Demo(); //New State
         


        obj1.start();  //Runnable state
        obj2.start();  //Runnable state


        
    }
}
class Demo extends Thread
{
    public void run ()
    {
      System.out.println("Current thread is :"+Thread.currentThread().getName());

    }
}



