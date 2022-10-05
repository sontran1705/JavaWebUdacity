package com.udacity.jwdnd.course1.cloudstorage.entity;

public class Credentials {

    private Long credentialId;

    private String url;

    private String userName;

    private String key;

    private String passWord;

    private String userId;

    public Credentials(Long credentialId, String url, String userName, String key, String passWord, String userId) {
        this.credentialId = credentialId;
        this.url = url;
        this.userName = userName;
        this.key = key;
        this.passWord = passWord;
        this.userId = userId;
    }

    public Long getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(Long credentialId) {
        this.credentialId = credentialId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}



