package ru.netology.stats.HW_ARRAYS.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    void SumOfSalesTest(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.SumOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void AverageSumOfSalesTest(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.AverageSumOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void AverageSumOfSalesLengthZeroTest(){
        StatsService service = new StatsService();

        long[] sales = new long[0];
        long expected = 0;
        long actual = service.AverageSumOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void MaxMonthOfSalesTest(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.MaxMonthOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void MinMonthOfSalesTest(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.MinMonthOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void AmountOfMonthUnderAverageSalesTest(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.AmountOfMonthUnderAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void AmountOfMonthOverAverageSalesTest(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.AmountOfMonthOverAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}

