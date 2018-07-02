package com.github.chengbin.core.log;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/7/2.
 */
@Service
@Aspect
public class LogAdvice {

    private static final Logger logger    = LoggerFactory.getLogger(LogAdvice.class);
    private final        int    maxLength = 2000;

    @Pointcut("@within(com.github.chengbin.core.log.ClassLogger)")
    public void classLog(){}

    @Pointcut("@annotation(com.github.chengbin.core.log.MethodLogger)")
    public  void methodLog() {
    }

    @Around(value = "classLog() || methodLog() " )
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        final long begin = System.currentTimeMillis();
        String args = JSON.toJSONString(pjp.getArgs());

        if (null != args && args.length() > this.maxLength) {
            args = args.substring(0, this.maxLength);
        }

        Object returnObj = null;
        try {
            returnObj = pjp.proceed();
        } catch (final Throwable throwable) {
            logger.error("[LogAdvice.doAround] throwable=", throwable);
            throw throwable;
        } finally {
            String returnStr = JSON.toJSONString(pjp.getArgs());
            if (null != returnStr && returnStr.length() > this.maxLength) {
                returnStr = returnStr.substring(0, this.maxLength);
            }
            long timeUsed = System.currentTimeMillis() - begin;
            this.logger.info("LogAdvice|{}|method:{}|cost:{}ms|args:{}|return:{}",
                    (timeUsed > 300 ? "TimeOut":"") , pjp.toLongString(),timeUsed,
                    args, returnStr);
        }
        return returnObj;
    }
}
