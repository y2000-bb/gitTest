package com.demo.dao.impl;

import com.demo.dao.UserDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UserDaoImpl implements UserDao {
    public void getUsers() {
        System.out.println("获取用户数据");
    }



    private static Log log = LogFactory.getLog(UserDao.class);



    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 5000; i++) {
            log.trace("跟踪信息");
            log.debug("调试信息");
            log.info("输出信息");
            log.warn("警告信息");
            log.error("错误信息");
            log.fatal("致命信息");
        }
    }
}
