package com.java.modularization.consumer;



import java.util.List;
import java.util.logging.Logger;

import com.java.modularization.consumer.sorting.algorithm.util.MySortingUtil;

public class MySortingUtilConsumer {

    private static Logger logger =
            Logger.getLogger(MySortingUtilConsumer.class.getName());

    public static void main(String[] args) {
        MySortingUtil util = new MySortingUtil();
        List<String> sorted
                = util.sort(List.of("Rajaa", "Ravi", "Sathish", "Adam","Eve"));
        logger.info(sorted.toString());
    }

}