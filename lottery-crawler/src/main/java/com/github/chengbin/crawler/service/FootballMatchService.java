package com.github.chengbin.crawler.service;

import com.github.chengbin.core.dto.FootballMatchDTO;
import com.github.chengbin.crawler.entity.FootballMatch;

import java.util.List;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/16.
 */
public interface FootballMatchService {

    int deleteByPrimaryKey(String matchId);

    int insert(FootballMatch record);

    FootballMatch selectByPrimaryKey(String matchId);

    int updateByPrimaryKeySelective(FootballMatch record);

    List<FootballMatchDTO> selectMatchInfo(List<String> ids);
}
