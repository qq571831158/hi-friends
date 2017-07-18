package com.hifriends.model;

import java.sql.Timestamp;

/**
 * Created by apple on 2017/7/18.
 */
public class Userpool {
    private int id;
    private String username;
    private String sessionId;
    private Timestamp validTime;
    private int isUsed;
    private Timestamp createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Timestamp getValidTime() {
        return validTime;
    }

    public void setValidTime(Timestamp validTime) {
        this.validTime = validTime;
    }

    public int getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(int isUsed) {
        this.isUsed = isUsed;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Userpool(){}

    public Userpool(int id, String username, String sessionId, Timestamp validTime, int isUsed,Timestamp createTime) {
        this.id = id;
        this.username = username;
        this.sessionId = sessionId;
        this.validTime = validTime;
        this.isUsed = isUsed;
        this.createTime = createTime;
    }
}
