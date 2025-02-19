package ru.netology.stats;

public class StatsService {

    // 1 задача
    public long summSales (long[] sales) {
        long summ = 0;

        for (long t: sales) {
            summ = summ + t;
        }
        return summ;
    }

    // 2 задача
    public long awgSales (long[] sales) {
        long awg = summSales(sales) / sales.length;
        return awg;
    }

    // 3 задача
    public long maxSales (long[] sales){
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++){
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;

            }

        }
        return maxMonth + 1;
    }

    // 4 задача
    public long minSales (long[] sales){
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++){
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;

            }

        }
        return minMonth + 1;
    }

    // 5 задача
    public long lessAwgSales (long[] sales) {
        long awg = summSales(sales) / sales.length;
        int months = 0;

        for (long t: sales){
            if (t < awg) {
                months++;
            }
        }
        return months;
    }

    // 6 задача
    public long aboveAwgSales (long[] sales) {
        long awg = summSales(sales) / sales.length;
        int months = 0;

        for (long t: sales){
            if (t > awg) {
                months++;
            }
        }
        return months;
    }

}
