import java.util.Scanner;

class ExpenceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int expences[] = new int[10];  // Array
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- STUDENT MARKS MENU ---");
            System.out.println("1. Add Expences");
            System.out.println("2. View Expences");
            System.out.println("3. Calculate Total Expenses");
            System.out.println("4. Find Highest Expenses");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    if(count < expences.length) {
                        System.out.print("Enter Expences Amount : ");
                        expences[count] = sc.nextInt();
                        count++;
                        System.out.println("Mark Added!");
                    } else {
                        System.out.println("Storage Full!");
                    }
                    break;

                case 2:
                    if(count == 0) {
                        System.out.println("No Marks Added!");
                    } else {
                        System.out.println("Expences List:");
                        for(int i = 0; i < count; i++) {
                            System.out.println(expences[i]);
                        }
                    }
                    break;

                case 3:
                    int total = 0;
                    for(int i = 0; i < count; i++) {
                        total += expences[i];
                    }
                    System.out.println("Total Marks = " + total);
                    break;

                case 4:
                    if(count == 0) {
                        System.out.println("No Expences Available!");
                    } else {
                        int max = expences[0];
                        for(int i = 1; i < count; i++) {
                            if(expences[i] > max) {
                                max = expences[i];
                            }
                        }
                        System.out.println("highest Expences = " + max);
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 5);

        sc.close();
    }
}