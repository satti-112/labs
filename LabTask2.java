public class LabTask2 {
    public static void main(String[] args) {
        // Input: Initialize array  
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Process: Call modify function  
        modify(arr);

        // Output: Print modified array  
        System.out.print("Modified array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Process: Multiply each element by 3  
    static void modify(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 3;
        }
    }
}  