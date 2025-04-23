import java.util.*;
class OOP
{
 public static void main(String Arg[])
 {
    int No1 = 0, No2 = 0;
   int Ans = 0;

    Scanner sobj= new Scanner(System.in);

    System.out.println("Enter First number ");
    No1 = sobj.nextInt();
    System.out.println("Second number:");
    No2 = sobj.nextInt();

    Arithmetic aobj = new Arithmetic(No1,No2);

    Ans = aobj.Addition();
    System.out.println("Addition is :"+Ans);

    Ans = aobj.Subtraction();
    System.out.println("Subtraction is :"+Ans);

    Ans = aobj.Multiplication();
    System.out.println("Multiplicaion is :"+Ans);

    sobj.close();
 }
}

class Arithmetic
{
    public int Value1;
    public int value2;
    public Arithmetic(int A,int B)
    {
        this.Value1= A;   // this Optional
        this.value2= B;
    }
    public int Addition()
    {
        int Result = 0;
        Result = this.Value1 + this.value2;
        return Result;
    }
    public int Subtraction()
    {
        int Result = 0;
        Result = this.Value1 - this.value2;
        return Result;
    }

    public int Multiplication()
    {
        int Result = 0;
        Result = this.Value1 * this.value2;
        return Result;
    }
}
