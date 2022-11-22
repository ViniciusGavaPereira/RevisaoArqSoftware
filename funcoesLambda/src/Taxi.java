//IMPORTÂNTE: só pode haver um método abstrato dentro de interfaces lambda
public interface Taxi{
    //Pode ser void, double e etc
    void reservar(String carro);
    //Mas aceita métodos default
    default void devolverCarro(){
        System.out.println("Carro devolvido");
    }
    default void alugarCarro(String carro){
        System.out.println(carro + " alugado");
    }
 }