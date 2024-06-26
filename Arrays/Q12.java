// Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.
// middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
// middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
// middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        System.out.println("Enter elements of array a:");
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter elements of array b:");
        for (int i = 0; i < 3; i++) {
            b[i] = scanner.nextInt();
        }
        scanner.close();
        int[] result = middleWay(a, b);
        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static int[] middleWay(int[] a, int[] b) {
        int[] result = new int[2];
        result[0] = a[1];
        result[1] = b[1];
        return result;
    }
}
