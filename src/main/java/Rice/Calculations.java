package Rice;


public class Calculations {

    public static void Calcs(int inputTwo, double inputThree,
                               int inputFour){

        double total;
        double dist;

        if(inputFour > 0 && inputFour <= 5){
            dist = 2;
            total = ((float) inputTwo * inputThree) + dist;
            System.out.println(Math.rint(total));

        }
        if(inputFour > 6 && inputFour <= 15){
            dist = 5;
            total = ((float) inputTwo * inputThree) + dist;
            System.out.println(Math.rint(total));
        }
        if(inputFour > 16 && inputFour <= 25){
            dist = 10;
            total = ((float) inputTwo * inputThree) + dist;
            System.out.println(Math.rint(total));
        }
        if(inputFour > 25 && inputFour <= 50){
            dist = 15;
            total = ((float) inputTwo * inputThree) + dist;
            System.out.println(Math.rint(total));
        }
        if(inputFour > 50){
            dist = 20;
            total = ((float) inputTwo * inputThree) + dist;
            System.out.println(Math.rint(total));
        }

    }
}
