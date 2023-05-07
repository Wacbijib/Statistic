package ru.netology.stats;

public class StatsService {

    public long sumPerYear(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSumAmount(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long avarageSum = sum / sales.length;
        return avarageSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthMaxAverage(long[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale > averageSumAmount(sales)) {
                month++;
            }
        }
        return month;
    }

    public int monthMinAverage(long[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale < averageSumAmount(sales)) {
                month++;
            }
        }
        return month;
    }

}