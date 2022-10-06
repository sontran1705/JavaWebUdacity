package com.udacity.jwdnd.course1.cloudstorage.model;

public class CredentialsEncode {

    private int credentialId;

    private String url;

    private String userName;

    private byte[] key;

    private String passWord;

    private int userId;

    private String encodePassWord;

    public CredentialsEncode(int credentialId, String url, String userName, byte[] key, String passWord, int userId, String encodePassWord) {
        this.credentialId = credentialId;
        this.url = url;
        this.userName = userName;
        this.key = key;
        this.passWord = passWord;
        this.userId = userId;
        this.encodePassWord = encodePassWord;
    }

    public int getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(int credentialId) {
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

    public byte[] getKey() {
        return key;
    }

    public void setKey(byte[] key) {
        this.key = key;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEncodePassWord() {
        return encodePassWord;
    }

    public void setEncodePassWord(String encodePassWord) {
        this.encodePassWord = encodePassWord;
    }
}
