package cn.edu.cqupt.dao.impl;

import cn.edu.cqupt.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * @author qcj
 * @date 2020/7/25 - 11:03
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {


    public void saveAccount() {
        System.out.println("chenggong");
    }
}
