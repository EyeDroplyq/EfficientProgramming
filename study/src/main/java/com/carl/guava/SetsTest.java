package com.carl.guava;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: Carl
 * @createDate: 2024-09-08 17:40
 * @version: 1.0
 */
public class SetsTest {

    public static void test1(){
        HashSet<Integer> set1 = Sets.newHashSet(1, 2);
        HashSet<Integer> set2 = Sets.newHashSet(3,4);
        Set<List<Integer>> resultSet = Sets.cartesianProduct(set1, set2);
        System.out.println(JSON.toJSONString(resultSet));
    }

    public static void main(String[] args) {
        test1();
    }
}
