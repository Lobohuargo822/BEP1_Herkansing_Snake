package nl.hu.bep.setup.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class GameInfo {
    //zet hier de snake info vanuit de API-site
        private String apiversion = "1";
        private String author = "JB_daBest";
        private String color = "#888888";
        private String head = "default";
        private String tail = "default";
        private String version = "0.0.1-beta";

    public String getApiversion() {
        return apiversion;
    }

    public void setApiversion(String apiversion) {
        this.apiversion = apiversion;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
