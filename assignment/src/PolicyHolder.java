/**
 * @author <Cu Duc Quang - s4021255>
 */

import java.util.ArrayList;
import java.util.List;

public class PolicyHolder extends Customer{
    List<Dependent> dependents;
    public PolicyHolder(){
        super();
        this.dependents = new ArrayList<>();
    }
    public PolicyHolder(String cusID, String cusName, InsuranceCard insuranceCard, List<Claim> claims, List<Dependent> dependents){
        super();
        this.dependents = dependents;
    }
}
