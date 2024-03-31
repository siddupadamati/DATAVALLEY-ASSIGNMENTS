import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of days late
        System.out.print("Enter the number of days the member is late to return the book: ");
        int daysLate = scanner.nextInt();
        
        // Calculate fine based on the number of days late
        double fine = 0.0;
        if (daysLate >= 1 && daysLate <= 7) {
            fine = 0.50 * daysLate; // 50 paise fine for each late day
        } else if (daysLate >= 8 && daysLate <= 14) {
            fine = 1.00 * daysLate; // 1 rupee fine for each late day
        } else if (daysLate > 14 && daysLate <= 21) {
            fine = 5.00; // 5 rupees fine for each late day beyond 14 days
        } else if (daysLate > 21) {
            System.out.println("Your membership is canceled as you returned the book after 21 days.");
            scanner.close();
            return;
        }
        
        // Display the fine
        System.out.println("Fine for returning the book " + daysLate + " days late: Rs. " + fine);
        
        scanner.close();
    }
}
