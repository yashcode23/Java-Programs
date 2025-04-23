import java.io.*;

class Readfile
{
    public static void main(String arg[])  
    {
       File obj = new File("PPA,txt");
       if(obj.delete())
       {
        System.out.println("File gets deleted");
       }
    }
}