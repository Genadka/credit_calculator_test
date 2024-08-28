package oop_calc;

public class LoanCalculator {

    public double calculateOverpayment(Client client) {
        double result = 0;
        Loan loan = client.getLoan();
        double loanAmount = loan.getLoanAmount();
        double monthlyPayment = loan.getMonthlyPayment();
        double interestRate = loan.getInterestRate();

        double annualPay = monthlyPayment * 12;
        double remainingLoan = loanAmount;

        if (client.getClientType().equals("human")) {
            result = loanAmount * (interestRate / 100);

            while (remainingLoan - annualPay > 0) {
                result += ((remainingLoan - annualPay) * (interestRate / 100));
                remainingLoan = remainingLoan - annualPay + result;
            }
        } else if (client.getClientType().equals("business")) {
            result = 0; // Бизнес не имеет переплаты
        }

        return result;
    }
}