import java.util.Scanner;

public class IT22574268Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        String numbersList = "";

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.println("Enter number " + count + ":");
            int num = scanner.nextInt();
            numbersList += num + " ";
            count++;
        }

        System.out.println("The numbers you entered are:");
        System.out.println(numbersList.trim());

        scanner.close();
    }
}