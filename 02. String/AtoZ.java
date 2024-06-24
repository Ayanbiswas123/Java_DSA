import java.util.Arrays;
import java.util.Comparator;

public class AtoZ{
    public static void main(String [] args){
        String [] arr = new String[5];
        arr[0] = "Hello";
        arr[1] = "Welcome";
        arr[2] = "To";
        arr[3] = "My";
        arr[4] = "Java";
        for(String str : arr){
            System.out.print(str + " ");
        }

        System.out.println();
//-------------------------------------------------------------
        Arrays.sort(arr);

        for(String str : arr){
            System.out.print(str + " ");
        }
        System.out.println();
//-----------------------------------------------------------------------
        
        System.out.println("natural order");
        Arrays.sort(arr, Comparator.naturalOrder());
        for(String str : arr){
            System.out.print(str + " ");
        }
        System.out.println();
//------------------------------------------------------------------------
        System.out.println("decending lexicographic order");
        Arrays.sort(arr,Comparator.reverseOrder());
        for(String str : arr){
            System.out.print(str + " ");
        }
    }
}