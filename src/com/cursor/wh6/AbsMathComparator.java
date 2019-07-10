package com.cursor.wh6;

import java.util.Comparator;

/**
 * Created by Vasyl Kachala on 06.07.2019.
 */

public class AbsMathComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer in1, Integer in2) {
        if (Math.abs(in1 % 2) == Math.abs(in2 % 2)) {
            return in1 - in2;
        } else if (in1 % 2 == 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
