package com.github.chengbin.crawler.controller;

import com.github.chengbin.core.dto.IssueDTO;
import com.github.chengbin.crawler.service.IssueService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zhangcb
 * @created 2018-01-19 13:57.
 */
@RestController
@RequestMapping("/issue")
@Slf4j
public class IssueController {

    @Autowired
    private IssueService issueService;

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    private IssueDTO selectIssueInfo(@RequestParam("lotteryId") Integer lotteryId, @RequestParam("issue") String issue) throws Exception{
        return issueService.findByLotteryAndIssue(lotteryId,issue);
    }
}
