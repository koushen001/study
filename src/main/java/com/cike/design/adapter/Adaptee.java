package com.cike.design.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description
 * @Author kou
 * @Version 1.0
 **/
@Slf4j
public class Adaptee {
    /**
     * 示意方法，原本已经存在，已经实现的方法
     */
    public void specificRequest(){
        log.info("处理客户端请求");
    }
}
