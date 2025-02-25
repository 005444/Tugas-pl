public class DataCsv {
    public String loanId;
    public String gender;
    public String meried;
    public String dependents;
    public String education;
    public String selfEmployed;
    public String applicantIncome;
    public String coapplicantIncome;
    public String loanAmount;
    public String loanAmountTerm;
    public String creditHistory;
    public String provertyArea;
    public String loanStatus;
  
    public void print(){
        System.out.println( "Loan Id:" + loanId + " Gender:" + gender + " Meried:" + meried +
        " Dependents:"+ dependents +" Education:"+ education + " ApplicantIncome:" + applicantIncome );
}
}