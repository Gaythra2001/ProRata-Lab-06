import java.util.Scanner;

public class IT22574268Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        String numbersList = "";

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.println("Enter number " + count + ":");
            int num = scanner.nextInt();
            sum += num;
            numbersList += num + " ";
            count++;
        }

        double average = (double) sum / 10;

        System.out.println("The numbers you entered are:");
        System.out.println(numbersList.trim());
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}