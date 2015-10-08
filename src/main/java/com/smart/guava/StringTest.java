package com.smart.guava;

import org.junit.Test;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;

/**
 * @Description 字符串操作相关
 * @author gaowenming
 */
public class StringTest {

    /**
     * 字符串拼接
     *  Joiner 类能解决需要循环数组拼接字符串的操作
     * @Description
     */
    @Test
    public void testJoin() {

        String str = Joiner.on("-").skipNulls().join(new Object[] { 1, 2, 3, 4, 5, null, 6 });
        System.out.println(str);
        //1-2-3-4-5-6
    }

    /**
     * 字符分割
     * Splitter 可以将字符串按格式分割，还能去空格
     * @Description
     */
    @Test
    public void testSplitter() {

        String str = "  abc,   def   ,adff,sla,akm";
        System.out.println(Splitter.on(",").trimResults().omitEmptyStrings().splitToList(str));

    }

    @Test
    public void testCharMatcher() {

        //如果你想从字符串中得到所有的数字，那么你可以这样：
        String str1 = CharMatcher.DIGIT.retainFrom("some text 89983 and more");
        //  如果你想把字符串中的数据都去掉，可以如下：
        String str2 = CharMatcher.DIGIT.removeFrom("some text 89983 and more");

        System.out.println(str1);
        System.out.println(str2);
    }

    /**
     * 字符非空判断
     * @Description
     */
    @Test
    public void testCheck() {
        System.out.println(Strings.isNullOrEmpty(""));
        System.out.println(Strings.isNullOrEmpty(null));
        System.out.println(Strings.isNullOrEmpty("abc"));
    }
}
