import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String cusID; private String cusName;
    private InsuranceCard insuranceCard; private List<Claim> claims;
    //default constructor
    public Customer (){
        this.cusID = "Default";
        this.cusName = "Default";
        insuranceCard = new InsuranceCard();
        this.claims = new ArrayList<>();
    }
    //constructor
    public Customer(String cusID, String cusName, InsuranceCard insuranceCard, List<Claim> claims) {
        this.cusID = cusID;
        this.cusName = cusName;
        this.insuranceCard = new InsuranceCard();
        this.claims = new ArrayList<>();
    }
    //getter and setter methods
    public void setCusID(String cusID) throws IllegalAccessException {
        if (cusID.matches("c-\\d{7}$")){
            this.cusID = cusID;
        } else {
            System.out.println("Error: Invalid Customer ID. It has to be in the format c-numbers and contain 7 digits !!");
            throw new IllegalAccessException("Invalid customer ID format");
        }
    }
    public String getCusID() {return cusID;}
    public String getCusName() {return cusName;}
    public List<Claim> getClaims() {return claims;}
    public void setClaims(List<Claim> claims) {this.claims = claims;}
    @Override
    public String toString() {
        return "Customer{" +
                "Customer ID='" + cusID + '\'' +
                ", Customer name='" + cusName + '\'' +
                ", Insurance card='" + insuranceCard + '\'' +
                ", A list of claims=" + claims +
                '}';
    }
}
