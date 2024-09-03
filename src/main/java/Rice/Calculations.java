package Rice;


public class Calculations {

    public static String Calcs(String inputOne, int inputTwo, double inputThree,
                               int inputFour){
        double final_;
        double dist = 0;
        final String x = "you are to recieve " + inputTwo + "Lbs of ";
        final String z = ", you will be charged a delivery fee of $";
        final String y = ", your total comes to $";
        final String p = "Error Plese try something else";
        if(inputFour > 0 && inputFour <= 5){
            dist = 2;
            final_ = ((double) inputTwo * inputThree) + dist;
            return x + inputOne + z + dist + y + final_;
        }
        if(inputFour > 6 && inputFour <= 15){
            dist = 5;
            final_ = ((double) inputTwo * inputThree) + dist;
            return x + inputOne + z + dist + y + final_;
        }
        if(inputFour > 16 && inputFour <= 25){
            dist = 10;
            final_ = ((double) inputTwo * inputThree) + dist;
            return x + inputOne + z + dist + y + final_;
        }
        if(inputFour > 25 && inputFour <= 50){
            dist = 15;
            final_ = ((double) inputTwo * inputThree) + dist;
            return x + inputOne + z + dist + y + final_;
        }
        if(inputFour > 50){
            dist = 20;
            final_ = ((double) inputTwo * inputThree) + dist;
            return x + inputOne + z + dist + y + final_;
        }
        return p;
    }
}
