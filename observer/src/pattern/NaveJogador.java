package pattern;

import java.util.ArrayList;
import java.util.List;

public class NaveJogador implements Subject {
        private ArrayList<Acoes> listaAcoes = new ArrayList<Acoes>();
        private ArrayList<Observer> listaObservadores = new ArrayList<Observer>();
        private String nome;
        
        
        public NaveJogador() {
        }

        
        public NaveJogador(String nome) {
            this.nome = nome;
        }

       

        @Override
        public void removerObserver(Observer observer) {
           listaObservadores.remove(observer);

            System.out.println("Nave " + observer.toString() + " destruida");

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


    


        @Override
        public void adicionarObserver(Observer observer) {
            listaObservadores.add(observer);
            
        }

        

}
