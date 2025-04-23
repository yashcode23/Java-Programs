class InterfaceDemo
{
    public static void main(String arg[])
    {
       Marvellous mobj = new Marvellous();
       int iRet = 0;
       iRet=mobj.Addition(11,10);
       System.out.println("Addition is :"+iRet);
       iRet=mobj.Subtraction(21,20);
       System.out.println("Subtraction is :"+iRet);
    }
}
interface Mathematics  //Lencekart
{
    public int Addition(int A ,int B);   //Not Body
    public int Subtraction (int A ,int B); // Not Body
}

class Marvellous implements Mathematics   // Franchienjee
{
   public int Addition(int A,int B)
   {
    return A + B;
   }
   public int Subtraction(int A,int B)
   {
    return A - B;
   }
}

