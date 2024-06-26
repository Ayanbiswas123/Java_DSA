import java.util.Scanner;

public class Problem_1 {

    static int binarySearch(int[] arr, int num) {

        int l = 0;
        int r = arr.length - 1;
        
        int temp = -1;
        while (l <= r) {
            int mid = (r + l) / 2;
            if (num == arr[mid]) {
                temp = mid;
                r = mid-1;
            }else if (num < mid) {
                r = mid - 1;
            } else {

                l = mid + 1;
            }
        }
        return temp;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length = ");
        int n = sc.nextInt();
        System.out.println("Enter the Element of Array = ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Number = ");
        int num = sc.nextInt();

        int i = binarySearch(arr, num);

        if (i > 0) {
            System.out.println("The Number position in the Array =  " + i);
        } else {
            System.out.println("The number Not Exixt in the array " + i);
        }

    }
}