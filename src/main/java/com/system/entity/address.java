package com.system.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "用户地址管理")//类上设置
public class address {
    @ApiModelProperty(value = "id",hidden = true)//成员变量上设置
    private int id;
    @ApiModelProperty(value = "用户唯一标识符",required = true,example = "1")
    private int u_id;
    @ApiModelProperty(value = "用户名称",required = true,example = "李志伟")
    private String name;
    @ApiModelProperty(value = "移动电话",required = true,example = "17628223627")
    private String tel;
    @ApiModelProperty(value = "固定电话",required = true,example = "6352386")
    private String fix_tel;
    @ApiModelProperty(value = "户籍地址",required = true,example = "四川省巴中市平昌县")
    private String address;
    @ApiModelProperty(value = "家庭地址",required = true,example = "星龙新城")
    private String home;
    @ApiModelProperty(value = "状态,0 无效,1 有效",required = true,example = "0")
    private int isDefault;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFix_tel() {
        return fix_tel;
    }

    public void setFix_tel(String fix_tel) {
        this.fix_tel = fix_tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }
}
