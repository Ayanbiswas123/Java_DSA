import java.util.Scanner;

public class O3_MatrixMultiplication {
    public static void display(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillarray(int[][] arr, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static int[][] MulOfTwoMatric(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;

        int[][] c = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < cols; k++) {
                    c[i][j]+= arr1[i][k] * arr2[k][j];
                }

            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of array:");
        int n = sc.nextInt();
        int[][] array1 = new int[n][n];
        int[][] array2 = new int[n][n];

        System.out.println("Enter the element of the Array 1");
        fillarray(array1, n);

        System.out.println("Enter the element of the Array 2");
        fillarray(array2, n);

        System.out.println("Display Array 1");
        display(array1, n);

        System.out.println("Display Array 2");
        display(array2, n);

        int[][] mulOfTwoMatric = MulOfTwoMatric(array1, array2);
        System.out.println("The resulting Multiplied Matrix is:");
        display(mulOfTwoMatric, n);

        sc.close();
    }
}
