package ru.netology.stats.sales.service;

public class StatsService {
    public int SalesAmount(int[] sales) {
        int sum = 0;

        for (int sale = 0; sale < sales.length; sale++) {
            sum += sales[sale];
        }
        return sum;
    }

    public int MonthlyAmount(int[] sales) {
        int sum = 0;
        for (int sale = 0; sale < sales.length; sale++) {
            sum += sales[sale];
        }
        return sum / sales.length;
    }

    public int MaxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int MinSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int BelowAverage(int[] sales) {
        int average = MonthlyAmount(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month++;
    }

    public int AboveAverage(int[] sales) {
        int average = MonthlyAmount(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month++;
    }
}