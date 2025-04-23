import java.util.*;

class program210
{
    public static int SumOddDigits(int iNo)
    {
        int iSum = 0, iDigit = 0;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) != 0)
            {
                iSum = iSum + iDigit;
            }
            iNo = iNo / 10;
        }
        return iSum;
    }
   
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, iRet = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iRet = SumOddDigits(iValue);

        System.out.println("Summation of odd digits : "+iRet);
    }
}