Simple Java Interface program
import java.lang.*;
interface A
{
Void message ();
}
class B implement A
{
   void display ()
{
  System.out.println(" Simple Interface ");
}
}

class Mainmethod
{
    public static void main (String args[])
   {
       B b = new B();
       b.display();
   }
}
  
