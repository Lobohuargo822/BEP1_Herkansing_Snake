package nl.hu.bep.setup.webservices.requests;

public class Squad {
    public boolean allowBodyCollision;
    public boolean sharedElimination;
    public boolean sharedHealth;
    public boolean sharedLength;

    public Squad(boolean allowBodyCollision, boolean sharedElimination, boolean sharedHealth, boolean sharedLength) {
        this.allowBodyCollision = allowBodyCollision;
        this.sharedElimination = sharedElimination;
        this.sharedHealth = sharedHealth;
        this.sharedLength = sharedLength;
    }

    public boolean isAllowBodyCollision() {
        return allowBodyCollision;
    }

    public boolean isSharedElimination() {
        return sharedElimination;
    }

    public boolean isSharedHealth() {
        return sharedHealth;
    }

    public boolean isSharedLength() {
        return sharedLength;
    }
}
