import java.util.Scanner;

class StudentMark
{
    Scanner sc = new Scanner(System.in);

    int[] marks = new int[5];
    int total = 0;
    double percentage = 0;

    void inputMarks()
    {
        System.out.println("Enter 5 Subject Marks:");
        for (int i = 0; i < 5; i++)
        {
            marks[i] = sc.nextInt();
        }
    }

    void calculateTotal()
    {
        for (int i = 0; i < 5; i++)
        {
            total += marks[i];
        }
    }

    void calculatePercentage()
    {
        
        percentage = total / 5.0;
    }

    void displayTotal()
    {
        calculateTotal();
        System.out.println("Total = " + total);
    }

    void displayPercentage()
    {
        calculatePercentage();
        System.out.println("Percentage = " + percentage);
    }

    void displayResult()
    {
        calculatePercentage();

        if (percentage >= 40)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }

    void displayGrade()
    {
        calculatePercentage();

        if (percentage >= 75)
            System.out.println("Grade: A");
        else if (percentage >= 60)
            System.out.println("Grade: B");
        else if (percentage >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StudentMark sm = new StudentMark();
        sm.inputMarks();

        int choice;

        do
        {
            System.out.println("----- Student Sheet -----");
            System.out.println("1. Display Total");
            System.out.println("2. Display Percentage");
            System.out.println("3. Display Result");
            System.out.println("4. Display Grade");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    sm.displayTotal();
                    break;

                case 2:
                    sm.displayPercentage();
                    break;

                case 3:
                    sm.displayResult();
                    break;

                case 4:
                    sm.displayGrade();
                    break;

                case 5:
                    System.out.println("Exiting!...");
                    break;

                default:
                    System.out.println("Invalid choice!...");
            }

        } while (choice != 5);
    }
}