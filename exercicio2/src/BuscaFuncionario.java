import java.util.Comparator;

public interface BuscaFuncionario {
    
    public class ComparadorFuncionario implements Comparator<Funcionario> {
        public int compare(Funcionario funcionario1, Funcionario funcionario2){
            return funcionario1.getId().compareTo(funcionario2.getId());
        }
    }
    
}
