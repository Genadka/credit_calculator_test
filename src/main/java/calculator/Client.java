package calculator;

abstract class Client {

    private double loanAmount; // сумма кредита
    private double monthlyPayment; // ежемесечный платеж
    private double interestRate; // процентная ставка

    public Client() {};

    public Client(double loanAmount, double monthlyPayment, double interestRate) {
        this.loanAmount = loanAmount;
        this.monthlyPayment = monthlyPayment;
        this.interestRate = interestRate;
    }

   abstract double overpayment();

    abstract double totalAmount();

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
