class Decisiones{
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.5;
        String tipoDePlan = "Plus";

        if (fechaDeLanzamiento > 2022) {
            System.out.println("Peliculas mas populares");
        }else{
            System.out.println("Peliculas retro pero que aun vale la pena ver");
        }

        if (incluidoEnElPlan || tipoDePlan.equalsIgnoreCase("plus")){
            System.out.println("Disfrute de su pelicula");
        }else{
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
