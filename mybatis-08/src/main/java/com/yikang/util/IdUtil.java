package com.yikang.util;

import org.junit.Test;

import java.util.UUID;

public class IdUtil {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void test(){
        System.out.println(getId());
    }
}
