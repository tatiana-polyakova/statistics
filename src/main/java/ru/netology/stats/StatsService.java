package ru.netology.stats;

import java.util.ArrayList;
import java.util.List;


public class StatsService {

    public int sum(int[] data) {
        int result = 0;

        for (int element : data) {
            result = result + element;
        }

        return result;
    }

    public float middle(int[] value) {
        float result;
        int sum = sum(value);
        int count = value.length;
        result = (float) sum / count;

        return result;
    }

    public List maxProfitMonths(int[] value) {
        int maxValue = 0;
        List<Integer> result = new ArrayList<Integer>();

        for (int element : value) {
            if (maxValue < element)
                maxValue = element;
        }
        for (int i = 0; i < value.length; i = i + 1) {
            if (value[i] == maxValue) {
                result.add(i);
            }
        }
        return result;
    }

    public List minProfitMonths(int[] value) {
        int minValue = value[0];
        List<Integer> result = new ArrayList<Integer>();

        for (int element : value) {
            if (minValue > element)
                minValue = element;
        }
        for (int i = 0; i < value.length; i = i + 1) {
            if (value[i] == minValue) {
                result.add(i);
            }
        }
        return result;
    }

    public int belowAverage(int[] value) {
        float middleValue = middle(value);
        int result = 0;

        for (int element : value) {
            if (middleValue > element) {
                result = result + 1;
            }
        }
        return result;
    }

    public int aboveAverage(int[] value) {
        float middleValue = middle(value);
        int result = 0;

        for (int element : value) {
            if (middleValue < element) {
                result = result + 1;
            }
        }
        return result;
    }
}