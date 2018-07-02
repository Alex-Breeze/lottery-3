package com.github.chengbin.core.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangcb
 * @created 2018-01-19 10:28.
 */
@Data
public class LotteryDTO implements Serializable {


    private static final long serialVersionUID = -3225517355177197290L;

    private Integer id;

    private String name;

    private Integer maxSellIssue;

    private Integer limitMul;

    private Integer webSellStatus;

    private Integer wapSellStatus;

    private Integer clientSellStatus;

    private Integer orderValue;

    private Boolean highLight;

    private String message;

    private Date createTime;

    private Date updateTime;

    private String prize;

}
