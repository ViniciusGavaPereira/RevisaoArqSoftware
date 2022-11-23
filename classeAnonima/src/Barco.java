public class Barco {
    
    String nome = "Barco";

    public Barco() {
    }

    
    public Barco(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }





    //Exemplo de classe interna
    public class BarcoInterna{
        public void imprimirTexto(){

            nome = "Barco 3";

            System.out.println("Nome interno: " + nome);

        } 

    }

    
}
