class Multi6
{
    public static void main(String arg[]) throws Exception
    {
        System.out.println("Current thread is :"+Thread.currentThread().getName());
        Demo obj1 = new Demo(); //New state
        Demo obj2 = new Demo(); //New state

        obj1.setName("First_Thread");
        obj2.setName("Second_Thread");



        obj1.start();  ///Runnable state             
        obj2.start();  //Runnable state

        obj1.join();

        obj1.getPriority();
        obj2.getPriority();
        System.out.println("Priority of obj1 :"+obj1.getPriority());
        System.out.println("Priority of obj2 :"+obj2.getPriority());


   
    }
}
class Demo extends Thread
{
    public void run ()
    {
        String name = Thread.currentThread().getName();
        System.out.println("Current thread is :"+Thread.currentThread().getName());
        for(int i =1;i<100;i++)
        {
            try 
            {
                System.out.println("Value of i is :"+i);
                Thread.sleep(100);

            }
            catch(Exception obj)
            {}
        }
        System.out.println("End of thread");
    }
}



