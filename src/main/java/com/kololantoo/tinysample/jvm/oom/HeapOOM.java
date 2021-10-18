package com.kololantoo.tinysample.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhengyang
 * @version: 1.0
 * @date: 2021/10/18
 * @description: JVM 参数 -Xms20m -Xmx20m -XX: +HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {

    static class OOMObject{}

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
