package Pokemons;
import Attacks.PhysicalMove.DoubleEdge;
import ru.ifmo.se.pokemon.*;

public class Blissey extends Chansey{
    public Blissey(String name, int level){
        super(name, level);

        this.setStats(255, 10, 10, 75, 135, 55);
        this.setType(Type.NORMAL);
        this.addMove(new DoubleEdge(120, 100));



    }
}