package nl.hu.bep.setup.webservices.requests;

public class Settings {
    public int foodSpawnChance;
    public int minimumFood;
    public int hazardDamagePerTurn;
    public String hazardMap;
    public String hazardMapAuthor;
    public Royale royale;
    public Squad squad;

    public Settings(int foodSpawnChance, int minimumFood, int hazardDamagePerTurn, String hazardMap, String hazardMapAuthor, Royale royale, Squad squad) {
        this.foodSpawnChance = foodSpawnChance;
        this.minimumFood = minimumFood;
        this.hazardDamagePerTurn = hazardDamagePerTurn;
        this.hazardMap = hazardMap;
        this.hazardMapAuthor = hazardMapAuthor;
        this.royale = royale;
        this.squad = squad;
    }

    public Settings() {
    }

    public int getFoodSpawnChance() {
        return foodSpawnChance;
    }

    public int getMinimumFood() {
        return minimumFood;
    }

    public int getHazardDamagePerTurn() {
        return hazardDamagePerTurn;
    }

    public String getHazardMap() {
        return hazardMap;
    }

    public String getHazardMapAuthor() {
        return hazardMapAuthor;
    }

    public Royale getRoyale() {
        return royale;
    }

    public Squad getSquad() {
        return squad;
    }
}
