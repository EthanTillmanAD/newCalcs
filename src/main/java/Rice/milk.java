package Rice;

import java.util.Scanner;

public class milk {
Calculations finalCalcs = new Calculations();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What product would you like to have delivered");
        String inputOne = scanner.nextLine();

        System.out.println("How many Lbs would you like");
        int inputTwo = scanner.nextInt();

        System.out.println("How much does 1Lb of " + inputOne + " cost");
        double inputThree = scanner.nextDouble();

        System.out.println("Finally how many miles away are you");
        int inputFour = scanner.nextInt();

        System.out.println(Calculations.Calcs(inputOne, inputTwo, inputThree, inputFour));

    }


}
