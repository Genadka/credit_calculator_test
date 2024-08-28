package oop_calc;

public class BusinessClient extends Client {

    public BusinessClient(double loanAmount, double monthlyPayment, double interestRate) {
        super(loanAmount, monthlyPayment, interestRate);
    }

    @Override
    public String getClientType() {
        return "business";
    }
}