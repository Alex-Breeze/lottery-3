package com.github.chengbin.order.fallback;

import com.github.chengbin.core.dto.LotteryDTO;
import com.github.chengbin.order.feign.LotteryFeign;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/18.
 */
@Component
public class LotteryFeignFallback implements LotteryFeign {

    @RequestMapping(value = "/lottery/{lotteryId}",method = RequestMethod.GET)
    public LotteryDTO selectLotteryInfo(Integer lotteryId) {
        return null;
    }
}
