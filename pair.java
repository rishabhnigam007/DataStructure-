import java.util.*;
public class pair
{
   public static void main(String args[])
   {
      int sum=16;
      int arr[]={ 1, 4, 45, 6, 10, 8 };
      HashSet<Integer> hs=new HashSet<Integer>();
      for(int i=0;i<arr.length;i++)
      {
          int temp=sum-arr[i];
          if(hs.contains(temp))
          {
              int j=1;
              System.out.print(j+" pair is :");
              System.out.println("("+arr[i]+","+temp+")");
              j++;
          }
          hs.add(arr[i]);
      }
    }
}