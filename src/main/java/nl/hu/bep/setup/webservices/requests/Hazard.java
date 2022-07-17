package nl.hu.bep.setup.webservices.requests;

import java.util.List;

public class Hazard {
    public List<Hazard> Hazards;

    public Hazard(List<Hazard> hazards) {
        Hazards = hazards;
    }

    public Hazard() {
    }

    public List<Hazard> getHazards() {
        return Hazards;
    }

    public void setHazards(List<Hazard> hazards) {
        Hazards = hazards;
    }
}
