package cn.yz.fresh.service.impl;

import cn.yz.fresh.dao.INavigateDAO;
import cn.yz.fresh.pojo.Navigate;
import cn.yz.fresh.service.INavigateService;
import org.springframework.stereotype.Service;

/**
 * Created by Kim昌完 on 2017/8/26.
 */
@Service
public class NavigateServiceImpl implements INavigateService{
    private INavigateDAO navigateDAOImpl;
    public Navigate queryAll() {
        return navigateDAOImpl.queryAll();
    }

    public INavigateDAO getNavigateDAOImpl() {
        return navigateDAOImpl;
    }

    public void setNavigateDAOImpl(INavigateDAO navigateDAOImpl) {
        this.navigateDAOImpl = navigateDAOImpl;
    }
}
