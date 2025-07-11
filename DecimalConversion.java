import java.util.Scanner;

public class DecimalConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        System.out.println("------------");
        System.out.println("Binary of that number is : ");
//        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
//        System.out.println(sb);
//        System.out.println("------------");
//        System.out.println("Reverse is : ");
////                String r=new StringBuilder(sb.reverse()).toString();
//        String r = sb.reverse().toString();
//        int rev = new Integer(Integer.parseInt(r));
//        System.out.println(rev);

        // Decimal to Binary as int
        int rem, binary = 0, place = 1;
        int x = n;
        while (x > 0) {
            rem = x % 2;
            binary += rem * place;
            place *= 10;
            x = x / 2;
        }

        System.out.println("Binary : " + binary);

        // Reverse logic
        int z = 0;
        int temp = binary;
        while (temp != 0) {
            z = z * 10 + temp % 10;
            temp = temp / 10;
        }
        System.out.println("reverse : " + z);
    }
}

/*
output:
Enter number :
25
------------
Binary of that number is :
Binary : 11001
reverse : 10011
 */