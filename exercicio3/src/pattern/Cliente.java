package pattern;

public class Cliente implements Observer {
    String nome;



    
    public Cliente(String nome, Subject clima) {
        this.nome = nome;
        clima.adicionarObserver(this);
    }

    

    @Override
    public void update(Temperatura temperatura) {
        System.out.println(this.nome + " a temperatura atual é " + temperatura);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    
}
