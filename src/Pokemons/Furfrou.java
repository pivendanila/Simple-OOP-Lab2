package Pokemons;
import Attacks.PhysicalMove.WildCharge;
import Attacks.StatusMove.DarkPulse;
import Attacks.StatusMove.Growl;
import Attacks.StatusMove.WorkUp;
import ru.ifmo.se.pokemon.*;

public class Furfrou extends ExtraPokemon{
    public Furfrou(String name, int level){
        super(name, level);
        this.setStats(75, 80, 60, 65, 90, 102);
        this.setType(Type.NORMAL);
        WorkUp workUp = new WorkUp();
        this.addMove(workUp);
        Growl growl = new Growl();
        this.addMove(growl);
        WildCharge wildCharge = new WildCharge();
        this.addMove(wildCharge);
        DarkPulse darkPulse = new DarkPulse();
        this.addMove(darkPulse);


    }
}
