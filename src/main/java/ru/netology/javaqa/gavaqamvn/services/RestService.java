package ru.netology.javaqa.gavaqamvn.services;

public class RestService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; //денег на счету
        int month;
        int count = 0; // счетчик месяцев

        for (month = 0; month < 12; month++){
            if (threshold >= money) {
                count++;
                threshold = (threshold - expenses) / 3;

            } else {
                money = (threshold + income) - expenses;
            }

        }
        return count;
    }
}

