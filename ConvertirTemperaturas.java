import java.util.Scanner;

class ConvertirTemperaturas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double temperatura_Fahrenheit = 0.0;
        System.out.println("Ingrese temperatura en celsius:");
        Double temperatura_Celsius = in.nextDouble();
        temperatura_Fahrenheit = (temperatura_Celsius * 1.8) + 32;
        System.out.println(
            "La temperatu4ra en fahrenheit es: " + temperatura_Fahrenheit
        );
        int fahrenheit_entero = temperatura_Fahrenheit.intValue();
        System.out.println("La temperatura fahrenheit en entero es: " + fahrenheit_entero);
        in.close();
    }
}
