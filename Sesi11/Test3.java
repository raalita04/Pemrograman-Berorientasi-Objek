import java.io.*;
public class Test3 {
   public void methodA(){
       System.out.println("Method A");
   }
   public void methodB() throws IOException
   {
       System.out.println("20/0");
       System.out.println("Method B");
   }
}
class utama 
{
    public static void main(String[] args)
    {
        Test3 o=new Test3();
        o.methodA();
        try
        {
            o.methodB();
        }
        catch(Exception e)
        {
            System.out.println("Error di Method B");
        }
        finally
        {
            System.out.println("Ini selalu dicetak");
        };
    }
}
