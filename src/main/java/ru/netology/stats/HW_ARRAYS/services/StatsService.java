package ru.netology.stats.HW_ARRAYS.services;

public class StatsService {
    public long SumOfSales(long[] sales) {
        long sum = 0;

        for (long s : sales) {
            sum = sum + s;
        }

        return sum;
    }

    public long AverageSumOfSales(long[] sales) {
        long averageSum;

        if (sales.length == 0) {
            averageSum = 0;
        } else {
            averageSum = SumOfSales(sales) / sales.length;
        }

        return averageSum;
    }

    public int MaxMonthOfSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }

        }

        return (maxMonth + 1);
    }

    public int MinMonthOfSales(long[] sales) {
        int minMonth = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }

        }

        return (minMonth + 1);
    }

    public int AmountOfMonthUnderAverageSales(long[] sales) {
        int amountOfMonth = 0;
        long averageSumOfSales = AverageSumOfSales(sales);

        for (long s : sales) {
            if (s < averageSumOfSales) {
                amountOfMonth++;
            }
        }

        return amountOfMonth;
    }

    public int AmountOfMonthOverAverageSales(long[] sales) {
        int amountOfMonth = 0;
        long averageSumOfSales = AverageSumOfSales(sales);

        for (long s : sales) {
            if (s > averageSumOfSales) {
                amountOfMonth++;
            }
        }

        return amountOfMonth;
    }
}
