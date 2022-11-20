
import pattern.Acoes;
import pattern.NaveInimiga;
import pattern.NaveJogador;
import pattern.Observer;
import pattern.Subject;

public class App {
    public static void main(String[] args){
		Subject naveJogador = NaveJogador.getInstance("Vinicius");      
        Observer NaveInimiga1 = new NaveInimiga("Nave inimiga 1", naveJogador);
        Observer NaveInimiga2 = new NaveInimiga("Nave inimiga 1", naveJogador);
		Subject naveJogador2 = NaveJogador.getInstance("Vinicius");      

        naveJogador.adicionarAcoes(Acoes.AVANCAR);
        naveJogador.removerObserver(NaveInimiga2);
        naveJogador.adicionarAcoes(Acoes.ESQUERDA);
        

        //Prova de que as naves são as mesmas
        System.out.println("HashCode das naves");
        System.out.println("HashCode da nave 1: " + naveJogador);
        System.out.println("HashCode da nave 2: " +naveJogador2);

    }
}
