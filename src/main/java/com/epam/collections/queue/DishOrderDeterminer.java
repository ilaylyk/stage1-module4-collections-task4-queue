package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> array = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            array.add(i);
        }
        List<Integer> arrayList = new ArrayList();
        int step = everyDishNumberToEat - 1;
        int benchmark = 0;

        while (array.size() > 1) {
            benchmark += step;
            benchmark = benchmark > array.size() - 1 ? benchmark % array.size() : benchmark;
            arrayList.add(array.get(benchmark));
            array.remove(array.get(benchmark));
        }
        arrayList.addAll(array);

        return arrayList;
    }
}
