package Attacks.StatusMove;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DarkPulse extends StatusMove {
    public DarkPulse(double power, double accuracy) {
        super(Type.DARK, power, accuracy);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (0.2 > Math.random()){
            Effect.flinch(p);
        }

    }

    @Override
    protected String describe() {
        return "использует прием \"Dark Pulse\"";
    }
}