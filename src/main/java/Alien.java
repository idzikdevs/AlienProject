public abstract class Alien {
    protected AlienRank alienRank;
    protected int timeUnits;
    protected int health;
    protected int energy;
    protected int reactions;
    protected int strength;
    protected int bravery;
    protected int firingAccuracy;
    protected int throwingAccuracy;
    protected int psiSkill;
    protected int psiStrength;
    protected int meleeAccuracy;
    protected int armourFront;
    protected int armourLeftRight;
    protected int armourRear;
    protected int armourUnder;
    protected int energyRecovery;
    protected int victoryPoints;
    protected int aggression;
    protected int intelligence;
    protected int heightStanding;
    protected int heightKneeling;

    public AlienRank getAlienRank() {
        return alienRank;
    }

    public void setAlienRank(AlienRank alienRank) {
        this.alienRank = alienRank;
    }
}
