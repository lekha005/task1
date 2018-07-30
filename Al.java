import java.util.*;
class Al
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
       String n=in.next().toLowerCase();
       char a=n.charAt(0);
      if((int)a>=94 &&(int)a<=122)
       {
    if(n.contains("a") || n.contains("e") || n.contains("i") || n.contains("o") || n.contains("u"))
    {
        System.out.print("Vowel");
    }
    else
    {
        System.out.print("Consonant");
    }
       }
       else
       {
           System.out.print("invalid");
       }  
    }
}
