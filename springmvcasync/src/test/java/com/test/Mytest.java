package com.test;

import com.springmvc.async.ListSortutil;
import com.springmvc.async.User;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

public class Mytest {
    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal("2.0658");
        BigDecimal value1 = bigDecimal.setScale(4, BigDecimal.ROUND_UP);
        BigDecimal value2 = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal value3 = bigDecimal.setScale(2, BigDecimal.ROUND_DOWN);
        System.out.println(value1.doubleValue());
        System.out.println(value2);
        System.out.println(value3);

    }

    @Test
    public void test01() {
        String s1 = "123";
        String s2 = "123";
        String s3 = new String("123");
        String s4 = new String("123");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }

    @Test
    public void test02() {
        List<User> userList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            // user.setAge(random.nextInt(100));
            userList.add(user);
        }

        ListSortutil<User> sortutil = new ListSortutil<>();

        System.out.println(userList);

        sortutil.sort(userList, "age", "desc");

        System.out.println(userList);

        System.out.println(userList);


    }


    @Test
    public void test03() {
        System.out.println("resolve conflict");
    }

    @Test
    public void test04() {
        System.out.println("resolve conflict");
    }


    @Test
    public void test05() {
        System.out.println("resolve conflict");
    }

    @Test
    public void test06(){
        System.out.println("resolve conflict");
    }


    @Test
    public void test07(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(999);
    }


    @Test
    public void teach(){
        User user = new User();
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            users.add(user);
        }

        user.setAge(10);
        user.setHeight("180");

        user.setAge(20);

        System.out.println(users);

    }


    @Test
    public void test08(){
        User user = new User();
        Map<String, List<User>> map = new HashMap<>();
        // 不支持add和remove操作
        map.put("1", Arrays.asList(user));

        map.get("1").add(user);
    }


}
