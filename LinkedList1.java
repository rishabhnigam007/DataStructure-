import java.util.*;
import java.io.*; 
class LinkedList1  
{  
  
// Defining structure  
	static class Node  
	{  
	    int data;  
	    Node next;  
	} 
        
// Push function  
	static void push(Node head, int info)  
	{  
	    Node node = new Node();  
	    node.data = info; 
	    node.next = (head);  
            (head) = node;  
	}  
  
// Driver code  
	public static void main(String[] args)  
	{  
	    Node head = null; 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many nodes you want to insert :"); 
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int x=sc.nextint();
			push(head,x);
		}
	//	    push(head, 5);   
		void display()
		{
			while(head!=null)			
				System.out.println(node);
		}
	} 
}  