package oop_calc;

public class Loan {
    private double loanAmount;
    private double monthlyPayment;
    private double interestRate;

    public Loan(double loanAmount, double monthlyPayment, double interestRate) {
        this.loanAmount = loanAmount;
        this.monthlyPayment = monthlyPayment;
        this.interestRate = interestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

