package com.Eisen.daily.leetCode.medium;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets_904 {
    public int totalFruit(int[] fruits) {
        // 1, 2, 1, 3, 3, 1, 2
        Map<Integer, Integer> basket = new HashMap<>();
        int j = 0;
        int maxTotal = 0;
        for(int i = 0; i < fruits.length; i++){
            basket.put(fruits[i], basket.getOrDefault(fruits[i], 0) + 1);
            while (basket.size() > 2) {
                basket.put(fruits[j], basket.get(fruits[i]) - 1);
                basket.remove(fruits[j], 0);
                j++;
            }
            maxTotal = Math.max(maxTotal, i - j + 1);
        }

        return maxTotal;

    }

}
