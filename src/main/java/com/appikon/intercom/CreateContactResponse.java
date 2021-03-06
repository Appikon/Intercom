
package com.appikon.intercom;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "id",
        "workspace_id",
        "external_id",
        "role",
        "email",
        "phone",
        "name",
        "avatar",
        "owner_id",
        "social_profiles",
        "has_hard_bounced",
        "marked_email_as_spam",
        "unsubscribed_from_emails",
        "created_at",
        "updated_at",
        "signed_up_at",
        "last_seen_at",
        "last_replied_at",
        "last_contacted_at",
        "last_email_opened_at",
        "last_email_clicked_at",
        "language_override",
        "browser",
        "browser_version",
        "browser_language",
        "os",
        "location",
        "android_app_name",
        "android_app_version",
        "android_device",
        "android_os_version",
        "android_sdk_version",
        "android_last_seen_at",
        "ios_app_name",
        "ios_app_version",
        "ios_device",
        "ios_os_version",
        "ios_sdk_version",
        "ios_last_seen_at",
        "custom_attributes",
        "tags",
        "notes",
        "companies"
})
public class CreateContactResponse {

    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("workspace_id")
    private String workspaceId;
    @JsonProperty("external_id")
    private String externalId;
    @JsonProperty("role")
    private String role;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private Object phone;
    @JsonProperty("name")
    private Object name;
    @JsonProperty("avatar")
    private Object avatar;
    @JsonProperty("owner_id")
    private Object ownerId;
    @JsonProperty("social_profiles")
    private SocialProfiles socialProfiles;
    @JsonProperty("has_hard_bounced")
    private Boolean hasHardBounced;
    @JsonProperty("marked_email_as_spam")
    private Boolean markedEmailAsSpam;
    @JsonProperty("unsubscribed_from_emails")
    private Boolean unsubscribedFromEmails;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("updated_at")
    private Integer updatedAt;
    @JsonProperty("signed_up_at")
    private Object signedUpAt;
    @JsonProperty("last_seen_at")
    private Object lastSeenAt;
    @JsonProperty("last_replied_at")
    private Object lastRepliedAt;
    @JsonProperty("last_contacted_at")
    private Object lastContactedAt;
    @JsonProperty("last_email_opened_at")
    private Object lastEmailOpenedAt;
    @JsonProperty("last_email_clicked_at")
    private Object lastEmailClickedAt;
    @JsonProperty("language_override")
    private Object languageOverride;
    @JsonProperty("browser")
    private Object browser;
    @JsonProperty("browser_version")
    private Object browserVersion;
    @JsonProperty("browser_language")
    private Object browserLanguage;
    @JsonProperty("os")
    private Object os;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("android_app_name")
    private Object androidAppName;
    @JsonProperty("android_app_version")
    private Object androidAppVersion;
    @JsonProperty("android_device")
    private Object androidDevice;
    @JsonProperty("android_os_version")
    private Object androidOsVersion;
    @JsonProperty("android_sdk_version")
    private Object androidSdkVersion;
    @JsonProperty("android_last_seen_at")
    private Object androidLastSeenAt;
    @JsonProperty("ios_app_name")
    private Object iosAppName;
    @JsonProperty("ios_app_version")
    private Object iosAppVersion;
    @JsonProperty("ios_device")
    private Object iosDevice;
    @JsonProperty("ios_os_version")
    private Object iosOsVersion;
    @JsonProperty("ios_sdk_version")
    private Object iosSdkVersion;
    @JsonProperty("ios_last_seen_at")
    private Object iosLastSeenAt;
    @JsonProperty("custom_attributes")
    private Map<String, Object> customAttributes;
    @JsonProperty("tags")
    private Tags tags;
    @JsonProperty("notes")
    private Notes notes;
    @JsonProperty("companies")
    private Companies companies;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("workspace_id")
    public String getWorkspaceId() {
        return workspaceId;
    }

    @JsonProperty("workspace_id")
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @JsonProperty("external_id")
    public String getExternalId() {
        return externalId;
    }

    @JsonProperty("external_id")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("phone")
    public Object getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(Object phone) {
        this.phone = phone;
    }

