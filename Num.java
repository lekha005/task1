import java.util.*;
class Num
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
       String[] n=in.nextLine().split(" ");
     int p=Integer.valueOf(n[0]),o=0;
      for(int i=0;i<n.length;i++)
      {
          o=Integer.valueOf(n[i]);
          if(o>p)
          {
          p=o;
          }
      }
      System.out.print(p);
    }
}
