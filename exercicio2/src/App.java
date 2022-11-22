import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List listaFuncionarios = new ArrayList<Funcionario>();

        ComparadorFuncionario comparadorFuncionario = new ComparadorFuncionario();

       


        listaFuncionarios.add(new Funcionario(6,"Fernando", "Gerente", 200.00));
        listaFuncionarios.add(new Funcionario(5,"Gabriel", "Gerente", 200.00));
        listaFuncionarios.add(new Funcionario(4,"Jorge", "Gerente", 200.00));
        listaFuncionarios.add(new Funcionario(3,"João", "Gerente", 200.00));
        listaFuncionarios.add(new Funcionario(2,"Pedro", "Gerente", 200.00));
        listaFuncionarios.add(new Funcionario(1,"Vinicius", "Gerente", 200.00));

        System.out.println("Lista antes de ajustar: " + listaFuncionarios + "\n");

        Collections.sort(listaFuncionarios,comparadorFuncionario);

        System.out.println("Lista depois de ajustar: " + listaFuncionarios);

        Funcionario funcionarioBuscado = new Funcionario(6,null,null,null);

        int index = Collections.binarySearch(listaFuncionarios, funcionarioBuscado,comparadorFuncionario);

        System.out.println("Index" + index);
    }
}
