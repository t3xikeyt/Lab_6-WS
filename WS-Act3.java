import java.util.Scanner;

class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 5;
        int[] nums = new int[SIZE];
        int sum = 0;

        System.out.println("Enter " + SIZE + " numbers:");

        for (int i = 0; i < SIZE; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }

        double average = sum / (double) SIZE;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}
