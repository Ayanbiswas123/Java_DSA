 import java.util.Scanner;
public class Selection_sort {

    static void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void selectionSort(int[] arr, int n){

        for(int i = 0; i < arr.length; i++){
            int min = arr[i];
            int k = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    k = j;
                }
            }

            if(min != arr[i]){

                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp; 
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Selection sort");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of Array = ");
        int n = sc.nextInt();
        System.out.println("Enter Array Element = ");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr, n);

        display(arr);
    }
    
}
