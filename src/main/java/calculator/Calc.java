package calculator;

public class Calc {
    public static void main(String[] args) {

        Business business = new Business();
        business.setLoanAmount(300000);
        business.setMonthlyPayment(10000);
        business.setInterestRate(10);
        business.getOverpaymentInfo();
        business.getTotalAmountInfo();

        Human human = new Human();
        human.setLoanAmount(100000);
        human.setMonthlyPayment(10000);
        human.setInterestRate(10);
        human.getOverpaymentInfo();
        human.getTotalAmountInfo();
    }
}
