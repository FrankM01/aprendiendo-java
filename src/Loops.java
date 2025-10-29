package src;
import java.util.Scanner;

class Loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darias a la pelicula");
            nota = in.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }

        System.out.println(
            "La media de evaluaciones es: " + mediaEvaluaciones / 3
        );
    }
}
