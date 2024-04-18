/**
 * Represents Melee Attack for legally distinct Pocket Monsters
 *
 * @author Saul Huerta JR
 * @version 1.0
 **/
public class MeleeAttack implements Attack{

    Monster attacker;
    /**
     * Constructor for Melee Attack class
     * @param attacker The monster that will preform the melee attack. It is used to determine attack power and potential.
     */
    public MeleeAttack(Monster attacker){
        this.attacker = attacker;
    }

    /**
     * attack function that overrides attack from parent.
     * Preforms the melee attack on a target monster.
     * @param nuMonster The monster that is being targeted by the attack.
     * Prints out a message of the attacker and the target
     */
    @Override
    public Integer attack(Monster nuMonster) {
        String message = attacker + " uses a melee attack on " + nuMonster;
        System.out.println(message);
        return null;
    }
}
