package entidades;

public class Address {
    
    private Integer id;
    private String street;
    private Integer number;



    public Address pesquisarAddress(int id) {
        for (Address a : Database.adrresses) {
            if (a.id.equals(id)) {
                return a;
            }
        }
        return null;
    }



    public Address() {
    }
   
    
    public Address(Integer id, String street, Integer number) {
        this.id = id;
        this.street = street;
        this.number = number;
    }




    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "Address [street=" + street + ", number=" + number + "]";
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    
}
