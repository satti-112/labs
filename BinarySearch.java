import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        int[] array = {101,104, 107, 115, 123, 135};
        System.out.println("Enter the number to check");
         int search_number =sc.nextInt();
         int low=0;
         int high= array.length-1;
         boolean found = false;
         while (low<=high){
             int mid= low+high/2;
            if(array[mid]==search_number)
                System.out.println(mid);

             if(array[mid]<search_number){
                 low=low+high/2;

             }
             else {
                 high= low + high/2;
             }

         }
    }
}
