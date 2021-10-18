package com.kololantoo.tinysample.jvm.oom;

/**
 * @author: zhengyang
 * @version: 1.0
 * @date: 2021/10/18
 * @description: -Xss128k
 */
public class JVMStackOOM {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JVMStackOOM oom = new JVMStackOOM();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length: "+ oom.stackLength);
            throw e;
        }
    }
}
