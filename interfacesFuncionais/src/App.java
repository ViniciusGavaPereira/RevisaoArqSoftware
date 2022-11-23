public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente("Gabriel",true,"123");

        cliente.autenticarSenha("123");
    }
}
