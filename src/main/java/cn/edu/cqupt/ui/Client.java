package cn.edu.cqupt.ui;

import cn.edu.cqupt.dao.AccountDao;
import cn.edu.cqupt.service.AccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qcj
 * @date 2020/7/25 - 11:05
 */
public class Client {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        System.out.println(accountService);
        accountService.saveAccount();

        AccountDao accountDao=(AccountDao)applicationContext.getBean("accountDao");
        System.out.println(accountDao);


    }
}
