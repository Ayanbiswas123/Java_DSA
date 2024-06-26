import java.util.Scanner;

public class O2_arraySortUsingLinearSearch {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter array length = ");
        int lengthOfArray = sc.nextInt();
        int array[] = new int[lengthOfArray];

        System.out.println("Enter array elements");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < array.length - 1; i++){

            int smallElementIndex = i;
            for(int j = i+1; j < array.length; j++){
                if(array[smallElementIndex] > array[j]){
                    smallElementIndex = j;
                }
            }

            if(i != smallElementIndex){
                int temp = array[i];
                array[i] = array[smallElementIndex];
                array[smallElementIndex] = temp;
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
