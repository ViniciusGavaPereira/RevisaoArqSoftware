import javax.security.auth.Subject;


import pattern.Temperatura;
import pattern.GerenciadroClima;
import pattern.Cliente;
import pattern.Observer;

public class App {
    public static void main(String[] args) throws Exception {
       
        GerenciadroClima atualizadorClima = new GerenciadroClima();
        

        Observer cliente1 = new Cliente("Jorge",atualizadorClima); 
        Observer cliente2 = new Cliente("Matheus",atualizadorClima); 

        atualizadorClima.adicionarTemperatura(Temperatura.CALOR);
        atualizadorClima.adicionarTemperatura(Temperatura.MUITOFRIO);



    }
}
