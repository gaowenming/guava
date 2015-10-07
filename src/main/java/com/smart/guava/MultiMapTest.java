package com.smart.guava;

import org.junit.Test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * @Description 
 * @author gaowenming
 */
public class MultiMapTest {
    
  
    @Test
    public void testMultimap() {
        
        /**
         *  Multimap<String, Integer> 来代替原来的Map<String,List<Integer>>
         */
        Multimap<String, Integer> scoreMultimap = ArrayListMultimap.create();
        scoreMultimap.put("a", 1);
        scoreMultimap.put("a", 2);
        scoreMultimap.put("a", 3);
        scoreMultimap.put("a", 4);

        scoreMultimap.put("b", 1);
        scoreMultimap.put("b", 2);
        scoreMultimap.put("b", 3);
        scoreMultimap.put("b", 4);

        System.out.println(scoreMultimap.get("a"));
    }
}
