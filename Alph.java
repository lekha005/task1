import java.util.*;
class Alph
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
       String n=in.next().toLowerCase();
       char a=n.charAt(0);
      if((int)a>=94 &&(int)a<=122)
       {
  System.out.print("Alphabet");
    }
    else
    {
        System.out.print("invalid");
    }
    }
}
