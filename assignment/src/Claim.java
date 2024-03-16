import java.awt.dnd.DropTargetEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Claim {
    enum Status {New, Processing, Done};
    private String claimID; private Date claimDate;
    private String insuredPerson; private String cardNumber;
    private Date examDate; private List<String> documents;
    private double claimAmount; private Status status;
    private Bank receiverBankingInfo;

    public Claim() {
        this.claimID = "default";
        this.claimDate = null;
        this.insuredPerson = "default";
        this.cardNumber = "default";
        this.examDate = null;
        this.documents = new ArrayList<>();
        this.claimAmount = 0;
        this.status = Status.New;
        this.receiverBankingInfo = new Bank();
    }
    public Claim(String claimID, Date claimDate, String insuredPerson, String cardNumber, Date examDate, List<String> documents, double claimAmount, Status status,Bank receiverBankingInfo) {
        this.claimID = claimID;
        this.claimDate = claimDate;
        this.insuredPerson = insuredPerson;
        this.cardNumber = cardNumber;
        this.examDate = examDate;
        this.documents = documents;
        this.claimAmount = claimAmount;
        this.status = status;
        this.receiverBankingInfo = receiverBankingInfo;
    }

    public Status stringToStatus(String str){
        if (str == "New"){
            return status.New;
        } else if (str == "Processing") {
            return status.Processing;
        } else {
            return status.Done;
        }
    }
}
