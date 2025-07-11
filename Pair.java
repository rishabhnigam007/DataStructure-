import java.util.HashSet;

public class Pair {
    public static void main(String args[]) {
        int sum = 16;
        int arr[] = {1, 4, 45, 6, 10, 8, 12, 8};
        int j = 1;
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            if (hs.contains(temp)) {
//              int j=1;
                System.out.print(j + " Pair is :");
                System.out.println("(" + arr[i] + "," + temp + ")");
                j++;
            }
            hs.add(arr[i]);
        }
    }
}
/*
output:
1 Pair is :(10,6)
2 Pair is :(12,4)
3 Pair is :(8,8)
 */