import java.util.Scanner;

public class Quick_sort {
    static void swap(int [] arr, int l, int pi_index){
        int temp = arr[l];
        arr[l] = arr[pi_index];
        arr[pi_index] = temp;

    }

    static void display(int[] arr){
        System.out.println("Output = ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int partition(int[] arr, int l, int r){
        int pivot = arr[l];
        int count = 0;
        for(int i = l+1; i <= r; i++){
            if(arr[i] <= pivot){
                count++;
            }
        }
        int pi_index = l + count;
        swap(arr,l,pi_index);
        int i = l;
        int j = r;
        while(i < pi_index && j > pi_index){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            if(i < pi_index && j > pi_index){
                swap(arr, i,j);
                i++;
                j--;
            }

        }
        return pi_index;
    }
    static void quickSort(int[] arr, int l, int r){
        if(l > r) return;
        int pi = partition(arr,l,r);
        quickSort(arr, l, pi-1);
        quickSort(arr,pi+1,r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array size = ");
        int n = sc.nextInt();
        System.out.println("Enter the Array element = ");
        int [] arr1 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        int l = 0;
        int r = arr1.length-1;
        quickSort(arr1,l,r);
        display(arr1);

    }
    
}
