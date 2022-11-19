
package jogonaves;

/*
*  Professor Gerson Risso
*/
import pattern.*;

public class JogoNaves {

	public static void main(String[] args) {
		Subject naveJogador = new NaveJogador("Nave jogador1");
		Observer naveInimiga1 = new NaveInimiga("Nave inimiga 1", naveJogador);
		naveJogador.adicionarAcoes(Acoes.AVANCAR);
		Observer naveInimiga2 = new NaveInimiga("Nave inimiga 2", naveJogador);
		naveJogador.adicionarAcoes(Acoes.MOVER_ESQUERDA);
		Observer naveInimiga3 = new NaveInimiga("Nave inimiga 3", naveJogador);
		naveJogador.adicionarAcoes(Acoes.MOVER_ESQUERDA);


	}

}
