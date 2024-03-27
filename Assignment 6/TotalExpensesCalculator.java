import java.util.Scanner;

public class TotalExpensesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for quantity and price per item
        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        // Calculating total expenses
        double totalExpenses = calculateTotalExpenses(quantity, pricePerItem);

        // Displaying the total expenses
        System.out.println("Total expenses: $" + totalExpenses);

        scanner.close();
    }

    public static double calculateTotalExpenses(int quantity, double pricePerItem) {
        double totalExpenses = quantity * pricePerItem;

        // Applying discounts based on quantity
        if (quantity > 50) {
            totalExpenses *= 0.90; // 10% discount
        } else if (quantity >= 25 && quantity <= 50) {
            totalExpenses *= 0.95; // 5% discount
        }

        return totalExpenses;
    }
}
