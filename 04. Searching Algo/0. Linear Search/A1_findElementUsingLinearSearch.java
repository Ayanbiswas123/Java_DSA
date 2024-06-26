import java.util.Scanner;

public class A1_findElementUsingLinearSearch {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter array length = ");
        int lengthOfArray = sc.nextInt();
        int array[] = new int[lengthOfArray];

        System.out.println("Enter array elements");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter finding elements");
        int findinglement = sc.nextInt();

        for(int i = 0; i < array.length; i++){
            if(array[i] == findinglement){
                System.out.println("Element Exint in the Array " + findinglement);
                break;
            }
        }

    }
}
