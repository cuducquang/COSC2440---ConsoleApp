public class Customer {
    private String cus_ID; private String cus_name;
    //constructor
    public Customer (){
        this.cus_ID = "Default";
        this.cus_name = "Default";
    }
    public Customer(String cus_ID, String cus_name){
        this.cus_ID = cus_ID;
        this.cus_name = cus_name;
    }
    public String getCus_ID() {return cus_ID;}

    public void setCus_ID(String cus_ID) {this.cus_ID = cus_ID;}
    public String getCus_name() {return cus_name;}

    public void setCus_name(String cus_name) {this.cus_name = cus_name;}
}
