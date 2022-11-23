

public class App {
    public static void main(String[] args) throws Exception {

        //Exemplo de classe anônima
        Animal animal = new Animal(){

            @Override
            public void andar(){
                System.out.println("Andar nas sombras");

            }
        };

        Animal animal2 = new Animal();
        

        Animal animal3 = new Animal(){
           
            public void andar(){
                System.out.println("Andar na montanha");

            }
        };

        animal.andar();
        animal2.andar();
        animal3.andar();



        //Exemplo de classe interna
        Barco barco = new Barco("Lancha");


       
        Barco.BarcoInterna barcoInterna = barco.new BarcoInterna();

        System.out.println("Nome externo: " + barco.getNome());
        barcoInterna.imprimirTexto();



    }
}
