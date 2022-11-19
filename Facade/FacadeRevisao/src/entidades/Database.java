package entidades;

import java.util.ArrayList;
import java.util.List;

public class Database {
    

    protected static List<Cliente> cliente = new ArrayList<>();
    protected static List<Address> adrresses = new ArrayList<>();
    protected static List<Product> products = new ArrayList<>();

    public static void inserir() {

        
        adrresses.add(new Address(0,"Estrada do Campo Limpo", 560));
        adrresses.add(new Address(1,"Rua Tomás Aquino de Macedo", 98));
    

        products.add(new Product(0,"Tv", "Appliance", 600.0));
        products.add(new Product(1,"Refrigerator", "Appliance", 400.0));


        cliente.add(new Cliente(0,"Gabriel", adrresses.get(0),products));
        cliente.add(new Cliente(1,"Vinicius", adrresses.get(1), products));

    }
}
