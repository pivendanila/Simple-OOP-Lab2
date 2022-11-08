package Attacks.StatusMove;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Growl extends StatusMove{
    public Growl(double accuracy){
        super(Type.NORMAL, 0, accuracy);
    }


    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }

    @Override
    protected String describe(){
        return "использует прием \"Growl\"";
    }
}
