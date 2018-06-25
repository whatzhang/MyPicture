package com.sust.entity;

import java.io.Serializable;
import java.util.Date;

public class PicUsers implements Serializable {
    private Integer usId;

    private String usName;

    private Date usLastdate;

    private String usStr1;

    private String usStr2;

    private String usStr3;

    private String usStr4;

    private String usStr5;

    private static final long serialVersionUID = 1L;

    public Integer getUsId() {
        return usId;
    }

    public void setUsId(Integer usId) {
        this.usId = usId;
    }

    public String getUsName() {
        return usName;
    }

    public void setUsName(String usName) {
        this.usName = usName == null ? null : usName.trim();
    }

    public Date getUsLastdate() {
        return usLastdate;
    }

    public void setUsLastdate(Date usLastdate) {
        this.usLastdate = usLastdate;
    }

    public String getUsStr1() {
        return usStr1;
    }

    public void setUsStr1(String usStr1) {
        this.usStr1 = usStr1 == null ? null : usStr1.trim();
    }

    public String getUsStr2() {
        return usStr2;
    }

    public void setUsStr2(String usStr2) {
        this.usStr2 = usStr2 == null ? null : usStr2.trim();
    }

    public String getUsStr3() {
        return usStr3;
    }

    public void setUsStr3(String usStr3) {
        this.usStr3 = usStr3 == null ? null : usStr3.trim();
    }

    public String getUsStr4() {
        return usStr4;
    }

    public void setUsStr4(String usStr4) {
        this.usStr4 = usStr4 == null ? null : usStr4.trim();
    }

    public String getUsStr5() {
        return usStr5;
    }

    public void setUsStr5(String usStr5) {
        this.usStr5 = usStr5 == null ? null : usStr5.trim();
    }
}