import java.util.Scanner;

public class atozusecom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] arr = new String[n];

        arr[0] = "a";
        arr[1] = "c";
        arr[2] = "d";
        arr[3] = "b";
        arr[4] = "e";
        for (int i = 0; i < arr.length; i++) {
            int k = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) < 0) {

                }else {
                        k = j;
                }
            }
            if (k != i) {
                String temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
            
        }

        for (String str : arr) {
            System.out.print(str + ", ");
        }

        sc.close();
    }
}
