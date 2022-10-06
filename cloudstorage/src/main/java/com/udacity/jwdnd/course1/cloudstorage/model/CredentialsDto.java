package com.udacity.jwdnd.course1.cloudstorage.model;

public class CredentialsDto {

    private int credentialId;

    private String url;

    private String userName;

    private String passWord;

    public CredentialsDto(int credentialId, String url, String userName, String passWord) {
        this.credentialId = credentialId;
        this.url = url;
        this.userName = userName;
        this.passWord = passWord;
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

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "CredentialsDto{" +
                "credentialId=" + credentialId +
                ", url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
