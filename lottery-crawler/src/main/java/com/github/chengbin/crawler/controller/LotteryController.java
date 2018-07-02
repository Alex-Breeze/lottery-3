package com.github.chengbin.crawler.controller;

import com.github.chengbin.core.dto.LotteryDTO;
import com.github.chengbin.crawler.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/18.
 */
@RestController
@RequestMapping("/lottery")
public class LotteryController {

    @Autowired
    private LotteryService lotteryService;

    @RequestMapping("{lotteryId}")
    public LotteryDTO selectLotteryById(@PathVariable("lotteryId") Integer lotteryId) throws Exception{
        return lotteryService.selectLotteryById(lotteryId);
    }
}
