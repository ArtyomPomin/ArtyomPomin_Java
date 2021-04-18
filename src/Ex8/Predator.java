package Ex8;

public class Predator {
    public static void main(String[] args) {
        Predator lion = new Lion("лев");
        Predator eagle = new Eagle("орёл");
        Predator brownbear = new BrownBear("бурый медведь");
        Predator panda = new Panda("панда");
        Predator[] allPredators = new Predator[] {lion, eagle, brownbear, panda};

        for (Predator predator : allPredators) predator.hunt();
    }

    public void hunt() {
    }
}



