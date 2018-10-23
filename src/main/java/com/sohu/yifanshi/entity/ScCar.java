package com.sohu.yifanshi.entity;

import java.util.Date;

public class ScCar{

    public static String transmark(String str){
        if(str == null){
            return str;
        }
        return str.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
    }

    private int id;
    private String scuuid;// uuid 唯一标识
    private int brand_id;//品牌
    private int model_id;//车型
    private int model_year;//年款
    private int trimm_id;//车款
    private String enter_trimm_name;//手动输入车款
    private double mileage;//表显里程
    private String color;//颜色
    private int car_user_type;//是否一手车 0表示否 1表示是
    private String first_license_date;//首次上牌日期
    private int license_province;//车牌所在地_省份
    private int license_city;//车牌所在地_城市
    private String plate;//车牌号
    private String vin;//车架号(VIN)
    private String car_config;//车辆配置
    private int car_use_nature;//车辆使用性质 0 非营用 1营运 2营转非 3租赁 4其他
    private String insurance_date;//保险有效期至
    private String annual_inspection;//年检有效期至
    private double sale_price;//预售价格
    private double saled_price;//已出售价格
    private double special_price;//特价车售价
    private int transfer_fee_flag;//是否包括过户费0-不包括1-包括0默认
    private int bargain;//0可议价1一口价默认0
    private int relocation;//是否可以外迁 0标识不可以，1标识可以
    private String remark;//车况介绍
    private String inspection_address;//看车地址
    private int car_source;//车辆状态 1个人自主发布 2 商家自主发布 3 接口同步 4 自动抓取个人 5 自动抓取商家
    private int com_id;//商家ID/个人ID
    private int shop_id;//店铺ID
    private int salesman_id ; // 销售ID
    private int flag1;//展示状态 1上架 2下架 3删除
    private int flag2;//审核状态 0待审核 1审核合格 2审核不合格
    private int flag3;//品牌认证1标识品牌认证0非品牌认证
    private int flag4;//非正常刷车100/系统自动下架200
    private int flag5;//是否首页推荐1标识推荐0为默认
    private int flag6;//特价车标记0普通售价车1特价车
    private Date create_datetime;//创建时间
    private Date update_datetime;//更新时间
    private int cid;//实际ID
    private int flag_source;//数据来源 1 表示 auto  2.第一车网 3.车易拍
    private Date operatortime_c;//数据操作时间
    private String operatortime_er;//操作人
    private int model_type;////车型级别0 其他车型 1 微型车 2 小型车 3 紧凑型车 4 中型车 5 中大型车 6 豪华车 7 MPV 8 SUV 10 客车 11 货车 12 概念车 13 跑车 14 新能源车)
    private String engine_size;//排量(L)
    private String trans_drv;//换挡方式
    private String trans_spd;////档位数
    private String environmental_standards;//环保标准
    private String operatortime_name; // 操作人名称
    private String infor_integrity; // 完整度
    private String brand_auth_id; // 品牌认证ID

    private Date up_datetime ; // 上架时间
    private Date down_datetime ; // 下架时间
    private Date delete_datetime;  // 删除时间
    private Date saled_datetime;//出售时间
    private Date recomm_datetime;//推荐时间
    private Date saleprice_mdytime;//预售价格修改时间
    private Date special_datetime;//设置特价时间
    private int saleprice_up;//预售价格修改方向
    private int check_car=-1;//是否申请验车
    private int seem_dealer;//疑似商家车源
    private int certify_flag=-1;//行认证标识
    private long weight;//列表页权重

