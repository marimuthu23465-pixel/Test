import java.util.Scanner;

public class DailyExpenseTracker
{

    static double[] expenses = new double[100]; 
    static int count = 0; // number of expenses added

    // Add Expense
    public static void addExpense(double amount) {
        expenses[count] = amount;
        count++;
        System.out.println("Expense added successfully!");
    }

    // View All Expenses
    public static void viewExpenses() {
        if (count == 0) {
            System.out.println("No expenses added yet.");
            return;
        }

        System.out.println("Expenses List:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + expenses[i]);
        }
    }

    // Calculate Total Expense
    public static void totalExpense() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += expenses[i];
        }
        System.out.println("Total Expense = " + total);
    }

    // Find Highest Expense
    public static void highestExpense() {
        if (count == 0) {
            System.out.println("No expenses added yet.");
            return;
        }

        double max = expenses[0];
        for (int i = 1; i < count; i++) {
            if (expenses[i] > max) {
                max = expenses[i];
            }
        }
        System.out.println("Highest Expense = " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Daily Expense Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Calculate Total Expense");
            System.out.println("4. Find Highest Expense");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter expense amount: ");
                    double amount = sc.nextDouble();
                    addExpense(amount);
                    break;

                case 2:
                    viewExpenses();
                    break;

                case 3:
                    totalExpense();
                    break;

                case 4:
                    highestExpense();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
