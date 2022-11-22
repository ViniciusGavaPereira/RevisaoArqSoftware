import java.util.Comparator;

public class ComparadorFuncionario implements Comparator<Funcionario> {
    public int compare(Funcionario funcionario1, Funcionario funcionario2){
        return funcionario1.getNome().compareTo(funcionario2.getNome());
    }
}
