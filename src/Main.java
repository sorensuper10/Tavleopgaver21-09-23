import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        // Lav en funktion der får 2 integers og som retunere gennemsnittet af de to tal
        // Test funktionen i et main

        // Her indtaster jeg ikke tallene selv
        System.out.println(gennemsnit(5,5));

        // Her indtaster jeg tallene selv
        /*Scanner input = new Scanner(System.in);
        System.out.println("Indtast 2 tal");
        int x = input.nextInt();
        int y = input.nextInt();*/
        //System.out.println("Gennemsnittet er " + gennemsnit(x,y));

        // Her får jeg 2 komma tal
        //System.out.printf("Gennemsnittet af %d og %d er %.2f",x,y, gennemsnit1(x,y));
    }

    public static double gennemsnit(double i, double n) {
        double gennemsnit = (i + n) / 2;
        return gennemsnit;
    }

    // En anden måde at lave opgaven på
    public static double gennemsnit1(int x, int y) {
        return (x + y) / 2.0;
    }
}