import java.util.Scanner;

class Count40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int count = 0;

        // Input values
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // Count 40
        for(int i = 0; i < 5; i++) {
            if(arr[i] == 40) {
                count++;
            }
        }

        System.out.println("Count of 40 = " + count);

        sc.close();
    }
}