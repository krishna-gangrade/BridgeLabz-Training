package Day_12.HackerRank_based_codebase.CopyConstructor;

public class Address {

    String street;
    String city;
    int zipCode;

    public Address(String street, String city, int zipCode){
        this.street= street;
        this.city= city;
        this.zipCode= zipCode;
    }

    public Address(Address other){
        this.street= other.street;
        this.city= other.city;
        this.zipCode= other.zipCode;
    }
    
}
