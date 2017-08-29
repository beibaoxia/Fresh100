package cn.yz.fresh.pojo;

public class Goods {
    private Integer goodid;

    private String goodname;

    private Integer gradeid;

    private Integer catrgoryid;

    private String brand;

    private String standard;

    private String goodlevel;

    private Integer repertory;

    private Long price;

    private String currency;

    private String fluctuates;

    private String isspot;

    private Integer supplierid;

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname == null ? null : goodname.trim();
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    public Integer getCatrgoryid() {
        return catrgoryid;
    }

    public void setCatrgoryid(Integer catrgoryid) {
        this.catrgoryid = catrgoryid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getGoodlevel() {
        return goodlevel;
    }

    public void setGoodlevel(String goodlevel) {
        this.goodlevel = goodlevel == null ? null : goodlevel.trim();
    }

    public Integer getRepertory() {
        return repertory;
    }

    public void setRepertory(Integer repertory) {
        this.repertory = repertory;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getFluctuates() {
        return fluctuates;
    }

    public void setFluctuates(String fluctuates) {
        this.fluctuates = fluctuates == null ? null : fluctuates.trim();
    }

    public String getIsspot() {
        return isspot;
    }

    public void setIsspot(String isspot) {
        this.isspot = isspot == null ? null : isspot.trim();
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }
}