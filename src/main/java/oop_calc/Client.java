package oop_calc;

public abstract class Client {
    private Loan loan;

    public Client(double loanAmount, double monthlyPayment, double interestRate) {
        this.loan = new Loan(loanAmount, monthlyPayment, interestRate);
    }

    public Loan getLoan() {
        return loan;
    }

    public abstract String getClientType();
}