import java.util.ArrayList;
import java.util.List;

public class Dependent extends Customer {
    private PolicyHolder policyHolder;
    public Dependent(){
        super();
        this.policyHolder = new PolicyHolder();
    }
    public Dependent(String cusID, String cusName, InsuranceCard insuranceCard, List<Claim> claims, PolicyHolder policyHolder){
        super();
        this.policyHolder = policyHolder;
    }
}
