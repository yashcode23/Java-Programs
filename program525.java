import java.util.*;
import java.io.*;

class program525
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("------- Marvellous Packer Unpacker CUI Module -------");

        System.out.println("Enter the name of Directory that you want to open : ");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if(fobj.exists())
        {
            File Arr[] = fobj.listFiles();

            System.out.println("Number of files in directory are : "+Arr.length);

            String Header = Arr[0].getName();
            Header = Header + " " + Arr[0].length();

            System.out.println("Header of first file is : ");   // Demo.txt 10
            System.out.println(Header);

            System.out.println("Length of header is : "+Header.length());

            int i = 0;

            for(i = Header.length(); i < 100; i++)
            {
                Header = Header + " ";
            }
            System.out.println("Header of first file after updation is : ");   // Demo.txt 10
            System.out.println(Header);

            System.out.println("Length of header after updation is : "+Header.length());
        }
        else
        {
            System.out.println("There is no such directory");
        }
     
    }
}