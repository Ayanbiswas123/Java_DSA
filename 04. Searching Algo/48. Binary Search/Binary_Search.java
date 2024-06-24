import java.util.Scanner;

public class Binary_Search {

    static int binarySearch(int[] arr, int num){

        int l = 0;
        int r = arr.length - 1;
        int mid = (r+l)/2;
        while(l <= r && arr[mid] != num){

            if(num < mid){
                r = mid-1;
            }else{

                l = mid+1;
            }
            mid = (r+l)/2;
        }
        if(num == mid){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length = ");
        int n = sc.nextInt();
        System.out.println("Enter the Element of Array = ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Number = ");
        int num = sc.nextInt();

        int i = binarySearch(arr,num);

        if(i == 1){
            System.out.println("The number Exist in the array " + num);
        }else{
            System.out.println("The number Not Exixt in the array " + num);
        }

    }
}