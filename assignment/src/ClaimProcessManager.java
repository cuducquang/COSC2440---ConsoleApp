/**
 * @author <Cu Duc Quang - s4021255>
 */

import java.util.List;

public interface ClaimProcessManager {
    public void add(Claim claim);
    public void update(Claim claim);
    public void delete(String claimID);
    public Claim getOne(String claimID);
    public List<Claim> getAll();
}
