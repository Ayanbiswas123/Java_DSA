import java.util.Scanner;

public class Marge_sort {

    static void display(int [] arr){
        System.out.println("Output :-");
       for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
       }
    }
    static void marge_both(int[] arr, int l, int mid, int h){
        int n1 = mid-l+1;
        int n2 = h - mid;
        int [] left = new int[n1];
        int[] right = new int[n2];

        int i,j,k;
        for(i = 0; i < n1; i++){
            left[i] = arr[l+i];
        }
        for(j = 0; j < n2; j++){
            right[j] = arr[mid+1+j];
        }
        i=j=0;
        k = l;

        while ( i < n1 && j < n2) {
            
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }
        while( i < n1){
            arr[k++] = left[i++];
        }
        while( j < n2){
            arr[k++] = right[j++];
        }

    }

    static void margeSort(int[] arr, int l, int h){
        if(l >= h) return;
        int mid = (l+h)/2;
        margeSort(arr, l, mid);
        margeSort(arr, mid+1, h);
        marge_both(arr, l, mid, h);
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range  = ");
        int n = sc.nextInt();
        System.out.println("Enter Array the element = ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int l = 0;
        int h = n-1;

        margeSort(arr,l,h);

        display(arr);
    }
}
