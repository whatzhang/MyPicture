package com.sust.entity;

import java.io.Serializable;

public class PicWords implements Serializable {
    private Integer woId;

    private Integer usId;

    private Integer woUsId;

    private String woAbout;

    private String wordscol;

    private String woStr1;

    private String woStr2;

    private String woStr3;

    private String woStr4;

    private String woStr5;

    private String woStr6;

    private static final long serialVersionUID = 1L;

    public Integer getWoId() {
        return woId;
    }

    public void setWoId(Integer woId) {
        this.woId = woId;
    }

    public Integer getUsId() {
        return usId;
    }

    public void setUsId(Integer usId) {
        this.usId = usId;
    }

    public Integer getWoUsId() {
        return woUsId;
    }

    public void setWoUsId(Integer woUsId) {
        this.woUsId = woUsId;
    }

    public String getWoAbout() {
        return woAbout;
    }

    public void setWoAbout(String woAbout) {
        this.woAbout = woAbout == null ? null : woAbout.trim();
    }

    public String getWordscol() {
        return wordscol;
    }

    public void setWordscol(String wordscol) {
        this.wordscol = wordscol == null ? null : wordscol.trim();
    }

    public String getWoStr1() {
        return woStr1;
    }

    public void setWoStr1(String woStr1) {
        this.woStr1 = woStr1 == null ? null : woStr1.trim();
    }

    public String getWoStr2() {
        return woStr2;
    }

    public void setWoStr2(String woStr2) {
        this.woStr2 = woStr2 == null ? null : woStr2.trim();
    }

    public String getWoStr3() {
        return woStr3;
    }

    public void setWoStr3(String woStr3) {
        this.woStr3 = woStr3 == null ? null : woStr3.trim();
    }

    public String getWoStr4() {
        return woStr4;
    }

    public void setWoStr4(String woStr4) {
        this.woStr4 = woStr4 == null ? null : woStr4.trim();
    }

    public String getWoStr5() {
        return woStr5;
    }

    public void setWoStr5(String woStr5) {
        this.woStr5 = woStr5 == null ? null : woStr5.trim();
    }

    public String getWoStr6() {
        return woStr6;
    }

    public void setWoStr6(String woStr6) {
        this.woStr6 = woStr6 == null ? null : woStr6.trim();
    }
}