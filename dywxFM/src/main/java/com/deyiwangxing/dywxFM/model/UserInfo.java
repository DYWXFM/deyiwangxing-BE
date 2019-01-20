package com.deyiwangxing.dywxFM.model;

/**
 * @author softtwilight
 * @vesion create on 2019/1/19
 */
public class UserInfo {

    private Integer userId;
    private String userName;
    private String sex;


    public Integer getUserId() {
        return userId;
    }

    public UserInfo setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public UserInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public UserInfo setSex(String sex) {
        this.sex = sex;
        return this;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