    @JsonProperty("name")
    public Object getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Object name) {
        this.name = name;
    }

    @JsonProperty("avatar")
    public Object getAvatar() {
        return avatar;
    }

    @JsonProperty("avatar")
    public void setAvatar(Object avatar) {
        this.avatar = avatar;
    }

    @JsonProperty("owner_id")
    public Object getOwnerId() {
        return ownerId;
    }

    @JsonProperty("owner_id")
    public void setOwnerId(Object ownerId) {
        this.ownerId = ownerId;
    }

    @JsonProperty("social_profiles")
    public SocialProfiles getSocialProfiles() {
        return socialProfiles;
    }

    @JsonProperty("social_profiles")
    public void setSocialProfiles(SocialProfiles socialProfiles) {
        this.socialProfiles = socialProfiles;
    }

    @JsonProperty("has_hard_bounced")
    public Boolean getHasHardBounced() {
        return hasHardBounced;
    }

    @JsonProperty("has_hard_bounced")
    public void setHasHardBounced(Boolean hasHardBounced) {
        this.hasHardBounced = hasHardBounced;
    }

    @JsonProperty("marked_email_as_spam")
    public Boolean getMarkedEmailAsSpam() {
        return markedEmailAsSpam;
    }

    @JsonProperty("marked_email_as_spam")
    public void setMarkedEmailAsSpam(Boolean markedEmailAsSpam) {
        this.markedEmailAsSpam = markedEmailAsSpam;
    }

    @JsonProperty("unsubscribed_from_emails")
    public Boolean getUnsubscribedFromEmails() {
        return unsubscribedFromEmails;
    }

    @JsonProperty("unsubscribed_from_emails")
    public void setUnsubscribedFromEmails(Boolean unsubscribedFromEmails) {
        this.unsubscribedFromEmails = unsubscribedFromEmails;
    }

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("signed_up_at")
    public Object getSignedUpAt() {
        return signedUpAt;
    }

    @JsonProperty("signed_up_at")
    public void setSignedUpAt(Object signedUpAt) {
        this.signedUpAt = signedUpAt;
    }

    @JsonProperty("last_seen_at")
    public Object getLastSeenAt() {
        return lastSeenAt;
    }

    @JsonProperty("last_seen_at")
    public void setLastSeenAt(Object lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
    }

    @JsonProperty("last_replied_at")
    public Object getLastRepliedAt() {
        return lastRepliedAt;
    }

    @JsonProperty("last_replied_at")
    public void setLastRepliedAt(Object lastRepliedAt) {
        this.lastRepliedAt = lastRepliedAt;
    }

    @JsonProperty("last_contacted_at")
    public Object getLastContactedAt() {
        return lastContactedAt;
    }

    @JsonProperty("last_contacted_at")
    public void setLastContactedAt(Object lastContactedAt) {
        this.lastContactedAt = lastContactedAt;
    }

    @JsonProperty("last_email_opened_at")
    public Object getLastEmailOpenedAt() {
        return lastEmailOpenedAt;
    }

    @JsonProperty("last_email_opened_at")
    public void setLastEmailOpenedAt(Object lastEmailOpenedAt) {
        this.lastEmailOpenedAt = lastEmailOpenedAt;
    }

    @JsonProperty("last_email_clicked_at")
    public Object getLastEmailClickedAt() {
        return lastEmailClickedAt;
    }

    @JsonProperty("last_email_clicked_at")
    public void setLastEmailClickedAt(Object lastEmailClickedAt) {
        this.lastEmailClickedAt = lastEmailClickedAt;
    }

    @JsonProperty("language_override")
    public Object getLanguageOverride() {
        return languageOverride;
    }

    @JsonProperty("language_override")
    public void setLanguageOverride(Object languageOverride) {
        this.languageOverride = languageOverride;
    }

    @JsonProperty("browser")
    public Object getBrowser() {
        return browser;
    }

    @JsonProperty("browser")
    public void setBrowser(Object browser) {
        this.browser = browser;
    }

    @JsonProperty("browser_version")
    public Object getBrowserVersion() {
        return browserVersion;
    }

    @JsonProperty("browser_version")
    public void setBrowserVersion(Object browserVersion) {
        this.browserVersion = browserVersion;
    }

    @JsonProperty("browser_language")
    public Object getBrowserLanguage() {
        return browserLanguage;
    }

    @JsonProperty("browser_language")
    public void setBrowserLanguage(Object browserLanguage) {
        this.browserLanguage = browserLanguage;
    }

    @JsonProperty("os")
    public Object getOs() {
        return os;
    }

    @JsonProperty("os")
    public void setOs(Object os) {
        this.os = os;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("android_app_name")
    public Object getAndroidAppName() {
        return androidAppName;
    }

    @JsonProperty("android_app_name")
    public void setAndroidAppName(Object androidAppName) {
        this.androidAppName = androidAppName;
    }

    @JsonProperty("android_app_version")
    public Object getAndroidAppVersion() {
        return androidAppVersion;
    }

    @JsonProperty("android_app_version")
    public void setAndroidAppVersion(Object androidAppVersion) {
        this.androidAppVersion = androidAppVersion;
    }

    @JsonProperty("android_device")
    public Object getAndroidDevice() {
        return androidDevice;
    }

    @JsonProperty("android_device")
    public void setAndroidDevice(Object androidDevice) {
        this.androidDevice = androidDevice;
    }

    @JsonProperty("android_os_version")
    public Object getAndroidOsVersion() {
        return androidOsVersion;
    }

    @JsonProperty("android_os_version")
    public void setAndroidOsVersion(Object androidOsVersion) {
        this.androidOsVersion = androidOsVersion;
    }

    @JsonProperty("android_sdk_version")
    public Object getAndroidSdkVersion() {
        return androidSdkVersion;
    }

    @JsonProperty("android_sdk_version")
    public void setAndroidSdkVersion(Object androidSdkVersion) {
        this.androidSdkVersion = androidSdkVersion;
    }

    @JsonProperty("android_last_seen_at")
    public Object getAndroidLastSeenAt() {
        return androidLastSeenAt;
    }

    @JsonProperty("android_last_seen_at")
    public void setAndroidLastSeenAt(Object androidLastSeenAt) {
        this.androidLastSeenAt = androidLastSeenAt;
    }

    @JsonProperty("ios_app_name")
    public Object getIosAppName() {
        return iosAppName;
    }

    @JsonProperty("ios_app_name")
    public void setIosAppName(Object iosAppName) {
        this.iosAppName = iosAppName;
    }

    @JsonProperty("ios_app_version")
    public Object getIosAppVersion() {
        return iosAppVersion;
    }

    @JsonProperty("ios_app_version")
    public void setIosAppVersion(Object iosAppVersion) {
        this.iosAppVersion = iosAppVersion;
    }

    @JsonProperty("ios_device")
    public Object getIosDevice() {
        return iosDevice;
    }

    @JsonProperty("ios_device")
    public void setIosDevice(Object iosDevice) {
        this.iosDevice = iosDevice;
    }

    @JsonProperty("ios_os_version")
    public Object getIosOsVersion() {
        return iosOsVersion;
    }

    @JsonProperty("ios_os_version")
    public void setIosOsVersion(Object iosOsVersion) {
        this.iosOsVersion = iosOsVersion;
    }

    @JsonProperty("ios_sdk_version")
    public Object getIosSdkVersion() {
        return iosSdkVersion;
    }

    @JsonProperty("ios_sdk_version")
    public void setIosSdkVersion(Object iosSdkVersion) {
        this.iosSdkVersion = iosSdkVersion;
    }

    @JsonProperty("ios_last_seen_at")
    public Object getIosLastSeenAt() {
        return iosLastSeenAt;
    }

    @JsonProperty("ios_last_seen_at")
    public void setIosLastSeenAt(Object iosLastSeenAt) {
        this.iosLastSeenAt = iosLastSeenAt;
    }

    @JsonProperty("custom_attributes")
    public Map<String, Object> getCustomAttributes() {
        return customAttributes;
    }

    @JsonProperty("custom_attributes")
    public void setCustomAttributes(Map<String, Object> customAttributes) {
        this.customAttributes = customAttributes;
    }

    @JsonProperty("tags")
    public Tags getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(Tags tags) {
        this.tags = tags;
    }

    @JsonProperty("notes")
    public Notes getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    @JsonProperty("companies")
    public Companies getCompanies() {
        return companies;
    }

    @JsonProperty("companies")
    public void setCompanies(Companies companies) {
        this.companies = companies;
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
