import java.io.BufferedReader;
import java.io.FileReader;
import javax.xml.crypto.Data;

@SuppressWarnings("unused")
public class BacaCsv{
    public static void main(String[] args) {

        String namaFile = "train.csv";
        DataCsv[] listFinance= new DataCsv[615];

        try(BufferedReader br = new BufferedReader(new FileReader(namaFile))) {
            
            String line = "";
            br.readLine(); // Skip first line
            int idx = 0;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                DataCsv finc = new  DataCsv();
                finc.loanId = data[0];
                finc.gender = data[1];
                finc.meried = data[2];
                finc.dependents = data[3];
                finc.education = data[4];
                finc.selfEmployed = data[5];
                finc.applicantIncome = data[6];
                finc.coapplicantIncome =  data[7];
                finc.loanAmount =  data[8];
                finc.loanAmountTerm = data[9];
                finc.creditHistory =  data[10];
                finc.provertyArea = data[11];
                finc.loanStatus = data[12];

                listFinance[idx] = finc;

                finc.print();

                idx++;
            }


System.out.println("==================================>");
            br.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(">>>"  + e.getMessage());
        }

        for (DataCsv finc : listFinance ) {

            if ( finc != null && finc.applicantIncome.equalsIgnoreCase("5000") ) {
                finc.print();
            }
        }
    

        System.out.println("==================================>");

    }
}