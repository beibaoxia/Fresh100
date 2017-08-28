package cn.yz.fresh.dao.impl;

import cn.yz.fresh.dao.INavigateDAO;
import cn.yz.fresh.pojo.Navigate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;


/**
 * Created by Kim昌完 on 2017/8/26.
 */
@Repository
public class NavigateDAOImpl extends SqlSessionDaoSupport implements INavigateDAO{

    public Navigate queryAll() {
        return super.getSqlSession().selectOne("cn.yz.fresh.pojo.Navigate.queryAll");
    }
}
