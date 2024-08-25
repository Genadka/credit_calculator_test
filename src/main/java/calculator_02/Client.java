package calculator_02;

public class Client {

    private double loanAmount; // сумма кредита
    private double monthlyPayment; // ежемесечный платеж
    private double interestRate; // процентная ставка
    private String type; // тип клиента (бизнес или обычный человек)

    public Client() {}

    public Client(double loanAmount, double monthlyPayment, double interestRate, String type) {
        this.loanAmount = loanAmount;
        this.monthlyPayment = monthlyPayment;
        this.interestRate = interestRate;
        this.type = type;
    }

    public double overpayment() {
        double result = 0;
        double annualPay = monthlyPayment * 12;
        double remainingLoan = loanAmount;

        if (type.equals("human")) {
            result = loanAmount * (interestRate / 100);
        } if (type.equals("business")) {
            result = 0;
        }

        while (remainingLoan - annualPay > 0) {
            result += ((remainingLoan - annualPay) * (interestRate / 100));
            remainingLoan = remainingLoan - annualPay + result;
        }
        return result;
    }

    public void getTotalAmountInfo() {
        System.out.println("переплата по вашему кредиту составит: " + overpayment()
                + System.lineSeparator()
                + "общая сумма к оплате: " + (loanAmount + overpayment()));
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
