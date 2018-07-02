package com.github.chengbin.crawler.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class Lottery implements Serializable {


    private static final long serialVersionUID = 5699608439096440345L;

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