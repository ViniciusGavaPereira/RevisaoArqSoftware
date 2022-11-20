package pattern;

public class NaveInimiga implements Observer{
    private String nome;

    public NaveInimiga(String nome, Subject navej) {
		this.nome = nome;
		navej.adicionarObserver(this);
	}
    @Override
	public void update(Acoes acao) {
		System.out.println(nome + " - ação: " + acao);
	}

	@Override
	public String toString() {
		return  nome;
	}
}
