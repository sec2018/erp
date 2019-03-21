package com.sec.erp.infrastructure;


import org.springframework.beans.BeanUtils;

public class BeanUtil {

    public static void copeProperties(Object from,Object dest){
        try {
            BeanUtils.copyProperties(from, dest);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
