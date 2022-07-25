package ru.netology.stats.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void summSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumm = 180;
        int actualSumm = service.summSales(sales);

        Assertions.assertEquals(expectedSumm, actualSumm);
    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSumm = 15;
        int actualAverageSumm = service.averageSales(sales);

        Assertions.assertEquals(expectedAverageSumm, actualAverageSumm);
    }

    @Test
    public void monthWithMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualDay = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualDay);
    }

    @Test
    public void monthWithMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualDay = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualDay);
    }

    @Test
    public void monthUnderAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        int actualDay = service.underAverageSales(sales);

        Assertions.assertEquals(expectedMonth, actualDay);
    }

    @Test
    public void monthAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        int actualDay = service.aboveAverageSales(sales);

        Assertions.assertEquals(expectedMonth, actualDay);
    }

}











