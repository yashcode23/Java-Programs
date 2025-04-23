import java.ioMariaDB [PPA]> select * from student;
+------+--------+-------+---------+
| RNO  | Name   | MArks | Adress  |
+------+--------+-------+---------+
|   11 | Amit   |    89 | Pune    |
|   12 | Pooja  |    79 | Mumbai  |
|   13 | Ketan  |    89 | nashik  |
|   14 | Abhi   |    88 | Jalgaon |
|   15 | Sakshi |    78 | Sangli  |
|   16 | Gauri  |    56 | Pune    |
+------+--------+-------+---------+
6 rows in set (0.001 sec)
*;

class Writefile
{
    public static void main(String arg[])  
    {
        try
        {
          File fobj = new File("PPA.txt");
          fobj.delete();
        }
        catch(Exception obj)
        {}
    }
}