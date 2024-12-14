import java.util.Scanner;

public class IT24104208Lab4Q3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is positive, negative, or zero using ternary operator
        String result = (number > 0) ? "Positive" :
                        (number < 0) ? "Negative" : "Zero";

        System.out.println("The number is " + result);

        scanner.close();
    }
}
