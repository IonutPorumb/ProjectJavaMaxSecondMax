package com.accenture.tdd;

import java.util.List;

public class TddDemo {
    public MaxValues max(List<Integer> list) {
        if (list != null && list.size() > 1) {
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            for (int item : list) {
                if (item > secondMax && item > max) {
                    secondMax = max;
                    max = item;
                } else if (item > secondMax) {
                    secondMax = item;
                }
            }
            return new MaxValues(max, secondMax);
        }
        return null;
    }
}
