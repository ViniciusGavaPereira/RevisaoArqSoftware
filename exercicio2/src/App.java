import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List listaFuncionarios = new ArrayList<Funcionario>();

        listaFuncionarios.add(new Funcionario(4,"Fernando", "Gerente", 200.00));
        listaFuncionarios.add(new Funcionario(2,"Gabriel", "Gerente", 200.00));
        listaFuncionarios.add(new Funcionario(6,"Jorge", "Gerente", 200.00));
        listaFuncionarios.add(new Funcionario(1,"Jo�o", "Gerente", 200.00));
        listaFuncionarios.add(new Funcionario(3,"Pedro", "Gerente", 200.00));
        listaFuncionarios.add(new Funcionario(5,"Vinicius", "Gerente", 200.00));

      
        BuscaFuncionario buscaFuncionario = (nome) -> {
            
            Funcionario funcionarioBuscado = new Funcionario(null,nome,null,null);

            ComparadorFuncionario comparadorFuncionario = new ComparadorFuncionario();
           
            Collections.sort(listaFuncionarios,comparadorFuncionario);
          
            System.out.println(listaFuncionarios);
            int indexEncontrado = Collections.binarySearch(listaFuncionarios, funcionarioBuscado,comparadorFuncionario);

            System.out.println("Index encontrado: " + indexEncontrado);
        };

        buscaFuncionario.funcionariozinho("Pedro");
    }
}

