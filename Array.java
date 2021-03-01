import java.util.*;
class Array
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int a[]=new int[len];
		for(int i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);	
		}
	}
}