/**
 * Represents Attack interface for legally distinct Pocket Monsters
 * The main purpose of this app is to set baseline functions for child classes
 *
 * @author Saul Huerta JR
 * @version 1.0
 **/

public interface Attack extends Ability{
    /**
     * attack function that takes a Monster. The Monster is the target of the attack.
     * @param nuMonster is a monster that will be passed in to be targeted. It is used to determine attack power and potential.
     *
     */
    Integer attack (Monster nuMonster);
}
