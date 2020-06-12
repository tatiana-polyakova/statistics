package ru.netology.stats;

import java.util.List;

import static org.junit.Assert.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    public void sum() {
        int[] source = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        assertEquals(180, service.sum(source));
    }

    @org.junit.jupiter.api.Test
    public void middle() {
        int[] source = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        assertEquals(15, service.middle(source),0.0);
    }

    @org.junit.jupiter.api.Test
    public void maxProfitMonths() {
        int[] source = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int[] expected = new int[]{5, 7};
        List<Integer> actual = service.maxProfitMonths(source);
        assertArrayEquals(expected, toIntArray(actual));
    }

    int[] toIntArray(List<Integer> list){
        int[] ret = new int[list.size()];
        for(int i = 0;i < ret.length;i++)
            ret[i] = list.get(i);
        return ret;
    }

    @org.junit.jupiter.api.Test
    void minProfitMonths() {
        int[] source = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int[] expected = new int[] {8};
        List<Integer> actual = service.minProfitMonths(source);
        assertArrayEquals(expected, toIntArray(actual));
    }

    @org.junit.jupiter.api.Test
    void belowAverage() {
            int[] source = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            StatsService service = new StatsService();
            assertEquals(5, service.belowAverage(source));
    }

    @org.junit.jupiter.api.Test
    void aboveAverage() {
        int[] source = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        assertEquals(5, service.aboveAverage(source));
    }
}