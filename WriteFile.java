import java.io.*;

class WriteFile
{
    public static void main(String arg[]) 
    {
        try
        {
            String Data = "Marvellous Infosystems";
            byte Arr[] = Data.getBytes(); //The method getBytes() encodes a String into a byte array 
                                         // using the platform’s default charset if no argument is passed.

            FileOutputStream fobj = new FileOutputStream("PPA.txt");
            fobj.write(Arr);
        }
        catch(Exception obj)
        {}
    }
}
