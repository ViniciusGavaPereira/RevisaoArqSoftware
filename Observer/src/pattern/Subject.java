 

package pattern;

 
/*
 *  Professor Gerson Risso
 *
 */
public interface Subject {
  public void adicionarObserver(Observer observer);
  public void adicionarAcoes(Acoes acao);
  public void notificar();
}
