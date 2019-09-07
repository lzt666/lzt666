package com.luo.po;

import java.util.Date;

public class Orders {


    private Integer id;

    private Integer userid;

    private String number;

    private Date createtime;

    private String note;

    public Orders() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userid=" + userid +
                ", number='" + number + '\'' +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                '}';

    }
}