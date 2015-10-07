package com.smart.guava;

import org.junit.Test;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class BiMapTest {
    /**
     * 星期中英文互换
     * @Description
     */
    @Test
    public void testBiMap() {
        BiMap<String, String> weekNameMap = HashBiMap.create();
        weekNameMap.put("星期一", "Monday");
        weekNameMap.put("星期二", "Tuesday");
        weekNameMap.put("星期三", "Wednesday");
        weekNameMap.put("星期四", "Thursday");
        weekNameMap.put("星期五", "Friday");
        weekNameMap.put("星期六", "Saturday");
        weekNameMap.put("星期日", "Sunday");

        System.out.println("星期日的英文名是" + weekNameMap.get("星期日"));
        System.out.println("Sunday的中文是" + weekNameMap.inverse().get("Sunday"));
        System.out.println("反转前:" + weekNameMap);
        System.out.println("反转后:" + weekNameMap.inverse());
    }
}