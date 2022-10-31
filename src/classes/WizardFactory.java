package classes;

import java.util.ArrayList;

public class WizardFactory extends CharacterFactory {
    private final int MAX_HP =  100;
    private final int MIN_HP = 50;

    private final int MAX_MANA = 50;
    private final int MIN_MANA = 10;

    private final int MAX_INTELLIGENCE = 50;
    private final int MIN_INTELLIGENCE = 1;

    private int getRandomHp() {
        return RandomUtils.getRandomIntInRange(MAX_HP, MIN_HP);
    }

    private int getRandomMana() {
        return RandomUtils.getRandomIntInRange(MAX_MANA, MIN_MANA);
    }

    private int getRandomIntelligence() {
        return RandomUtils.getRandomIntInRange(MAX_INTELLIGENCE, MIN_INTELLIGENCE);
    }

    public Character createRandom(ArrayList<Character> party) {
        return new Wizard(super.getRandomName(party), this.getRandomHp(), this.getRandomMana(), this.getRandomIntelligence());
    }
}
