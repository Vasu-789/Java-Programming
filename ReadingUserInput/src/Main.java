import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Year Of Birth: ");

        boolean hasNextInt = input.hasNextInt();
        if(hasNextInt) {
            int yearOfBirth = input.nextInt();
            input.nextLine(); // Handle Next Line "Enter Key"

            System.out.println("Enter Your Name: ");
            String name = input.nextLine();
            int age = 2022 - yearOfBirth;

            if(age >= 0 && age <= 100) {
                System.out.println("Your Name Is " + name + ", And Your Are " + age + " Year Old.");
            } else {
                System.out.println("Invalid Year Of Birth");
            }
        } else {
            System.out.println("Unable To Parse Year Of Birth.");
        }

        input.close();
    }
}