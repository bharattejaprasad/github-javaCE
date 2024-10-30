package com.java.modularization.consumer.sorting.algorithm.util;


import java.util.List;

import com.java.modularization.consumer.sorting.algorithm.BubbleSort;

public class MySortingUtil {

    public List<String> sort(List<String> names){
        BubbleSort bubbleSort = new BubbleSort();
        return bubbleSort.sort(names);
    }

}
