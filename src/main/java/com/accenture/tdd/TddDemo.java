package com.accenture.tdd;

import java.util.List;

public class TddDemo {
    public MaxValues max(List<Integer> list) {
        if (list != null && list.size() > 1) {
            int max = 0;
            int secondMax = 0;
            for (int item : list) {
                if (item > secondMax && item > max) {
                    secondMax = max;
                    max = item;
                }
                if (item > secondMax && item < max) {
                    secondMax = item;
                }
            }
            return new MaxValues(max, secondMax);
        }
        return null;
    }
}