    public int getCertify_flag() {
        return certify_flag;
    }
    public void setCertify_flag(int certify_flag) {
        this.certify_flag = certify_flag;
    }
    public int getSeem_dealer() {
        return seem_dealer;
    }
    public void setSeem_dealer(int seem_dealer) {
        this.seem_dealer = seem_dealer;
    }
    public long getWeight() {
        return weight;
    }
    public void setWeight(long weight) {
        this.weight = weight;
    }
    public String getBrand_auth_id() {
        return brand_auth_id;
    }
    public void setBrand_auth_id(String brand_auth_id) {
        this.brand_auth_id = brand_auth_id;
    }
    public String getInfor_integrity() {
        return infor_integrity;
    }
    public void setInfor_integrity(String infor_integrity) {
        this.infor_integrity = infor_integrity;
    }
    public int getCheck_car() {
        return check_car;
    }
    public void setCheck_car(int check_car) {
        this.check_car = check_car;
    }
    public Date getSaleprice_mdytime() {
        return saleprice_mdytime;
    }
    public double getSpecial_price() {
        return special_price;
    }
    public void setSpecial_price(double special_price) {
        this.special_price = special_price;
    }
    public void setSaleprice_mdytime(Date saleprice_mdytime) {
        this.saleprice_mdytime = saleprice_mdytime;
    }
    public Date getSpecial_datetime() {
        return special_datetime;
    }
    public void setSpecial_datetime(Date special_datetime) {
        this.special_datetime = special_datetime;
    }
    public int getSaleprice_up() {
        return saleprice_up;
    }
    public void setSaleprice_up(int saleprice_up) {
        this.saleprice_up = saleprice_up;
    }
    public Date getRecomm_datetime() {
        return recomm_datetime;
    }
    public void setRecomm_datetime(Date recomm_datetime) {
        this.recomm_datetime = recomm_datetime;
    }
    public int getTransfer_fee_flag() {
        return transfer_fee_flag;
    }
    public void setTransfer_fee_flag(int transfer_fee_flag) {
        this.transfer_fee_flag = transfer_fee_flag;
    }
    public int getBargain() {
        return bargain;
    }
    public void setBargain(int bargain) {
        this.bargain = bargain;
    }
    public int getFlag5() {
        return flag5;
    }
    public void setFlag5(int flag5) {
        this.flag5 = flag5;
    }
    public int getFlag6() {
        return flag6;
    }
    public void setFlag6(int flag6) {
        this.flag6 = flag6;
    }
    public Date getSaled_datetime() {
        return saled_datetime;
    }
    public void setSaled_datetime(Date saled_datetime) {
        this.saled_datetime = saled_datetime;
    }
    public double getSaled_price() {
        return saled_price;
    }
    public void setSaled_price(double saled_price) {
        this.saled_price = saled_price;
    }
    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getShop_id() {
        return shop_id;
    }
    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    /**
     *
     * 审核意见
     */
    private String flag2_remark;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getBrand_id() {
        return brand_id;
    }
    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }
    public int getModel_id() {
        return model_id;
    }
    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }
    public int getModel_year() {
        return model_year;
    }
    public void setModel_year(int model_year) {
        this.model_year = model_year;
    }
    public int getTrimm_id() {
        return trimm_id;
    }
    public void setTrimm_id(int trimm_id) {
        this.trimm_id = trimm_id;
    }
    public String getEnter_trimm_name() {
        return enter_trimm_name;
    }
    public void setEnter_trimm_name(String enter_trimm_name) {
        this.enter_trimm_name = enter_trimm_name;
    }
    public double getMileage() {
        return mileage;
    }
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCar_user_type() {
        return car_user_type;
    }
    public void setCar_user_type(int car_user_type) {
        this.car_user_type = car_user_type;
    }
    public String getFirst_license_date() {
        return first_license_date;
    }
    public void setFirst_license_date(String first_license_date) {
        this.first_license_date = first_license_date;
    }
    public int getLicense_province() {
        return license_province;
    }
    public void setLicense_province(int license_province) {
        this.license_province = license_province;
    }
    public int getLicense_city() {
        return license_city;
    }
    public void setLicense_city(int license_city) {
        this.license_city = license_city;
    }
    public String getVin() {
        return vin;
    }
    public void setVin(String vin) {
        this.vin = vin;
    }
    public String getCar_config() {
        return car_config;
    }
    public void setCar_config(String car_config) {
        this.car_config = ScCar.transmark(car_config);
    }
    public int getCar_use_nature() {
        return car_use_nature;
    }
    public void setCar_use_nature(int car_use_nature) {
        this.car_use_nature = car_use_nature;
    }
    public String getInsurance_date() {
        return insurance_date;
    }
    public void setInsurance_date(String insurance_date) {
        this.insurance_date = ScCar.transmark(insurance_date);
    }
    public String getAnnual_inspection() {
        return annual_inspection;
    }
    public void setAnnual_inspection(String annual_inspection) {
        this.annual_inspection =ScCar.transmark( annual_inspection);
    }
    public double getSale_price() {
        return sale_price;
    }
    public void setSale_price(double sale_price) {
        this.sale_price = sale_price;
    }
    public int getRelocation() {
        return relocation;
    }
    public void setRelocation(int relocation) {
        this.relocation = relocation;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = ScCar.transmark(remark);
    }
    public String getInspection_address() {
        return inspection_address;
    }
    public void setInspection_address(String inspection_address) {
        this.inspection_address = ScCar.transmark(inspection_address);
    }
    public int getCar_source() {
        return car_source;
    }
    public void setCar_source(int car_source) {
        this.car_source = car_source;
    }
    public int getCom_id() {
        return com_id;
    }
    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }
    public int getSalesman_id() {
        return salesman_id;
    }
    public void setSalesman_id(int salesman_id) {
        this.salesman_id = salesman_id;
    }
    public int getFlag1() {
        return flag1;
    }
    public void setFlag1(int flag1) {
        this.flag1 = flag1;
    }
    public int getFlag2() {
        return flag2;
    }
    public void setFlag2(int flag2) {
        this.flag2 = flag2;
    }
    public int getFlag3() {
        return flag3;
    }
    public void setFlag3(int flag3) {
        this.flag3 = flag3;
    }
    public int getFlag4() {
        return flag4;
    }
    public void setFlag4(int flag4) {
        this.flag4 = flag4;
    }
    public Date getCreate_datetime() {
        return create_datetime;
    }
    public void setCreate_datetime(Date create_datetime) {
        this.create_datetime = create_datetime;
    }
    public Date getUpdate_datetime() {
        return update_datetime;
    }
    public void setUpdate_datetime(Date update_datetime) {
        this.update_datetime = update_datetime;
    }
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public int getFlag_source() {
        return flag_source;
    }
    public void setFlag_source(int flag_source) {
        this.flag_source = flag_source;
    }
    public Date getOperatortime_c() {
        return operatortime_c;
    }
    public void setOperatortime_c(Date operatortime_c) {
        this.operatortime_c = operatortime_c;
    }
    public String getOperatortime_er() {
        return operatortime_er;
    }
    public void setOperatortime_er(String operatortime_er) {
        this.operatortime_er = ScCar.transmark(operatortime_er);
    }
    public int getModel_type() {
        return model_type;
    }
    public void setModel_type(int model_type) {
        this.model_type = model_type;
    }
    public String getEngine_size() {
        return engine_size;
    }
    public void setEngine_size(String engine_size) {
        this.engine_size = engine_size;
    }
    public String getTrans_drv() {
        return trans_drv;
    }
    public void setTrans_drv(String trans_drv) {
        this.trans_drv = trans_drv;
    }
    public String getTrans_spd() {
        return trans_spd;
    }
    public void setTrans_spd(String trans_spd) {
        this.trans_spd = trans_spd;
    }
    public String getEnvironmental_standards() {
        return environmental_standards;
    }
    public void setEnvironmental_standards(String environmental_standards) {
        this.environmental_standards = ScCar.transmark(environmental_standards);
    }
    public String getOperatortime_name() {
        return operatortime_name;
    }
    public void setOperatortime_name(String operatortime_name) {
        this.operatortime_name = operatortime_name;
    }
    public String getScuuid() {
        return scuuid;
    }
    public void setScuuid(String scuuid) {
        this.scuuid = scuuid;
    }
    public Date getUp_datetime() {
        return up_datetime;
    }
    public void setUp_datetime(Date up_datetime) {
        this.up_datetime = up_datetime;
    }
    public Date getDown_datetime() {
        return down_datetime;
    }
    public void setDown_datetime(Date down_datetime) {
        this.down_datetime = down_datetime;
    }
    public Date getDelete_datetime() {
        return delete_datetime;
    }
    public void setDelete_datetime(Date delete_datetime) {
        this.delete_datetime = delete_datetime;
    }
    public String getFlag2_remark() {
        return flag2_remark;
    }
    public void setFlag2_remark(String flag2_remark) {
        this.flag2_remark = ScCar.transmark(flag2_remark);
    }



}
