package ru.netology.stats;

public class StatsService {

    public long calculateSumSale(long[] sales) {
        long sumSale = 0;
        for (long sale : sales) {
            sumSale += sale;
        }
        return sumSale;
    }

    public long calculateAverageSale(long[] sales) {
        return calculateSumSale(sales) / sales.length;
    }

    public int calculateMonthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }

    public int calculateMonthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimum]) {
                monthMinimum = i;
            }
        }
        return monthMinimum + 1;
    }

    public int calculateMonthsBelowAverage(long[] sales) {
        long averageSale = calculateAverageSale(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int calculateMonthsAboveAverage(long[] sales) {
        long averageSale = calculateAverageSale(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
