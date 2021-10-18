package com.kololantoo.tinysample.jvm.oom;

import jdk.internal.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author: zhengyang
 * @version: 1.0
 * @date: 2021/10/18
 * @description: -XX: Xmx20M -XX: MaxDirectMemorySize=10M
 */
public class DirectMemoryOOM {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
