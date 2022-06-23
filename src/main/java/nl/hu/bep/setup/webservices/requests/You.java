package nl.hu.bep.setup.webservices.requests;

import java.util.List;

// het snake body
public class You {
    public String id;
    public String name;
    public String latency;
    public int health;
    public List<Body> body;
    public int length;
    public String shout;
    public String squad;
    public Customization customizations;

    public You(String id, String name, String latency, int health, List<Body> body, int length, String shout, String squad, Customization customizations) {
        this.id = id;
        this.name = name;
        this.latency = latency;
        this.health = health;
        this.body = body;
        this.length = length;
        this.shout = shout;
        this.squad = squad;
        this.customizations = customizations;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLatency() {
        return latency;
    }

    public int getHealth() {
        return health;
    }

    public List<Body> getBody() {
        return body;
    }

    public int getLength() {
        return length;
    }

    public String getShout() {
        return shout;
    }

    public String getSquad() {
        return squad;
    }

    public Customization getCustomizations() {
        return customizations;
    }
}
