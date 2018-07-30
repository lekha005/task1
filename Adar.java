import java.util.*;
class Adar
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         int k=in.nextInt();
         int[] a=new int[n];
         int sum=0;
         for(int i=0;i<n;i++)
         {
          a[i]=in.nextInt();
          if(k>i)
          {
              sum=sum+a[i];
          }
         }
        System.out.print(sum);
    }
}
