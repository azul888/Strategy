/**
 * Represents a monster within a game context, providing
 * attributes like health points (HP), experience points (XP), and an inventory of items.
 *
 * @author Saul Huerta JR
 * @version 1.0
 */
import java.util.HashMap;

public abstract class Monster {
    private Integer hp;
    private Integer xp;
    private Integer maxHP;
    private HashMap<String, Integer> items;
    /**
     * Constructs a new Monster object with the specified maximum HP, XP, and an initial inventory.
     *
     * @param maxHP The maximum health points for this monster.
     * @param xp    The experience points associated with this monster.
     * @param items A HashMap containing the monster's starting items and their quantities.
     */
    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    /**
     * @return The monster's current HP value.
     */
    public Integer getHp() {
        return hp;
    }

    /**
     * Sets the monster's current health points (HP).
     */
    public void setHp(Integer hp) {
        this.hp = hp;
    }

    /**
     * @return The monster's current XP value.
     */
    public Integer getXp() {
        return xp;
    }

    /**
     * Sets the monster's current health points (HP).
     */
    public void setXp(Integer xp) {
        this.xp = xp;
    }

    /**
     * @return The monster's current maxHP value.
     */
    public Integer getMaxHP() {
        return maxHP;
    }

    /**
     * Sets the monster's current health points (HP).
     */
    public void setMaxHP(Integer maxHP) {
        this.maxHP = maxHP;
    }

    /**
     * @return The monster's current items value.
     */
    public HashMap<String, Integer> getItems() {
        return items;
    }

    /**
     * Sets the monster's current items.
     */
    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    /**
     * Provides a string representation of the monster, primarily focusing on its HP status.
     *
     * @return A string in the format "hp= maxHP/hp"
     */
    @Override
    public  String toString(){
        return "hp= " + maxHP + "/" + hp;
    }

}
