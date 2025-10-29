package src;

import java.util.Scanner;

class BankingApp {

    public static void consultarSaldo(double saldoDisponible) {
        System.out.println("El saldo actualizado es: " + saldoDisponible + "$");
        System.out.println("");
    }

    public static double retirarDinero(
        double saldoDisponible,
        double valorRetiro
    ) {
        if (valorRetiro > saldoDisponible) {
            System.out.println("Saldo insuficiente");
            return saldoDisponible;
        } else {
            saldoDisponible -= valorRetiro;
            System.out.println("Retiro exitoso");
        }
        System.out.println("");
        return saldoDisponible;
    }
    public static double depositarDinero(
        double saldoDisponible,
        double valorDeposito
    ) {
        if (valorDeposito <  0) {
            System.out.println("Valor invalido");
            return saldoDisponible;
        } else {
            saldoDisponible += valorDeposito;
            System.out.println("Deposito exitoso");
        }
        System.out.println("");
        return saldoDisponible;
    }

    public static void main(String[] args) {
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.99;
        Scanner in = new Scanner(System.in);

        int opc = 0;
        double valorRetiro = 0;
        double valorDeposito = 0;

        System.out.println("**************************************");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: " + saldoDisponible + "$");
        System.out.println("**************************************");

        do {
            System.out.println("** Escriba el numero de la opcion deseada **");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("9. Salir");
            System.out.println("**************************************");

            System.out.println("Seleccione una opción:");
            opc = in.nextInt();

            switch (opc) {
                case 1:
                    consultarSaldo(saldoDisponible);
                    break;
                case 2:
                    System.out.println("Cual es el valor que desea retirar?");
                    valorRetiro = in.nextDouble();
                    saldoDisponible = retirarDinero( saldoDisponible,valorRetiro);
                    break;
                case 3:
                    System.out.println("Cual es el valor que desea depositar?");
                    valorDeposito = in.nextDouble();
                    saldoDisponible = depositarDinero(saldoDisponible, valorDeposito);
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestro servicio");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opc != 9);
    }
}
