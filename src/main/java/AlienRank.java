public enum AlienRank {
    Commander(6),
    Leader(5),
    Engineer(3),
    Medic(2),
    Navigator(1),
    Soldier(0),
    Terrorist(4);
    private int rank;

    AlienRank(int rank) {
        this.rank = rank;
    }
}
