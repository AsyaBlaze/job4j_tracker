package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int number) {
        return number - x;
    }

    public int divide(int number) {
        return number / x;
    }

    public int sumAllOperation(int number) {
        return sum(number) + multiply(number) + minus(number) + divide(number);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        int rslMinus = minus(10);
        Calculator divides = new Calculator();
        int rslDivide = divides.divide(10);
        Calculator sum = new Calculator();
        int rslFinal = sum.sumAllOperation(10);
        System.out.println(result + " - Сумма"
                + System.lineSeparator() + rsl + " - Умножение"
                + System.lineSeparator() + rslMinus + " - Вычитание"
                + System.lineSeparator() + rslDivide + " - Деление"
                + System.lineSeparator() + rslFinal + " - Сумма всех операций");
    }

}
