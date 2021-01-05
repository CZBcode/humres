package auroraonce.humres.entity;

import java.sql.Date;

public class employee {

    private int eno;
    private String name;
    private String nickname;
    private String pwd;
    private String sex;
    private Date onboardDat;
    private String education;
    private String wedding;
    private Date updatedat;
    private int depno;
    private int stano;

    public employee(int eno, String name, String nickname, String pwd, String sex, Date onboardDat, String education, String wedding, Date updatedat, int depno, int stano) {
        this.eno = eno;
        this.name = name;
        this.nickname = nickname;
        this.pwd = pwd;
        this.sex = sex;
        this.onboardDat = onboardDat;
        this.education = education;
        this.wedding = wedding;
        this.updatedat = updatedat;
        this.depno = depno;
        this.stano = stano;
    }

    @Override
    public String toString() {
        return "employee{" +
                "eno=" + eno +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sex='" + sex + '\'' +
                ", onboardDat=" + onboardDat +
                ", education='" + education + '\'' +
                ", wedding='" + wedding + '\'' +
                ", updatedat=" + updatedat +
                ", depno=" + depno +
                ", stano=" + stano +
                '}';
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getOnboardDat() {
        return onboardDat;
    }

    public void setOnboardDat(Date onboardDat) {
        this.onboardDat = onboardDat;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getWedding() {
        return wedding;
    }

    public void setWedding(String wedding) {
        this.wedding = wedding;
    }

    public Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }

    public int getDepno() {
        return depno;
    }

    public void setDepno(int depno) {
        this.depno = depno;
    }

    public int getStano() {
        return stano;
    }

    public void setStano(int stano) {
        this.stano = stano;
    }
}
