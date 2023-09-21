package ru.netology.stats;

public class StatService {
    public long sum(long[] sales) {
        long totalRevenue = 0;
        for (long sale : sales) {
            totalRevenue += sale;
        }
        return totalRevenue;
    }

    public long average(long[] sales) {
        long totalRevenue = 0;
        for (long sale : sales) {
            totalRevenue += sale;
        }
        long avarageSale = totalRevenue / sales.length;
        return avarageSale;
    }

    public int peakSalesMonth(long[] sales) {

        int peakSalesMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[peakSalesMonth]) {
                peakSalesMonth = i;
            }
        }
        return peakSalesMonth + 1;
    }

    public int minSalesMonth(long[] sales) {
        int minSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSalesMonth]) {
                minSalesMonth = i;
            }
        }
        return minSalesMonth + 1;
    }

    public int revenueBellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }

        }

        return counter;
    }

    public int revenueAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}