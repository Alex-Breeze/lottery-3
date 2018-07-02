package com.github.chengbin.crawler.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Issue implements Serializable {


    private static final long serialVersionUID = 1042206952918319237L;

    private Integer id;

    private Integer lotteryId;

    private String issue;

    private String drawNumber;

    private Date drawTime;

    private Integer sell;

    private Date sellStartTime;

    private Date sellEndTime;

    private Integer state;

    public Issue(Integer lotteryId, String issue, Integer sell, Date sellEndTime) {
        this.lotteryId = lotteryId;
        this.issue = issue;
        this.sell = sell;
        this.sellEndTime = sellEndTime;
    }

}