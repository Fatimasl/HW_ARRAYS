package ru.netology.stats.HW_ARRAYS.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    void SumOfSalesTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void AverageSumOfSalesTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSumOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void AverageSumOfSalesLengthZeroTest() {
        StatsService service = new StatsService();

        long[] sales = new long[0];
        long expected = 0;
        long actual = service.averageSumOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void MaxMonthOfSalesTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxMonthOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void MinMonthOfSalesTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minMonthOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void AmountOfMonthUnderAverageSalesTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.amountOfMonthUnderAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void AmountOfMonthOverAverageSalesTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.amountOfMonthOverAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}

