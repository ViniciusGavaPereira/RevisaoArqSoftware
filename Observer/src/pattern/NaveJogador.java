package pattern;

import java.util.ArrayList;
import java.util.List;

/*
 *  Professor Gerson Risso
 */
public class NaveJogador implements Subject {

	private List<Acoes> listaAcoes;
	private List<Observer> listaObservadores;
	private String nome;

	public NaveJogador(String nome) {
		this.nome = nome;
		listaAcoes = new ArrayList<>();
		listaObservadores = new ArrayList<>();
	}

	@Override
	public void adicionarObserver(Observer observer) {
		listaObservadores.add(observer);
	}

	@Override
	public void adicionarAcoes(Acoes acao) {
		listaAcoes.add(acao);
		notificar();
	}

	@Override
	public void notificar() {
		for (Observer obs : listaObservadores) {
			obs.update(listaAcoes.get(listaAcoes.size() - 1));
		}
	}

}
