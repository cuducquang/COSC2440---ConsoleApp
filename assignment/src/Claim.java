import java.util.Date;
import java.util.List;

public class Claim {
    private String claimID; private Date claimDate;
    private String insuredPerson; private String cardNumber;
    private Date examDate; private List<String> documents;
    private double claimAmount; private String status;
    private Bank receiverBankingInfo;

    public Claim() {

    }
}
