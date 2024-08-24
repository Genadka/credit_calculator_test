package calculator;

public class Human extends Client{

    private double loanAmount; // сумма кредита
    private double monthlyPayment; // ежемесечный платеж
    private double interestRate; // процентная ставка

    public Human() {
        super();
    }

    public Human(double loanAmount, double monthlyPayment, double interestRate) {
        super(loanAmount, monthlyPayment, interestRate);
    }

    @Override
    public double overpayment() {
        double result = loanAmount * (interestRate / 100);
        double annualPay = monthlyPayment * 12;
        double remainingLoan = loanAmount;

        while (remainingLoan - annualPay > 0) {
            result += ((remainingLoan - annualPay) * (interestRate / 100));
            remainingLoan = remainingLoan - annualPay + result;
        }
        return result;
    }

    @Override
    public double totalAmount() {
        return loanAmount + overpayment();
    }

    public void getTotalAmountInfo() {
        System.out.println("общая сумма к оплате: " + totalAmount());
    }

    public void getOverpaymentInfo(){
        System.out.println("переплата по вашему кредиту составит: " + overpayment());
    }

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
