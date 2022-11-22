//IMPORT�NTE: s� pode haver um m�todo abstrato dentro de interfaces lambda
public interface Taxi{
    //Pode ser void, double e etc
    void reservar(String carro);
    //Mas aceita m�todos default
    default void devolverCarro(){
        System.out.println("Carro devolvido");
    }
    default void alugarCarro(String carro){
        System.out.println(carro + " alugado");
    }
 }