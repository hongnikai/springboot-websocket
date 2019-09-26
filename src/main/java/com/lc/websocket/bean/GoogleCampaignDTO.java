package com.lc.websocket.bean;

/**
 * Created by lc on 2019/9/10
 * @Description google面向mysql存储eneity
 */
public class GoogleCampaignDTO {

    private Long campaignId;

    private String campaignName;

    private String campaignStatus;

    private String advertisingChannelType;   //广告频道类型  SEARCH

    private Long budgetId;

    private String budgetName;

    private Long budgetMoney;

    private String budgetOperator;              //预算的操作方式： add set remove

    private String budgetDeliveryMethod;        //预算策略  STANDARD ACCELERATED

    private String biddingStrategyType;         //出价方式 MANUAL_CPC

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

    public String getAdvertisingChannelType() {
        return advertisingChannelType;
    }

    public void setAdvertisingChannelType(String advertisingChannelType) {
        this.advertisingChannelType = advertisingChannelType;
    }

    public Long getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(Long budgetId) {
        this.budgetId = budgetId;
    }

    public String getBudgetName() {
        return budgetName;
    }

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    public Long getBudgetMoney() {
        return budgetMoney;
    }

    public void setBudgetMoney(Long budgetMoney) {
        this.budgetMoney = budgetMoney;
    }

    public String getBudgetOperator() {
        return budgetOperator;
    }

    public void setBudgetOperator(String budgetOperator) {
        this.budgetOperator = budgetOperator;
    }

    public String getBudgetDeliveryMethod() {
        return budgetDeliveryMethod;
    }

    public void setBudgetDeliveryMethod(String budgetDeliveryMethod) {
        this.budgetDeliveryMethod = budgetDeliveryMethod;
    }

    public String getBiddingStrategyType() {
        return biddingStrategyType;
    }

    public void setBiddingStrategyType(String biddingStrategyType) {
        this.biddingStrategyType = biddingStrategyType;
    }

}
