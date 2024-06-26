import java.util.Scanner;

public class insertion_sort {

    static void display(int [] arr){
        System.out.println("Output :-");
       for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
       }
    }
   static void insertionSort(int [] arr, int n){
        for(int i = 1; i < n; i++){

            int k = i;
            while( k > 0 && (arr[k] < arr[k - 1])){
                int temp = arr[k];
                arr[k] = arr[k-1];
                arr[k-1] = temp;
                k--;
            }
        }
   }
    
    public static void main(String[] args) {
        System.out.println("insertion sort");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of Array = ");
        int n = sc.nextInt();
        System.out.println("Enter Array Element = ");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr, n);

        display(arr);
    }
}
