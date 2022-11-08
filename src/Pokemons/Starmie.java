package Pokemons;
import Attacks.SpecialMove.DreamEater;
import ru.ifmo.se.pokemon.*;

public class Starmie extends Staryu{
    public Starmie(String name, int level){
        super(name, level);

        this.setStats(60, 75, 85, 100, 85, 115);
        this.setType(Type.WATER, Type.ELECTRIC);
        DreamEater dreamEater = new DreamEater();
        this.addMove(dreamEater);




    }
}