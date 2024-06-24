import java.util.Scanner;

public class J1_Bubble_sort {

    static void display(int [] arr){
        System.out.println("Output :-");
       for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
       }
    }
    static void bubbleSort(int[] arr, int n){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1 - i; j++){

                if(arr[j] >= arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

    }
    public static void main(String[] args) {
        System.out.println("Bubble sort");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of Array = ");
        int n = sc.nextInt();
        System.out.println("Enter Array Element = ");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr, n);

        display(arr);
    }
}
