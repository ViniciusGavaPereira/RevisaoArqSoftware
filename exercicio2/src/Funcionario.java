public class Funcionario {
    private Integer id;
    private String nome;
    private String carago;
    private Double salario;
    
    public Funcionario() {
    }
   
    public Funcionario(Integer id, String nome, String carago, Double salario) {
        this.id = id;
        this.nome = nome;
        this.carago = carago;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCarago() {
        return carago;
    }
    public void setCarago(String carago) {
        this.carago = carago;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", carago=" + carago + ", salario=" + salario + "]";
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    

    
}
