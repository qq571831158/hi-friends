package com.hifriends.model;

import java.util.Date;

public class Topic {
    private Integer topicId;

    private String topicUser;

    private Integer topicZan;

    private Integer topicMark;

    private Integer topicRemark;

    private Date topicTime;

    private String topicUserpicture;

    public Topic(Integer topicId, String topicUser, Integer topicZan, Integer topicMark, Integer topicRemark, Date topicTime, String topicUserpicture) {
        this.topicId = topicId;
        this.topicUser = topicUser;
        this.topicZan = topicZan;
        this.topicMark = topicMark;
        this.topicRemark = topicRemark;
        this.topicTime = topicTime;
        this.topicUserpicture = topicUserpicture;
    }

    public Topic() {
        super();
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicUser() {
        return topicUser;
    }

    public void setTopicUser(String topicUser) {
        this.topicUser = topicUser == null ? null : topicUser.trim();
    }

    public Integer getTopicZan() {
        return topicZan;
    }

    public void setTopicZan(Integer topicZan) {
        this.topicZan = topicZan;
    }

    public Integer getTopicMark() {
        return topicMark;
    }

    public void setTopicMark(Integer topicMark) {
        this.topicMark = topicMark;
    }

    public Integer getTopicRemark() {
        return topicRemark;
    }

    public void setTopicRemark(Integer topicRemark) {
        this.topicRemark = topicRemark;
    }

    public Date getTopicTime() {
        return topicTime;
    }

    public void setTopicTime(Date topicTime) {
        this.topicTime = topicTime;
    }

    public String getTopicUserpicture() {
        return topicUserpicture;
    }

    public void setTopicUserpicture(String topicUserpicture) {
        this.topicUserpicture = topicUserpicture == null ? null : topicUserpicture.trim();
    }
}