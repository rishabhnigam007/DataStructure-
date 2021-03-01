import java.util.*;
class array
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array :");
	    int s=sc.nextInt();
	    int arr[]=new int[s];
	    int i,j,m;
        System.out.println("enter array element :");
	    for(i=0;i<s;i++)
	        arr[i]=sc.nextInt();
	    if(arr.length%2==0)
	        m=arr.length/2;
	    else
	        m=(arr.length+1)/2;
	    /*for(i=0;i<m-1;i++)
	    {
	        for(j=i;j<i+1;j++)
	        {
	            if(arr[i]>arr[j])
	                arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
	        }
	    }
	    for(i=m;i<arr.length;i++)
	    {
			for(j=i;j<i+1;j++)
	        {
	            if(arr[i]<arr[j])
	                arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
	        }
	    }*/
	    for(i=0;i<arr.length;i++)
	    {
	        if(i<m)
	        {
	            for(j=i+1;j<m;j++)
	            {
			//for increasing 
	                if(arr[i]>arr[j])
	                    arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
	            }
	        }
	        else
	        {
	            for(j=i+1;j<arr.length;j++)
	            {
			//for decreasing 
	                if(arr[i]<arr[j])
	                    arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
	            }
	        }
	    }
	    System.out.println("half increase and half decrease array is :");
	for(i=0;i<s;i++)
		System.out.print(" "+arr[i]);
	sc.close();
	}
}