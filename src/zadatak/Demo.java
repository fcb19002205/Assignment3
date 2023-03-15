package zadatak;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;

        while (number >= 0) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                switch (number % 7) {
                    case 0:
                        System.out.println("Sunday");
                        break;
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                }
                if (number == 0) {
                    continue;
                }
                if (number > 0 && number % 2 == 0) {
                    sum += number;
                }
            } else {
                System.out.println("Invalid input, please enter an integer!");
                scanner.next();
            }
        }
        System.out.println("The sum of entered even numbers is: " + sum);
    }
}
