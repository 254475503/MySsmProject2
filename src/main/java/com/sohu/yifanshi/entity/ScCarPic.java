package com.sohu.yifanshi.entity;

import java.util.Date;

public class ScCarPic{
    private int id;
    private int flag;//标识 0为系统图片 1为网友上传图片
    private String url;//图片URL
    private int power;//权重 （为了图片排序）
    private int car_id;//车辆ID
    private String remark;//备注
    private int delete_flag;//是否有效 0表示有效 1表示无效
    private Date create_datetime;//创建时间
    private int brand_id;
    private int model_id;
    private int trimm_id;
    private int cid;//实际ID
    private String cpid;//实际ID
    private int flag_source;//数据来源 1 表示 auto  2.第一车网 3.车易拍
    private Date operatortime_c;//数据操作时间
    private String operatortime_er;//操作人
    private String type;//类型
    private String sub_type;//角度
    public String getSub_type() {
        return sub_type;
    }
    public void setSub_type(String sub_type) {
        this.sub_type = sub_type;
    }
    public String getCpid() {
        return cpid;
    }
    public void setCpid(String cpid) {
        this.cpid = cpid;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getFlag(){
        return this.flag;
    }
    public void setFlag(int flag){
        this.flag=flag;
    }
    public String getUrl(){
        return this.url;
    }
    public void setUrl(String url){
        this.url=url;
    }
    public int getPower(){
        return this.power;
    }
    public void setPower(int power){
        this.power=power;
    }
    public int getCar_id(){
        return this.car_id;
    }
    public void setCar_id(int car_id){
        this.car_id=car_id;
    }
    public String getRemark(){
        return this.remark;
    }
    public void setRemark(String remark){
        this.remark=remark;
    }
    public int getDelete_flag(){
        return this.delete_flag;
    }
    public void setDelete_flag(int delete_flag){
        this.delete_flag=delete_flag;
    }
    public Date getCreate_datetime(){
        return this.create_datetime;
    }
    public void setCreate_datetime(Date create_datetime){
        this.create_datetime=create_datetime;
    }
    public int getBrand_id(){
        return this.brand_id;
    }
    public void setBrand_id(int brand_id){
        this.brand_id=brand_id;
    }
    public int getModel_id(){
        return this.model_id;
    }
    public void setModel_id(int model_id){
        this.model_id=model_id;
    }
    public int getTrimm_id(){
        return this.trimm_id;
    }
    public void setTrimm_id(int trimm_id){
        this.trimm_id=trimm_id;
    }
    public int getCid(){
        return this.cid;
    }
    public void setCid(int cid){
        this.cid=cid;
    }
    public int getFlag_source(){
        return this.flag_source;
    }
    public void setFlag_source(int flag_source){
        this.flag_source=flag_source;
    }
    public Date getOperatortime_c(){
        return this.operatortime_c;
    }
    public void setOperatortime_c(Date operatortime_c){
        this.operatortime_c=operatortime_c;
    }
    public String getOperatortime_er(){
        return this.operatortime_er;
    }
    public void setOperatortime_er(String operatortime_er){
        this.operatortime_er=operatortime_er;
    }

}
