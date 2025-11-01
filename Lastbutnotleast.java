//import java.util.Scanner;
//import java.io.*;
//
//public class Lastbutnotleast {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//        System.out.println("ENter the year");
//        int year = sc.nextInt();
//        System.out.println("Enter the name of boy/gril");
//        String name = sc.nextLine();
//
//        System.out.println("Enter the gender(m/f)");
//        String gender = sc.nextLine();
//        String fileName = "babynameranlkimg"+year+".text";
//        try (Scanner fileScanner = new Scanner(new File(fileName))) {
//            while (sc.hasNextLine()) {
//                String[] parts= sc.nextLine().split("\\s+");
//                int rank = Integer.parseInt(parts[0]);
//                String boyname = parts[1];
//                String girlname = parts[3];
//                if(gender.equalsIgnoreCase("M"));
//
//
//            }
//        } catch (FileNotFoundException e){
//            System.out.println("file is not found");
//
//        }
//
//    }
//}
