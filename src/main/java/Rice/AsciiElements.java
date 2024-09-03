package Rice;

public class AsciiElements {

    public static void AsciiTable() {

        for (int i = 0; i <= 4; i++) {

            if (i < 4) {
                int i1 = 45;
                char ascii = (char) i1;

                System.out.print(ascii);
            }
            if (i == 4) {
                int i1 = 45;
                char ascii = (char) i1;
                i++;
                System.out.print(ascii);
            }
        }}
        public static void AsciiTwo(int x) {

        for(int i = x; i < 4; i++){
                int i1 = 32;
                char ascii = (char) i1;
            System.out.print(ascii);
            }
        }


    }

