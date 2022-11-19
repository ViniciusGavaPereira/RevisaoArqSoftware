package facade;

import entidades.Address;
import entidades.Cliente;
import entidades.Database;
import entidades.Product;

public class Facade {

    public void generateReport(){
        Database.inserir();


        Address address = new Address();
        System.out.println(address.pesquisarAddress(0));
        System.out.println(address.pesquisarAddress(1));
        
        Product product = new Product();
        System.out.println(product.pesquisarProdutoId(0));
        System.out.println(product.pesquisarProdutoId(1));



        Cliente cliente = new Cliente();
        System.out.println(cliente.pesquisarCliente(0));
        System.out.println(cliente.pesquisarCliente(1));

    }

    
}
