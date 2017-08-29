package cn.yz.fresh.pojo;

public class Dealer {
    private Integer dealerid;

    private String dealername;

    private String dealerphone;

    private String dealerqq;

    public Integer getDealerid() {
        return dealerid;
    }

    public void setDealerid(Integer dealerid) {
        this.dealerid = dealerid;
    }

    public String getDealername() {
        return dealername;
    }

    public void setDealername(String dealername) {
        this.dealername = dealername == null ? null : dealername.trim();
    }

    public String getDealerphone() {
        return dealerphone;
    }

    public void setDealerphone(String dealerphone) {
        this.dealerphone = dealerphone == null ? null : dealerphone.trim();
    }

    public String getDealerqq() {
        return dealerqq;
    }

    public void setDealerqq(String dealerqq) {
        this.dealerqq = dealerqq == null ? null : dealerqq.trim();
    }
}