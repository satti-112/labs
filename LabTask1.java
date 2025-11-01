public class LabTask1 {
    public static void main(String[] args) {
        // Lab Task 1: Student Cafeteria Ratings
        int[] responses = {
                5, 7, 8, 3, 4, 6, 9, 2, 1, 10,  // Sample 40 responses (replace with actual data)
                7, 7, 5, 4, 6, 8, 2, 3, 9, 10,
                6, 5, 4, 7, 8, 1, 2, 3, 10, 9,
                5, 6, 7, 8, 9, 10, 4, 3, 2, 1
        };

        int[] frequency = new int[10]; // Index 0 = Rating 1, Index 9 = Rating 10

        // Calculate frequency of each rating
        for (int response : responses) {
            if (response >= 1 && response <= 10) {
                frequency[response - 1]++; // Map rating 1 to index 0, etc.
            } else {
                System.out.println("Invalid rating ignored: " + response);
            }
        }

        // Display results
        System.out.println("Cafeteria Food Rating Summary");
        System.out.println("Rating\tFrequency");
        for (int i = 0; i < frequency.length; i++) {
            System.out.printf("%d\t%d%n", (i + 1), frequency[i]);
        }
    }
}