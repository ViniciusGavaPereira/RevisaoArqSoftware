import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {


        

      
        BuscaFuncionario buscaFuncionario = (index) -> {
            
            List listaFuncionarios = new ArrayList<Funcionario>();

            Funcionario funcionarioBuscado = new Funcionario(index,null,null,null);

            listaFuncionarios.add(new Funcionario(4,"Fernando", "Gerente", 200.00));
            listaFuncionarios.add(new Funcionario(2,"Gabriel", "Gerente", 200.00));
            listaFuncionarios.add(new Funcionario(6,"Jorge", "Gerente", 200.00));
            listaFuncionarios.add(new Funcionario(1,"João", "Gerente", 200.00));
            listaFuncionarios.add(new Funcionario(3,"Pedro", "Gerente", 200.00));
            listaFuncionarios.add(new Funcionario(5,"Vinicius", "Gerente", 200.00));


            ComparadorFuncionario comparadorFuncionario = new ComparadorFuncionario();


           
            Collections.sort(listaFuncionarios,comparadorFuncionario);
          
            System.out.println(listaFuncionarios);
            int indexEncontrado = Collections.binarySearch(listaFuncionarios, funcionarioBuscado,comparadorFuncionario);


            System.out.println("Index encontrado: " + indexEncontrado);
        };

        buscaFuncionario.funcionariozinho(1);
    }
}

