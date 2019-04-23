package com.ysx.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2019-04-23 22:57
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description
 */
public class Test {
    private static final Logger LOGGER = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        Test test = new Test();
        test.uuidTest();


    }

    private void uuidTest(){
        String uuidString = UUIDPattern.uuid();
        LOGGER.info("uuidString: {}", uuidString);

        String uuidStr1 = "12467b39-de66-48f2-b4c3-5885d4dde759";
        String uuidStr2 = "12467b39-de66-48f2-b4c3-5885d4dde75g";
        LOGGER.info("UUIDPattern.isValidUUID(uuidStr1): {}", UUIDPattern.isValidUUID(uuidStr1));
        LOGGER.info("UUIDPattern.isValidUUID(uuidStr2): {}", UUIDPattern.isValidUUID(uuidStr2));
    }
}
