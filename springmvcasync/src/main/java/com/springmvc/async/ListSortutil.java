package com.springmvc.async;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortutil<T> {
    public void sort(List<T> targetList,final String sortFiled, final String sortMode){
        Collections.sort(targetList, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                int result = 0;
                try {
                    String newStr = "get"+sortFiled.trim().substring(0, 1).toUpperCase() + sortFiled.trim().substring(1);
                    Method method1 = o1.getClass().getMethod(newStr, null);
                    Method method2 = o2.getClass().getMethod(newStr, null);
                    if (sortMode != null && "desc".equals(sortMode)){
                        // 降序排列
                        result = method2.invoke(o2, null).toString().compareTo(method1.invoke(o1, null).toString());
                    }else {
                        // 升序排列
                        result = method1.invoke(o1, null).toString().compareTo(method2.invoke(o2, null).toString());
                    }
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
                return result;
            }
        });

    }
}
