package classes;

import java.util.ArrayList;

public class WarriorFactory extends CharacterFactory {

    private final int MAX_HP =  200;
    private final int MIN_HP = 100;

    private final int MAX_STAMINA = 50;
    private final int MIN_STAMINA = 10;

    private final int MAX_STRENGTH = 10;
    private final int MIN_STRENGTH = 1;

    private int getRandomHp() {
        return RandomUtils.getRandomIntInRange(MAX_HP, MIN_HP);
    }

    private int getRandomStamina() {
        return RandomUtils.getRandomIntInRange(MAX_STAMINA, MIN_STAMINA);
    }

    private int getRandomStrength() {
        return RandomUtils.getRandomIntInRange(MAX_STRENGTH, MIN_STRENGTH);
    }

    public Character createRandom(ArrayList<Character> party) {
        return new Warrior(super.getRandomName(party), this.getRandomHp(), this.getRandomStamina(), this.getRandomStrength());
    }
}