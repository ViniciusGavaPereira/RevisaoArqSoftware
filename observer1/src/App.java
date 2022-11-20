
import pattern.Acoes;
import pattern.NaveInimiga;
import pattern.NaveJogador;
import pattern.Observer;
import pattern.Subject;

public class App {
    public static void main(String[] args){
        Subject NaveJogador = new NaveJogador("Nave Vinicius");
        Observer NaveInimiga1 = new NaveInimiga("Nave inimiga 1", NaveJogador);
        Observer NaveInimiga2 = new NaveInimiga("Nave inimiga 1", NaveJogador);

        NaveJogador.adicionarAcoes(Acoes.AVANCAR);
        NaveJogador.removerObserver(NaveInimiga2);
        NaveJogador.adicionarAcoes(Acoes.ESQUERDA);
    }
}
