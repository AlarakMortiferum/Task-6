package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.sumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.averageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();
        int expected = 8; // 8-й месяц — август (нумерация с 1)
        int actual = service.maxSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();
        int expected = 9; // 9-й месяц — сентябрь
        int actual = service.minSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthsBelowAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthsBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthsAboveAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthsAboveAverage(sales);
        assertEquals(expected, actual);
    }
}
