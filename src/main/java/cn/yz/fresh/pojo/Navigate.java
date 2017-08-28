package cn.yz.fresh.pojo;

import java.io.Serializable;

/**
 * Created by Kim昌完 on 2017/8/26.
 */
public class Navigate implements Serializable{
    private Integer navigateId;
    private String navigateName;

    public Integer getNavigateId() {
        return navigateId;
    }

    public void setNavigateId(Integer navigateId) {
        this.navigateId = navigateId;
    }

    public String getNavigateName() {
        return navigateName;
    }

    public void setNavigateName(String navigateName) {
        this.navigateName = navigateName;
    }
}
