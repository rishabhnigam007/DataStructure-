
import java.util.Scanner;

public class DecimalConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        System.out.println("------------");
        System.out.println("Binary of that number is : ");
//                StringBuilder sb=new StringBuilder(Integer.toBinaryString(n));
//                System.out.println(sb);
//                System.out.println("------------");
//                System.out.println("Reverse is : ");
////                String r=new StringBuilder(sb.reverse()).toString();
//                String r=sb.reverse().toString();
//                int rev=new Integer(Integer.parseInt(r));
//                System.out.println(rev);
        int rem=0,d=1;
        int x=n;
        while (x > 1)
        {
            rem=x%2;
            d=rem+d*10;
            x=x/2;
            System.out.println("rem : "+rem+"\t"+" d : "+d+"\t"+" n : "+x);
        }
        System.out.println("Binary : "+d);
        int z=0;
        while(n!=0)
        {
            z=z*10+n%10;
            n=n/10;
        }
        System.out.println("reverse : "+z);
    }
}
