package pattern;

/*
 *  Professor Gerson Risso
 */
public class NaveInimiga implements Observer {
	private String nome;

	public NaveInimiga(String nome, Subject navej) {
		this.nome = nome;
		navej.adicionarObserver(this);
	}

	@Override
	public void update(Acoes acao) {
		System.out.println(nome + " - Ação: " + acao);
	}
}
