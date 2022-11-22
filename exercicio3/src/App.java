

import pattern.Temperatura;
import pattern.GerenciadroClima;
import pattern.Cliente;
import pattern.Observer;
import pattern.Subject;

public class App {
    public static void main(String[] args) throws Exception {
       
        // O sistema está em singleton
        Subject atualizadorClima = new GerenciadroClima().getInstance();
        Subject atualizadorClima2 = new GerenciadroClima().getInstance();


        Observer cliente1 = new Cliente("Jorge",atualizadorClima); 
        Observer cliente2 = new Cliente("Matheus",atualizadorClima); 

        atualizadorClima.adicionarTemperatura(Temperatura.CALOR);
        atualizadorClima.adicionarTemperatura(Temperatura.MUITOFRIO);



        System.out.println("Clima 1: " + atualizadorClima);
        System.out.println("Clima 2: " + atualizadorClima2);

    }
}
