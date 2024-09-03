package Rice;

import java.util.Scanner;

import static Rice.EverythingTogether.Everything;

public class milk {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What product would you like to have delivered?");
        String inputOne = scanner.nextLine();

        System.out.println("How many pounds would you like?");
        int inputTwo = scanner.nextInt();

        System.out.println("How much does 1 " + inputOne + " cost?");
        double inputThree = scanner.nextDouble();

        System.out.println("Finally how many miles away are you?");
        int inputFour = scanner.nextInt();

Everything(inputOne, inputTwo, inputThree, inputFour);



    }


}
