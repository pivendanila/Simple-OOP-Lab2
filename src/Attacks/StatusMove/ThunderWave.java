package Attacks.StatusMove;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    public ThunderWave() {
        super(Type.NORMAL, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect();
        e.condition(Status.PARALYZE);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует прием \"Thunder Wave\"";
    }
}