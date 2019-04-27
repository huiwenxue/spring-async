package com.test;

import org.junit.Test;

import java.util.*;

public class SortListTest {
    @Test
    public void test01() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random(20);
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        Collections.sort(list, (o1, o2) -> {
            // 按照数字大小升序排列
            if (o1 - o2 > 0) {
                return 1;
            } else if (o1 - o2 < 0) {
                return -1;
            } else {
                return 0;
            }
        });

        System.out.println(list);


    }
}
