package ru.netology.stats.sales.service;

public class StatsService {
    public int salesAmount(int[] sales) {
        int sum = 0;

        for (int sale = 0; sale < sales.length; sale++) {
            sum += sales[sale];
        }
        return sum;
    }

    public int monthlyAmount(int[] sales) {
        int sum = 0;
        for (int sale = 0; sale < sales.length; sale++) {
            sum += sales[sale];
        }
        return sum / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int belowAverage(int[] sales) {
        int average = monthlyAmount(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month++;
    }

    public int aboveAverage(int[] sales) {
        int average = monthlyAmount(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month++;
    }
}