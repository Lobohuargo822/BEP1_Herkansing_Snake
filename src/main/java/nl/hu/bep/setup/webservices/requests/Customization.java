package nl.hu.bep.setup.webservices.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customization {
    public String color;
    public String head;
    public String tail;

    public Customization(String color, String head, String tail) {
        this.color = color;
        this.head = head;
        this.tail = tail;
    }

    public Customization(){}

    public String getColor() {
        return color;
    }

    public String getHead() {
        return head;
    }

    public String getTail() {
        return tail;
    }
}
