package entidades;
public class Product {
    private Integer id;
    private String name;
    private String category;
    private Double price;
    
    
    public Product(){

    }

    

    public Product(Integer id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }



    public Product pesquisarProdutoId(int id) {
        for (Product p : Database.products) {
            if (p.id.equals(id)) {
                return p;
            }
        }
        return null;
    }


    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }




    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
    }



    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }

    
    
}
