package com.sohu.yifanshi.web;

import com.sohu.yifanshi.entity.ScCar;
import com.sohu.yifanshi.entity.ScCarPic;

import java.util.Date;
import java.util.List;

public class CarVo extends ScCar {



    private Date create_datetime_start ;  // 创建时间
    private Date create_datetime_end ;

    private Date update_datetime_start ; // 刷新时间
    private Date update_datetime_end ;

    private String model_name;
    private String brand_name;
    private String trimm_name;

    private String com_name; // 商家/车主名称
    private String com_telephone;// 商家/车主电话

    private int com_type=0;//类型  1.个人  6.销售
    private String salesman_name;//销售名称
    private String salesman_phone;//销售手机
    private String salesman_telephone;//销售电话


    //----------
    private String first_license_date_year;
    private String first_license_date_month;
    private String insurance_date_year;
    private String insurance_date_month;
    private String annual_inspection_year;
    private String annual_inspection_month;
    private String djzurl;
    private String xszurl;
    private String fpurl;
    private String obd;
    private int en;
    private int obds;
    private int mile;
    private int allcount;
    private int upcount;
    private int downcount;
    private int seemdealer;
    private int hi_quality_flag=-1;
    private int accusation;
    private String price;
    private double price_ref;
    private String enterColor;  // 其他颜色，网友直接填的颜色名称
    private int com_id;

    @Override
    public int getCom_id() {
        return com_id;
    }
    @Override
    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }
    public int getAccusation() {
        return accusation;
    }
    public void setAccusation(int accusation) {
        this.accusation = accusation;
    }
    public int getHi_quality_flag() {
        return hi_quality_flag;
    }
    public void setHi_quality_flag(int hi_quality_flag) {
        this.hi_quality_flag = hi_quality_flag;
    }
    public int getSeemdealer() {
        return seemdealer;
    }
    public void setSeemdealer(int seemdealer) {
        this.seemdealer = seemdealer;
    }
    public String getSalesman_telephone() {
        return salesman_telephone;
    }
    public void setSalesman_telephone(String salesman_telephone) {
        this.salesman_telephone = salesman_telephone;
    }
    public String getDjzurl() {
        return djzurl;
    }
    public void setDjzurl(String djzurl) {
        this.djzurl = djzurl;
    }
    public String getXszurl() {
        return xszurl;
    }
    public void setXszurl(String xszurl) {
        this.xszurl = xszurl;
    }
    public String getFpurl() {
        return fpurl;
    }
    public void setFpurl(String fpurl) {
        this.fpurl = fpurl;
    }
    public int getAllcount() {
        return allcount;
    }
    public void setAllcount(int allcount) {
        this.allcount = allcount;
    }
    public int getUpcount() {
        return upcount;
    }
    public void setUpcount(int upcount) {
        this.upcount = upcount;
    }
    public int getDowncount() {
        return downcount;
    }
    public void setDowncount(int downcount) {
        this.downcount = downcount;
    }
    public double getPrice_ref() {
        return price_ref;
    }
    public void setPrice_ref(double price_ref) {
        this.price_ref = price_ref;
    }
    private List<ScCarPic> pics ;

    private String flag2_remark ; // 审核不合格的时候的理由

    public Date getCreate_datetime_start() {
        return create_datetime_start;
    }
    public void setCreate_datetime_start(Date create_datetime_start) {
        this.create_datetime_start = create_datetime_start;
    }
    public Date getCreate_datetime_end() {
        return create_datetime_end;
    }
    public void setCreate_datetime_end(Date create_datetime_end) {
        this.create_datetime_end = create_datetime_end;
    }
    public Date getUpdate_datetime_start() {
        return update_datetime_start;
    }
    public void setUpdate_datetime_start(Date update_datetime_start) {
        this.update_datetime_start = update_datetime_start;
    }
    public Date getUpdate_datetime_end() {
        return update_datetime_end;
    }
    public void setUpdate_datetime_end(Date update_datetime_end) {
        this.update_datetime_end = update_datetime_end;
    }
    public String getModel_name() {
        return model_name;
    }
    public void setModel_name(String model_name) {
        this.model_name = ScCar.transmark(model_name);
    }
    public String getBrand_name() {
        return brand_name;
    }
    public void setBrand_name(String brand_name) {
        this.brand_name = ScCar.transmark(brand_name);
    }
    public String getTrimm_name() {
        return trimm_name;
    }
    public void setTrimm_name(String trimm_name) {
        this.trimm_name = ScCar.transmark(trimm_name);
    }
    public String getCom_name() {
        return com_name;
    }
    public void setCom_name(String com_name) {
        this.com_name = ScCar.transmark(com_name);
    }
    public int getCom_type() {
        return com_type;
    }
    public void setCom_type(int com_type) {
        this.com_type = com_type;
    }
    public String getSalesman_name() {
        return salesman_name;
    }
    public void setSalesman_name(String salesman_name) {
        this.salesman_name = ScCar.transmark(salesman_name);
    }
    public List<ScCarPic> getPics() {
        return pics;
    }
    public void setPics(List<ScCarPic> pics) {
        this.pics = pics;
    }
    public String getSalesman_phone() {
        return salesman_phone;
    }
    public void setSalesman_phone(String salesman_phone) {
        this.salesman_phone = ScCar.transmark(salesman_phone);
    }
    public String getCom_telephone() {
        return com_telephone;
    }
    public void setCom_telephone(String com_telephone) {
        this.com_telephone = ScCar.transmark(com_telephone);
    }
    public String getFirst_license_date_year() {
        return first_license_date_year;
    }
    public void setFirst_license_date_year(String first_license_date_year) {
        this.first_license_date_year = ScCar.transmark(first_license_date_year);
    }
    public String getFirst_license_date_month() {
        return first_license_date_month;
    }
    public void setFirst_license_date_month(String first_license_date_month) {
        this.first_license_date_month = first_license_date_month;
    }
    public String getInsurance_date_year() {
        return insurance_date_year;
    }
    public void setInsurance_date_year(String insurance_date_year) {
        this.insurance_date_year = insurance_date_year;
    }
    public String getInsurance_date_month() {
        return insurance_date_month;
    }
    public void setInsurance_date_month(String insurance_date_month) {
        this.insurance_date_month = insurance_date_month;
    }
    public String getAnnual_inspection_year() {
        return annual_inspection_year;
    }
    public void setAnnual_inspection_year(String annual_inspection_year) {
        this.annual_inspection_year = annual_inspection_year;
    }
    public String getAnnual_inspection_month() {
        return annual_inspection_month;
    }
    public void setAnnual_inspection_month(String annual_inspection_month) {
        this.annual_inspection_month = annual_inspection_month;
    }
    public String getObd() {
        return obd;
    }
    public void setObd(String obd) {
        this.obd = obd;
    }
    public int getEn() {
        return en;
    }
    public void setEn(int en) {
        this.en = en;
    }
    public int getObds() {
        return obds;
    }
    public void setObds(int obds) {
        this.obds = obds;
    }
    public int getMile() {
        return mile;
    }
    public void setMile(int mile) {
        this.mile = mile;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getEnterColor() {
        return enterColor;
    }
    public void setEnterColor(String enterColor) {
        this.enterColor = enterColor;
    }
    @Override
    public String getFlag2_remark() {
        return flag2_remark;
    }
    @Override
    public void setFlag2_remark(String flag2_remark) {
        this.flag2_remark = flag2_remark;
    }

}
