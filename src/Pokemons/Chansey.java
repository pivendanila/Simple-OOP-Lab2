package Pokemons;
import Attacks.SpecialMove.MudBomb;
import ru.ifmo.se.pokemon.*;

public class Chansey extends Happiny{
    public Chansey(String name, int level){
        super(name, level);

        this.setStats(250 , 5, 5, 35, 105, 50);
        this.setType(Type.NORMAL);
        MudBomb mudBomb = new MudBomb();
        this.addMove(mudBomb);



    }
}