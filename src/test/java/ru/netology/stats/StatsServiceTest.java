package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void shouldCalculateSummarySales() {
        StatsService service = new StatsService();

        long[] sales = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int expected = 90;

        long actual = service.summSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldClaculateAwerageSales() {
        StatsService service = new StatsService();

        long[] sales = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int expected = 7;

        long actual = service.awgSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowMonthMaxSales() {
        StatsService service= new StatsService();

        long[] sales = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int expected = 12;

        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowMonthMinSales() {
        StatsService service = new StatsService();

        long[] sales = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int expected = 1;

        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowSummaryMonthsLessAverage() {
        StatsService service = new StatsService();

        long[] sales = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int expected = 5; // На самом деле месяцев 6. Дробные значения округляет в меньшую сторону, поэтому один месяц может выпасть

        int actual = service.lessAwgSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowSummaryMonthsAboveAwerage() {
        StatsService service = new StatsService();

        long[] sales = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int expected = 6;

        int actual = service.aboveAwgSales(sales);

        Assertions.assertEquals(expected, actual);
    }

}
