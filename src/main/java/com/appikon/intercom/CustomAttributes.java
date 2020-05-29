
package com.appikon.intercom;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "shop",
    "planType",
    "city",
    "country",
    "shopifyPlanName",
    "shopifyPlanDisplayName",
    "PlanExhausted",
    "TotalStockNotificationRequestReceived",
    "customPricingAppStatus",
    "bisAppStatus",
    "showFirsOfferHelpMessage",
    "automatic_notifications",
    "search_app_status"
})
public class CustomAttributes {

    @JsonProperty("shop")
    private String shop;
    @JsonProperty("planType")
    private String planType;
    @JsonProperty("city")
    private String city;
    @JsonProperty("country")
    private String country;
    @JsonProperty("shopifyPlanName")
    private String shopifyPlanName;
    @JsonProperty("shopifyPlanDisplayName")
    private String shopifyPlanDisplayName;
    @JsonProperty("PlanExhausted")
    private Boolean planExhausted;
    @JsonProperty("TotalStockNotificationRequestReceived")
    private Integer totalStockNotificationRequestReceived;
    @JsonProperty("customPricingAppStatus")
    private String customPricingAppStatus;
    @JsonProperty("bisAppStatus")
    private String bisAppStatus;
    @JsonProperty("showFirsOfferHelpMessage")
    private Boolean showFirsOfferHelpMessage;
    @JsonProperty("automatic_notifications")
    private Boolean automaticNotifications;
    @JsonProperty("search_app_status")
    private String searchAppStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shop")
    public String getShop() {
        return shop;
    }

    @JsonProperty("shop")
    public void setShop(String shop) {
        this.shop = shop;
    }

    @JsonProperty("planType")
    public String getPlanType() {
        return planType;
    }

    @JsonProperty("planType")
    public void setPlanType(String planType) {
        this.planType = planType;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("shopifyPlanName")
    public String getShopifyPlanName() {
        return shopifyPlanName;
    }

    @JsonProperty("shopifyPlanName")
    public void setShopifyPlanName(String shopifyPlanName) {
        this.shopifyPlanName = shopifyPlanName;
    }

    @JsonProperty("shopifyPlanDisplayName")
    public String getShopifyPlanDisplayName() {
        return shopifyPlanDisplayName;
    }

    @JsonProperty("shopifyPlanDisplayName")
    public void setShopifyPlanDisplayName(String shopifyPlanDisplayName) {
        this.shopifyPlanDisplayName = shopifyPlanDisplayName;
    }

    @JsonProperty("PlanExhausted")
    public Boolean getPlanExhausted() {
        return planExhausted;
    }

    @JsonProperty("PlanExhausted")
    public void setPlanExhausted(Boolean planExhausted) {
        this.planExhausted = planExhausted;
    }

    @JsonProperty("TotalStockNotificationRequestReceived")
    public Integer getTotalStockNotificationRequestReceived() {
        return totalStockNotificationRequestReceived;
    }

    @JsonProperty("TotalStockNotificationRequestReceived")
    public void setTotalStockNotificationRequestReceived(Integer totalStockNotificationRequestReceived) {
        this.totalStockNotificationRequestReceived = totalStockNotificationRequestReceived;
    }

    @JsonProperty("customPricingAppStatus")
    public String getCustomPricingAppStatus() {
        return customPricingAppStatus;
    }

    @JsonProperty("customPricingAppStatus")
    public void setCustomPricingAppStatus(String customPricingAppStatus) {
        this.customPricingAppStatus = customPricingAppStatus;
    }

    @JsonProperty("bisAppStatus")
    public String getBisAppStatus() {
        return bisAppStatus;
    }

    @JsonProperty("bisAppStatus")
    public void setBisAppStatus(String bisAppStatus) {
        this.bisAppStatus = bisAppStatus;
    }

    @JsonProperty("showFirsOfferHelpMessage")
    public Boolean getShowFirsOfferHelpMessage() {
        return showFirsOfferHelpMessage;
    }

    @JsonProperty("showFirsOfferHelpMessage")
    public void setShowFirsOfferHelpMessage(Boolean showFirsOfferHelpMessage) {
        this.showFirsOfferHelpMessage = showFirsOfferHelpMessage;
    }

    @JsonProperty("automatic_notifications")
    public Boolean getAutomaticNotifications() {
        return automaticNotifications;
    }

    @JsonProperty("automatic_notifications")
    public void setAutomaticNotifications(Boolean automaticNotifications) {
        this.automaticNotifications = automaticNotifications;
    }

    @JsonProperty("search_app_status")
    public String getSearchAppStatus() {
        return searchAppStatus;
    }

    @JsonProperty("search_app_status")
    public void setSearchAppStatus(String searchAppStatus) {
        this.searchAppStatus = searchAppStatus;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
