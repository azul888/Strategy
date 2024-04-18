/**
 * Represents Kobold class for legally distinct Pocket Monsters
 *
 * @author Saul Huerta JR
 * @version 1.0
 **/
import java.util.HashMap;

public class Kobold extends Monster{
    /**
     * Constructs a Kobold object, calling the superclass (Monster) constructor
     * to initialize the inherited attributes.
     *
     * @param maxHP The maximum health points for this Imp.
     * @param xp    The experience points associated with this Imp.
     * @param items A HashMap containing the Imp's starting items and their quantities.
     */
    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    /**
     * Provides a string representation of the Kobold, augmenting the
     * representation provided by the Monster class.
     *
     * @return A string in the format "Imp has: hp=maxHP/hp"
     */
    @Override
    public String toString(){
        return "Kobold has: " + super.toString();
    }
}
