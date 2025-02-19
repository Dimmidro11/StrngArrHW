package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void shouldCalculateSummarySales() {
        StatsService service = new StatsService();

        long[] sales = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        long expected = 90;

        long actual = service.summSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldClaculateAwerageSales() {
        StatsService service = new StatsService();

        long[] sales = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        long expected = 7;

        long actual = service.awgSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowMonthMaxSales() {
        StatsService service= new StatsService();

        long[] sales = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        long expected = 12;

        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowMonthMinSales() {
        StatsService service = new StatsService();

        long[] sales = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        long expected = 1;

        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowSummaryMonthsLessAverage() {
        StatsService service = new StatsService();

        long[] sales = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        long expected = 5; // На самом деле месяцев 6. Дробные значения округляет в меньшую сторону, поэтому один месяц может выпасть

        long actual = service.lessAwgSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowSummaryMonthsAboveAwerage() {
        StatsService service = new StatsService();

        long[] sales = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        long expected = 6;

        long actual = service.aboveAwgSales(sales);

        Assertions.assertEquals(expected, actual);
    }

}
