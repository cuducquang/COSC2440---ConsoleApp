/**
 * @author <Cu Duc Quang - s4021255>
 */

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class InsuranceSystem {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dataString = "2023-11-23";
        Date expirationDay = null;

        try {
            expirationDay = format.parse(dataString);
        } catch (ParseException e){
            e.printStackTrace();
        }
        InsuranceCard card = new InsuranceCard("s4021244", "Cu Duc Quang", "Cu Xuan Thang", expirationDay);
        //System.out.println(card);

    }
}