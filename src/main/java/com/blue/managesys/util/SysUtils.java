package com.blue.managesys.util;

import java.util.UUID;

public class SysUtils {
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();   //转化为String对象
        System.out.println(uuid); //打印UUID
        uuid = uuid.replace("-", ""); //因为UUID本身为32位只是生成时多了“-”，所以将它们去点就可
        System.out.println(uuid);
        return uuid;
    }
}
