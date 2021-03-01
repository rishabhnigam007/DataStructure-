import java.util.*;
public class Queue 
{
    private int size;
    private int total;
    private int queue[];
    private int front,rear;
    Queue(int size)
    {
        this.size=size;
        total=0;
        front=0;
        rear=0;
        queue=new int[size];
    }
    boolean isFull()
    {
        if(size==total)
            return true;
        else
            return false;
    }
    boolean isEmpty()
    {
        if(front==0&&rear==0)
            return true;
        else
            return false;
    }
    boolean enqueue(int x)
    {
        if(!isFull())
        {
            total=total+1;
            queue[rear]=x;
            rear=rear+1;
            return true;
        }
        else
        {
            return false;
        }
    }
    int dequeue()
    {
        int x=queue[front];
        total=total-1;
        front=front-1;
        return x;
    }
    void display()
    {
        System.out.println("one dequeue element is :"+dequeue());
        System.out.println("queue element is :");
        for(int i=0;i<size;i++)
            System.out.print(queue[i]+" ");
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the queue :");
        int size=sc.nextInt();
        int i;
        Queue s=new Queue(size);  
        System.out.println("enter queue element :");     
        for(i=0;i<size;i++)
            s.enqueue(sc.nextInt());
        s.display();
        sc.close();
    }
}