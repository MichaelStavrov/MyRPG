public class Character implements Fighter {
    String name;
    int hp;
    int agility;
    int strength;
    int xp = 0;
    int gold = 0;


    public Character(String name, int hp, int agility, int strength, int xp, int gold) {
        this.name = name;
        this.hp = hp;
        this.agility = agility;
        this.strength = strength;
        this.xp = xp;
        this.gold = gold;
    }

    @Override
    public int attack() {
        // критический удар
        if (agility > getRandomValue()) return strength * 2;
        // обычный удар
        if (agility * 3 > getRandomValue()) return strength;
        else return  0;
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

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    private int getRandomValue() {
        return (int) (Math.random() * 100);
    }

    @Override
    public String toString() {
        return String.format("%s здоровье:%d", name, hp);
    }
}
