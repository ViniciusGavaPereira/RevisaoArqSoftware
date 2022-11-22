package pattern;

public interface Subject {
    public void adicionarObserver(Observer observer);
    public void adicionarTemperatura(Temperatura temperatura);
    public void notificar();

}
