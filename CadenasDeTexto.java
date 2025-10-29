class CadenasDeTexto {

    public static void main(String[] args) {
        String password = "12345";
        if (password.equals("12345")) {
            System.out.println("Acceso autorizado");
        } else {
            System.out.println("Contraseña incorrecta");
        }

        String nombre = "Maria";
        int edad = 30;
        double valor = 55.999;
        System.out.println(
            String.format(
                "Mi nombre es %s, tengo %d años y hoy gaste %.2f dolares",
                nombre,
                edad,
                valor
            )
        );
    }
}
