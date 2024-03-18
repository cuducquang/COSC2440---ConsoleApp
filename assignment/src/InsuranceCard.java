/**
 * @author <Cu Duc Quang - s4021255>
 */

import java.util.Date;

public class InsuranceCard {
    private String cardNumber; private String cardHolder;
    private String policyOwner; private Date expirationDate;
    //default constructor
    public InsuranceCard() {
        this.cardNumber = "default";
        this.cardHolder = "default";
        this.policyOwner = "default";
        this.expirationDate = null;
    }
    //constructor
    public InsuranceCard(String cardNumber, String cardHolder, String policyOwner, Date expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.policyOwner = policyOwner;
        this.expirationDate = expirationDate;
    }
    //getter and setter methods
    public String getCardNumber() {return cardNumber;}
    public String getCardHolder() {return cardHolder;}
    public String getPolicyOwner() {return policyOwner;}
    public Date getExpirationDate() {return expirationDate;}

    public void setCardNumber(String cardNumber) throws IllegalAccessException {
        if (cardNumber.matches("^\\d{10}$")){
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Error: Invalid card number format. It should contain 10 digits !!");
            throw new IllegalAccessException("Invalid card number format");
        }
    }
    public void setCardHolder(String cardHolder) {this.cardHolder = cardHolder;}
    public void setPolicyOwner(String policyOwner) {this.policyOwner = policyOwner;}
    public void setExpirationDate(Date expirationDate) {this.expirationDate = expirationDate;}

    @Override
    public String toString() {
        return "InsuranceCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardHolder='" + cardHolder + '\'' +
                ", policyOwner='" + policyOwner + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
