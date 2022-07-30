package ru.netology.stats.stats.services;

public class StatsService {

    public int summSales(long[] sales) {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }
        return total;

    }

    public int averageSales(long[] sales) {
        int sum = summSales(sales);
        return (sum / 12);
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int underAverageSales(long[] sales) {
        int month = 0;
        int count = 0;
        long average = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= average) {
                continue;
            }
            if (sales[i] < average) {
                month = i;
            }
            count++;

        }
        return count;
    }

    public int aboveAverageSales(long[] sales) {
        int month = 0;
        int count = 0;
        long average = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= average) {
                continue;
            }
            if (sales[i] > average) {
                month = i;
            }
            count++;

        }
        return count;
    }
}
