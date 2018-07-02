package com.github.chengbin.core.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangcb
 * @created 2018-01-19 14:13.
 */
@Data
public class IssueDTO implements Serializable {

    private static final long serialVersionUID = -7609312220868079615L;

    private Integer id;

    private Integer lotteryId;

    private String issue;

    private String drawNumber;

    private Date drawTime;

    private Integer sell;

    private Date sellStartTime;

    private Date sellEndTime;

    private Integer state;

}
