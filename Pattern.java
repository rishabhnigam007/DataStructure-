import java.util.*;
class Pattern
{
	public static void main(String arp[])
	{
		int N,i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of line :");
		N=sc.nextInt();
		System.out.println();
		for(i=0;i<N;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(k=65+i;k<65+N-1;k++)
			{
				System.out.print((char)+k);
			}
			for(;k>=65+i;k--)
			{
				System.out.print((char)+k);
			}
			System.out.println();
		}			
	}
}

/* 

n=4
ABCDCBA
 BCDCB
  CDC
   D
*/