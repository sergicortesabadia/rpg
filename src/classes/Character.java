package classes;

public abstract class Character {
    private int id;
    private String name;
    private int hp;
    private boolean isAlive;
    private static int counter = 0;

    public Character(String name, int hp) {
        setName(name);
        setHp(hp);
        this.isAlive = true;
        counter++;
        this.id = counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

}
