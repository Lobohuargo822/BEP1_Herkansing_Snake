package nl.hu.bep.setup.webservices.requests;

public class Ruleset {
    public String name;
    public String version;
    public Settings settings;

    public Ruleset(String name, String version, Settings settings) {
        this.name = name;
        this.version = version;
        this.settings = settings;
    }

    public Ruleset(){}

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }
}
