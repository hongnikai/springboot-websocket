package com.lc.websocket.bean;

/**
 * Created by lc on 2019/9/10
 * @Description 面向数据库aead_campaign表的DTO
 */
public class CampaignDTO {

    private int id;

    private String channel;         //    来源：google/faceboot/vk

    private String operation;       //例如： add/remove/update/select

    private Long campaignId;

    private String campaignName;

    private String campaignStatus;  //campaign状态

    private String budget;          //预算相关

    private String adSetId;       //广告一些其他设定参数id

    private String productSet;     //产品设定 json

    private String audience;        //人群json

    private String feature;         //其它补充字段

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignStatus() {
        return campaignStatus;
    }

    public void setCampaignStatus(String campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getAdSetId() {
        return adSetId;
    }

    public void setAdSetId(String adSetId) {
        this.adSetId = adSetId;
    }

    public String getProductSet() {
        return productSet;
    }

    public void setProductSet(String productSet) {
        this.productSet = productSet;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    @Override
    public String toString() {
        return "CampaignDTO{" +
                "id=" + id +
                ", channel='" + channel + '\'' +
                ", operation='" + operation + '\'' +
                ", campaignId=" + campaignId +
                ", campaignName='" + campaignName + '\'' +
                ", campaignStatus='" + campaignStatus + '\'' +
                ", budget='" + budget + '\'' +
                ", adSetId='" + adSetId + '\'' +
                ", productSet='" + productSet + '\'' +
                ", audience='" + audience + '\'' +
                ", feature='" + feature + '\'' +
                '}';
    }
}
