package com.test;

import com.springmvc.async.User;
import org.junit.Test;

import java.util.*;

public class LombokTest {
    @Test
    public void test() {
        List<User> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        User user = new User();
        user.setAge(20);
        user.setHeight("170");

        User user1 = new User();
        user1.setAge(22);
        user1.setHeight("170");

        User user2 = new User();
        user2.setAge(23);
        user2.setHeight("175");
        list.add(user);
        list.add(user1);
        list.add(user2);

        Collections.sort(list, new Comparator<User>() {
            int result = 0;

            @Override
            public int compare(User o1, User o2) {
                // 先按升高降序排列
                result = o2.getHeight().compareTo(o1.getHeight());
                if (result == 0) {
                    // 如果身高一样，在按年龄升序排列
                    result = o1.getAge() - o2.getAge();
                }
                return result;
            }
        });

        System.out.println(list);
    }
}
