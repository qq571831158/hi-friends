package com.hifriends.model;

import java.sql.Date;

public class TopicWithBLOBs extends Topic {
    private String topicTitle;

    private String topicContent;

    private String topicPictures;

    public TopicWithBLOBs(Integer topicId, String topicUser, Integer topicZan, Integer topicMark, Integer topicRemark, Date topicTime, String topicUserpicture, String topicTitle, String topicContent, String topicPictures) {
        super(topicId, topicUser, topicZan, topicMark, topicRemark, topicTime, topicUserpicture);
        this.topicTitle = topicTitle;
        this.topicContent = topicContent;
        this.topicPictures = topicPictures;
    }

    public TopicWithBLOBs() {
        super();
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle == null ? null : topicTitle.trim();
    }

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent == null ? null : topicContent.trim();
    }

    public String getTopicPictures() {
        return topicPictures;
    }

    public void setTopicPictures(String topicPictures) {
        this.topicPictures = topicPictures == null ? null : topicPictures.trim();
    }
}