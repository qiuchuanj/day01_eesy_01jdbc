package cn.edu.cqupt.service;


import cn.edu.cqupt.dao.impl.AccountDaoImpl;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author qcj
 * @date 2020/7/25 - 10:59
 */
@Component("accountService")
public class AccountServiceImpl implements AccountService{
    private String name;
    private Integer age;
    private Date date;

    public AccountServiceImpl(String name,Integer age,Date date){
        this.name=name;
        this.age=age;
        this.date=date;

    }

    @Resource
    private AccountDaoImpl accountDao1;

    public void saveAccount() {
        accountDao1.saveAccount();

    }

    public String getName() {
        return name;
    }

    public AccountServiceImpl setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public AccountServiceImpl setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public AccountServiceImpl setDate(Date date) {
        this.date = date;
        return this;
    }

    public AccountServiceImpl() {
    }
}
