package oop_calc;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Введите данные через пробел: сумма кредита, ежемесячный платеж, процентная ставка, тип клиента (human или business)");
        String input = scanner.nextLine();

        try {
            String[] inputData = parseInput(input);

            double loanAmount = Double.parseDouble(inputData[0]);
            double monthlyPayment = Double.parseDouble(inputData[1]);
            double interestRate = Double.parseDouble(inputData[2]);
            String type = inputData[3];

            validateInput(loanAmount, monthlyPayment, interestRate, type);

            Client client = bank.createClient(type, loanAmount, monthlyPayment, interestRate);
            bank.getTotalAmountInfo(client);

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка: " + e.getMessage());
        }
    }

    private static String[] parseInput(String input) throws IllegalArgumentException {
        String[] inputData = input.split(" ");
        if (inputData.length != 4) {
            throw new IllegalArgumentException("Неверное количество параметров.");
        }
        return inputData;
    }

    private static void validateInput(double loanAmount, double monthlyPayment, double interestRate, String type) throws IllegalArgumentException {
        if (loanAmount <= 0 || monthlyPayment <= 0 || interestRate <= 0) {
            throw new IllegalArgumentException("Сумма кредита, ежемесячный платеж и процентная ставка должны быть положительными числами.");
        }

        if (!type.equalsIgnoreCase("human") && !type.equalsIgnoreCase("business")) {
            throw new IllegalArgumentException("Неверный тип клиента. Должен быть 'human' или 'business'.");
        }
    }
}