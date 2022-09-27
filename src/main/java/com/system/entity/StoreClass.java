package com.system.entity;

public class StoreClass {
    private int id;
    private String text;
    private String good_pic;
    private String add_time;
    private int good_id;

    /*mybatis必须要有无参构造*/

    public StoreClass() {

    }

    public StoreClass(int id, String text, String good_pic, String add_time, int good_id) {
        this.id = id;
        this.text = text;
        this.good_pic = good_pic;
        this.add_time = add_time;
        this.good_id = good_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getGood_pic() {
        return good_pic;
    }

    public void setGood_pic(String good_pic) {
        this.good_pic = good_pic;
    }

    public String getAdd_time() {
        return add_time;
    }

    public void setAdd_time(String add_time) {
        this.add_time = add_time;
    }

    public int getGood_id() {
        return good_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }
}
