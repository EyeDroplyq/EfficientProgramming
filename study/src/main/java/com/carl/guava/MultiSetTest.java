package com.carl.guava;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Sets;
import com.google.common.primitives.Chars;

/**
 * @description:
 * @author: Carl
 * @createDate: 2024-09-08 17:19
 * @version: 1.0
 */
public class MultiSetTest {
    private static final String text = "《南陵别儿童入京》" +
            "白酒新熟山中归，黄鸡啄黍秋正肥。" +
            "呼童烹鸡酌白酒，儿女嬉笑牵人衣。" +
            "高歌取醉欲自慰，起舞落日争光辉。" +
            "游说万乘苦不早，著鞭跨马涉远道。" +
            "会稽愚妇轻买臣，余亦辞家西入秦。" +
            "仰天大笑出门去，我辈岂是蓬蒿人。";

    public static void main(String[] args) {
        HashMultiset<Character> multiset = HashMultiset.create();
        char[] chars = text.toCharArray();
        Chars.asList(chars)
                .stream()
                .forEach(charItem -> {
                    multiset.add(charItem);
                });
        System.out.println("总字符数: " + multiset.size());
        System.out.println("人字的个数: " + multiset.count('人'));
    }

}
