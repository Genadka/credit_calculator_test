package oop_calc;

public class HumanClient extends Client {

    public HumanClient(double loanAmount, double monthlyPayment, double interestRate) {
        super(loanAmount, monthlyPayment, interestRate);
    }

    @Override
    public String getClientType() {
        return "human";
    }
}