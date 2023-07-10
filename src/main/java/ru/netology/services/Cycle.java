package ru.netology.services;

public class Cycle {
        public int calculate(int income, int expenses, int threshold) { // income - доход, expenses - расход, threshold - остаток
            int count = 0; // счетчик отдыха
            int balance = 0; // баланс

            for (int i = 0; i < 12; i++) { // счет месяцев
                if (balance >= threshold) {
                    balance -= expenses;
                    balance /=3;
                    count++;
                } else {
                    balance += income;
                    balance -= expenses;
                }
            }
            return count;
        }
    }
