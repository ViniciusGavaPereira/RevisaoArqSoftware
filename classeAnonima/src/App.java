import java.util.Comparator;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {

        
        Animal animal = new Animal(){

            @Override
            public void andar(){
                System.out.println("Andar nas sombras");

            }
        };

        Animal animal2 = new Animal();
        animal.andar();
        animal2.andar();

    }
}
