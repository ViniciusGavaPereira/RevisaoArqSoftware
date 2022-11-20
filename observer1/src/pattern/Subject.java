package pattern;

public interface Subject {
        public void adicionarObserver(Observer observer);
        public void removerObserver(Observer observer);
        public void adicionarAcoes(Acoes acao);
        public void notificar();

}
