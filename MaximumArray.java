import java.util.Scanner;

class MaximumInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input values
        for(int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            arr[i] = sc.nextInt();
        }

        // Assume first element as maximum
        int max = arr[0];

        // Compare remaining elements
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum value = " + max);

        sc.close();
    }
}