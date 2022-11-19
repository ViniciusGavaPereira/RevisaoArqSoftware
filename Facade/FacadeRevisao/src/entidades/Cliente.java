package entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Integer id;
    private String name;
    private Address address;
    private List<Product> products = new ArrayList<>();
    
    public Cliente() {
    }

    public Cliente(Integer id, String name, Address address, List<Product> products) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.products = products;
    }



    public Cliente pesquisarCliente(int id) {
        for (Cliente c : Database.cliente) {
            if (c.id.equals(id)) {
                return c;
            }
        }
        return null;
    }



    @Override
    public String toString() {
        return "Cliente [name=" + name + ", address=" + address + ", products=" + products + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    


}
