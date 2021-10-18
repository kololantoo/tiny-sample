package com.kololantoo.tinysample.jvm.oom;

/**
 * @author: zhengyang
 * @version: 1.0
 * @date: 2021/10/18
 * @description:
 */
public class RuntimeConstantPoolOOM2 {

    public static void main(String[] args) {
        String s1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(s1.intern() == s1);

        String s2 = new StringBuilder("ja").append("va").toString();
        System.out.println(s2.intern() == s2);
    }
}
