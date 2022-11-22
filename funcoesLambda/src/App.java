public class App{
    public static void main(String[] args) throws Exception {    
        Taxi taxi = (carro) -> {
            System.out.println( carro + " reservado");
        };
        taxi.reservar("Pálio");
    }
}


