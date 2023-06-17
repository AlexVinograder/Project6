package ru.netology.stats.sales.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void salesAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.salesAmount(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void monthlyAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 15;
        int actualSum = service.monthlyAmount(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonths = 8;
        int actualMonths = service.maxSales(sales);
        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonths = 9;
        int actualMonths = service.minSales(sales);
        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void belowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonths = 5;
        int actualMonths = service.belowAverage(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void aboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonths = 5;
        int actualMonths = service.aboveAverage(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }
}