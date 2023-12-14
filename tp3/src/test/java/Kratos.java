package test.java;

public class Kratos {

    private String name;
    private String weapon;
    private int health;

    public Kratos(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    public void engageInBattle(String enemy) {
        System.out.println(name + " engages in a battle with " + enemy + " using the " + weapon);
        // Logique du combat, gestion des dégâts, etc.
    }

    public void solvePuzzle(String puzzle) {
        System.out.println(name + " solves the puzzle: " + puzzle);
        // Logique de résolution du puzzle
    }

    public void useGodlyPowers() {
        System.out.println(name + " unleashes his godly powers!");
        // Logique des pouvoirs divins, effets spéciaux, etc.
    }

    public void travelThroughWorld(String destination) {
        System.out.println(name + " travels to " + destination);
        // Logique du voyage, changements de scène, etc.
    }

    // Autres méthodes et getters/setters selon les besoins
}
