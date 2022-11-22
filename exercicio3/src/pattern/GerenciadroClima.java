package pattern;

import java.util.ArrayList;

public class GerenciadroClima implements Subject{
    private ArrayList<Temperatura> listaAcoes = new ArrayList<Temperatura>();
        private ArrayList<Observer> listaObservadores = new ArrayList<Observer>();
  

        private static GerenciadroClima gerenciadroClima;

        public static GerenciadroClima getInstance() {
            if (gerenciadroClima == null) {
                gerenciadroClima = new GerenciadroClima();
            }
            return gerenciadroClima;
        }
    
        public GerenciadroClima() {
        }

        

        @Override
        public void adicionarObserver(Observer observer) {
            listaObservadores.add(observer);
            
        }

        @Override
        public void adicionarTemperatura(Temperatura temperatura) {
            System.out.println("Temperatura atual: " + temperatura );
            listaAcoes.add(temperatura);         
            notificar();   
            
        }

        @Override
        public void notificar() {
            for (Observer obs : listaObservadores) {
                obs.update(listaAcoes.get(listaAcoes.size() - 1));
            }            
        }


        
}
