class Muti3
{
    public static void main(String arg[])
    {
        System.out.println("Current thread is :"+Thread.currentThread().getName());
        Demo obj1 = new Demo(); //New state
        Demo obj2 = new Demo(); //New state

        obj1.setName("First_Thread");
        obj2.setName("Second_Thread");

        obj1.start();  //Runnable state
        obj1.start();  //Runnable state
        obj.join();
        System.out.println("End of main thread");
        
    }
}
class Demo extends Thread
{
    public void run ()
    {
        String name = Thread.currentThread().getName();
        System.out.println("Current thread is :"+Thread.currentThread().getName());
        for(int i =1;i<1000;i++)
        {
        }
        System.out.println("End of thread");
    }
}



