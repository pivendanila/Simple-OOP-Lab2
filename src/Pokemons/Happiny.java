package Pokemons;
import Attacks.StatusMove.Refresh;
import Attacks.StatusMove.WorkUp;
import ru.ifmo.se.pokemon.*;

public class Happiny extends Pokemon{
    public Happiny(String name, int level){
        super(name, level);

        this.setStats(100, 5, 5, 15, 65, 30);
        this.setType(Type.NORMAL);
        WorkUp workUp = new WorkUp();
        this.addMove(workUp);
        Refresh refresh = new Refresh();
        this.addMove(refresh);


    }
}