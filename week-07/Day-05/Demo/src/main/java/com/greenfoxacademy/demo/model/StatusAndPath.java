package com.greenfoxacademy.demo.model;

public class StatusAndPath {

    private String url ="/foxsong.mp3";
    private Status status = Status.whatdoesthefoxsay;
    private String imagePath ="/greenfox.png";

    public StatusAndPath(String url, Status status, String imagePath) {
        this.url = url;
        this.status = status;
        this.imagePath = imagePath;
    }

//    public StatusAndPath(){}

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
