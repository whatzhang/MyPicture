package com.sust.entity;

import java.io.Serializable;
import java.util.Date;

public class PicPicture implements Serializable {
    private Integer piId;

    private Integer usId;

    private String piTitle;

    private String piSushe;

    private Date piUptime;

    private String piStr1;

    private String piStr2;

    private String piStr3;

    private String piStr4;

    private String piStr5;

    private static final long serialVersionUID = 1L;

    public Integer getPiId() {
        return piId;
    }

    public void setPiId(Integer piId) {
        this.piId = piId;
    }

    public Integer getUsId() {
        return usId;
    }

    public void setUsId(Integer usId) {
        this.usId = usId;
    }

    public String getPiTitle() {
        return piTitle;
    }

    public void setPiTitle(String piTitle) {
        this.piTitle = piTitle == null ? null : piTitle.trim();
    }

    public String getPiSushe() {
        return piSushe;
    }

    public void setPiSushe(String piSushe) {
        this.piSushe = piSushe == null ? null : piSushe.trim();
    }

    public Date getPiUptime() {
        return piUptime;
    }

    public void setPiUptime(Date piUptime) {
        this.piUptime = piUptime;
    }

    public String getPiStr1() {
        return piStr1;
    }

    public void setPiStr1(String piStr1) {
        this.piStr1 = piStr1 == null ? null : piStr1.trim();
    }

    public String getPiStr2() {
        return piStr2;
    }

    public void setPiStr2(String piStr2) {
        this.piStr2 = piStr2 == null ? null : piStr2.trim();
    }

    public String getPiStr3() {
        return piStr3;
    }

    public void setPiStr3(String piStr3) {
        this.piStr3 = piStr3 == null ? null : piStr3.trim();
    }

    public String getPiStr4() {
        return piStr4;
    }

    public void setPiStr4(String piStr4) {
        this.piStr4 = piStr4 == null ? null : piStr4.trim();
    }

    public String getPiStr5() {
        return piStr5;
    }

    public void setPiStr5(String piStr5) {
        this.piStr5 = piStr5 == null ? null : piStr5.trim();
    }
}