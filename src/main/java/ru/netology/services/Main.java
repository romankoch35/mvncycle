package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        Cycle service = new Cycle();

            int income = 450000;
            int expenses = 250000;
            int threshold = 100000;

            int result = service.calculate(income, expenses, threshold);
            int towork = 12 - result;

        System.out.println("Мне нужно будет работать " + towork + " месяцев, чтобы отдохнуть " + result + " месяца в году.");
    }
}