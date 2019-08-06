package com.xuetang9;

import org.apache.log4j.Logger;

/**
 * @author 墙头草
 * @DATE 2019/8/5 0005 21:26
 * @place 老九学堂
 * @verson 1.0
 * @copyright
 */
public class log {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("log4j");
        logger.info("log4j");
        logger.info("测试");
        logger.info("修改了");
        //添加一个注释
    }
}
