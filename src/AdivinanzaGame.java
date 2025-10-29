package src;

import java.util.Random;
import java.util.Scanner;

class AdivinanzaGame {

    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);
        // System.out.println(randomNumber);
        Scanner in = new Scanner(System.in);
        int attemps = 0;
        int userNumber = 0;

        do {
            System.out.println("Ingrese un numero");
            userNumber = in.nextInt();
            if (userNumber == randomNumber) {
                break;
            }
            attemps++;

            if (userNumber > randomNumber) {
                System.out.println("El numero es menor");
            } else {
                System.out.println("El numero es mayor");
            }

        } while (attemps < 5);

        if (userNumber == randomNumber) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
            System.out.println("El numero era: "+ randomNumber);
        }
    }
}
