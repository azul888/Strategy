/**
 * Represents the main entry point for the program
 * the use of monsters and items within a potential game context.
 *
 * @author Saul Huerta JR
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Link to github repo: https://github.com/azul888/Strategy
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<>();
        items.put("gold", 5);
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Imp(15, 20, items));
        monsters.add(new Kobold(1, 5, items));

        for (Monster m: monsters){
            System.out.println(m);
        }

    }
}