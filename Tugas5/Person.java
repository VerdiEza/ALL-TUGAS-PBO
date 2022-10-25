
package Tugas5;


public class Person {
    private String Name;
    private String Address;

    public Person(String Name, String Address) {
        this.Name = Name;
        this.Address = Address;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    public String toString(){
        return 
        "Name: " + getName()+
        "\nAddress: " + getAddress();
    }
      
}