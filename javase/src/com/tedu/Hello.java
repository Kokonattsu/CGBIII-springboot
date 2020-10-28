package com.tedu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hello {
    /**
     * 类在运行时会读到内存
     * 之外还有没有类不会被读到
     * 第一个读到内存的类是什么类
     * 类加载的顺序
     *A:在Edit的VM配置-XX:+TraceClassLoading
     *
     */
    /**
     * main方法中的参数用途是什么
     * 我们可以给它传值么，idea在哪里给它传值
     * -main方法中的参数
     * -在Edit的配置
     *
     * 如何了解运行时GC（垃圾回收情况）
     * GC会对哪些内存区域进程回收
     *A:在Edit的VM配置-XX:+PrintGCDetails
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        System.out.println("1111");
        //手动GC（大GC？）
        System.gc();//启动垃圾回收机制

        //创建大量对象存入list，触发自动GC，
        // 有指向的对象无法被回收,如果
        List<byte[]> list=new ArrayList<>();
        for(int i=0;i<100000;i++){
            //创建1024*1024长度的byte数组
            list.add(new byte[1024*1024]);
            //此循环过后对象不可达
            byte[] a=new byte[1024*1024];
            //堆内存溢出、栈内存溢出
        }
        System.out.println("添加后重新pull");
        System.out.println("添加两条语句");
        //内存中对象什么时候会被认为是垃圾对象：对象不可达（jvm无法访问）
        //弱引用？强引用？

        //系统在启动GC时要回收内存中的垃圾对象，此时还可能导致系统短时间暂停
    }
}
