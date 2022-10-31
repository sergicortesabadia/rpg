package classes;

import interfaces.Attacker;

public class Warrior extends Character implements Attacker {
    private int stamina;
    private int strength;

    private final int HEAVY_ATTACK_COST = 5;

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        setStamina(stamina);
        setStrength(strength);
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    public int attack() {
        return stamina > HEAVY_ATTACK_COST ? heavyAttack() : weakAttack();
    }

    public void damage(int damage) {
        if (super.getHp() > damage) super.setHp(getHp()-damage);
        else {
            super.setHp(0);
            super.setIsAlive(false);
        }
    }


    private int heavyAttack() {
        this.stamina -= HEAVY_ATTACK_COST;
        return this.strength;
    }

    private int weakAttack() {
        this.stamina += 1;
        return (int)this.strength/2;
    }

    public String toString() {
        return "Warrior {" +
                "name=" + super.getName() +
                ", HP=" + super.getHp() +
                ", stamina=" + stamina +
                ", strength=" + strength +
                '}';
    }
}
