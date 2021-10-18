package com.kololantoo.tinysample.jvm.oom;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: zhengyang
 * @version: 1.0
 * @date: 2021/10/18
 * @description: -XX: PermSize=6M -XX: MaxPermSize=6M
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
