package Pokemons;
import Attacks.SpecialMove.Swift;
import Attacks.StatusMove.Confide;
import Attacks.StatusMove.ThunderWave;
import ru.ifmo.se.pokemon.*;

public class Staryu extends Pokemon{
    public Staryu(String name, int level){
        super(name, level);
        this.setStats(30, 45, 55, 70, 55, 85);
        this.setType(Type.WATER);
        Confide confide = new Confide();
        this.addMove(confide);
        Swift swift = new Swift();
        this.addMove(swift);
        ThunderWave thunderWave = new ThunderWave();
        this.addMove(thunderWave);


    }
}