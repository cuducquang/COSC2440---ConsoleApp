public class Bank {
    private String bankName; private String accountHolder; private String accountNumber;
    //constructor
    public Bank(){
        this.bankName = "default";
        this.accountHolder = "default";
        this.accountNumber = "default";
    }

    public Bank(String bankName, String accountHolder, String accountNumber){
        this.bankName = bankName;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String getBankName(){return bankName;}

    public void setBankName(String bankName) {this.bankName = bankName;}
    public String getAccountHolder(){return accountHolder;}

    public void setAccountHolder(String accountHolder) {this.accountHolder = accountHolder;}

    public String getAccountNumber() {return accountNumber;}

    public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}
}
