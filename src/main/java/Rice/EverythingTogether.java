package Rice;

import static Rice.AsciiElements.AsciiTable;
import static Rice.AsciiElements.AsciiTwo;

import static Rice.Calculations.Calcs;

public class EverythingTogether {


    public static void Everything(String inputOne, int inputTwo, double inputThree,
                                  int inputFour){

        System.out.print("Product");
        AsciiTwo(2);
        System.out.print("Qty");
        AsciiTwo(1);
        System.out.print("Price");
        AsciiTwo(2);
        System.out.print("Miles");
        AsciiTwo(1);
        System.out.println("Total");

        AsciiTable();
        AsciiTwo(1);
        AsciiTable();
        AsciiTwo(2);
        AsciiTable();
        AsciiTwo(2);
        AsciiTable();
        AsciiTwo(1);
        AsciiTable();
        System.out.println("");

        System.out.print(inputOne);// milk
        AsciiTwo(-1);//Qty
        System.out.print(inputTwo);
        AsciiTwo(0);//price
        System.out.print("$" + inputThree);
        AsciiTwo(0);//miles
        System.out.print(inputFour);
        AsciiTwo(-1);// total
        System.out.print("$");
        Calcs(inputTwo, inputThree, inputFour);

    }

    public static void main(String[] args) {

    }
}


