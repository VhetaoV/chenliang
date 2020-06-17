package com.vueserver.manager.vo;

import lombok.Data;

import java.util.Date;

/**
 * @description:返回数据vo
 * @author: hetao
 * @create: 2020-06-17 20:51
 **/
@Data
public class Triple {

    /**
     * 表示今天是否下单日
     */
    private Boolean isOrderDay;
    /**
     *  下单日
     */
    private Date orderDay;
    /**
     * 今天距离下一个下单日的间隔
     */
    private Integer interval;
}
