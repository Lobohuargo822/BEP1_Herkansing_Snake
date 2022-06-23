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

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public Settings getSettings() {
        return settings;
    }
}
