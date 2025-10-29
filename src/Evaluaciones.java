package src;

import java.util.Scanner;

class Evaluaciones{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        int totalEvaluaciones = 0;

        while (nota != -1) {
            System.out.println("Escribe la nota que le darias a la pelicula");
            nota = in.nextDouble();
            if (nota != -1) {
                mediaEvaluaciones += nota;
                totalEvaluaciones++;
            }
        }
        System.out.println(
            "La media de evaluaciones es: " +
                mediaEvaluaciones / totalEvaluaciones
        );
    }
}
