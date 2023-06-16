package ru.netology.stats.sales.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void SalesAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.SalesAmount(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void MonthlyAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 15;
        int actualSum = service.MonthlyAmount(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void MaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonths = 8;
        int actualMonths = service.MaxSales(sales);
        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void MinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonths = 9;
        int actualMonths = service.MinSales(sales);
        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void BelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonths = 5;
        int actualMonths = service.BelowAverage(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void AboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonths = 5;
        int actualMonths = service.AboveAverage(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }
}