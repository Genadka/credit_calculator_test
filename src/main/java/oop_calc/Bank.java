package oop_calc;

public class Bank {
    private LoanCalculator calculator = new LoanCalculator();

    public Client createClient(String type, double loanAmount, double monthlyPayment, double interestRate) {
        if (type.equalsIgnoreCase("human")) {
            return new HumanClient(loanAmount, monthlyPayment, interestRate);
        } else if (type.equalsIgnoreCase("business")) {
            return new BusinessClient(loanAmount, monthlyPayment, interestRate);
        } else {
            throw new IllegalArgumentException("Неверный тип клиента. Должен быть 'human' или 'business'.");
        }
    }

    // Метод для получения информации о кредите клиента
    public void getTotalAmountInfo(Client client) {
        double overpayment = calculator.calculateOverpayment(client);
        System.out.println("Переплата по вашему кредиту составит: " + overpayment
                + System.lineSeparator()
                + "Общая сумма к оплате: " + (client.getLoan().getLoanAmount() + overpayment));
    }
}