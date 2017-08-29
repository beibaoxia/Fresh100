package cn.yz.fresh.pojo;

import java.util.Date;

public class Supplier {
    private Integer supplierid;

    private String companyname;

    private Integer userid;

    private String grade;

    private String majorBusiness;

    private String resourceinfo;

    private Date uptime;

    private Integer download;

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getMajorBusiness() {
        return majorBusiness;
    }

    public void setMajorBusiness(String majorBusiness) {
        this.majorBusiness = majorBusiness == null ? null : majorBusiness.trim();
    }

    public String getResourceinfo() {
        return resourceinfo;
    }

    public void setResourceinfo(String resourceinfo) {
        this.resourceinfo = resourceinfo == null ? null : resourceinfo.trim();
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public Integer getDownload() {
        return download;
    }

    public void setDownload(Integer download) {
        this.download = download;
    }
}