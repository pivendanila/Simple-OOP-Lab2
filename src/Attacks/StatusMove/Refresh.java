package Attacks.StatusMove;

import ru.ifmo.se.pokemon.*;

public class Refresh extends StatusMove {
    public Refresh() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if (p.getCondition() == Status.BURN || p.getCondition() == Status.POISON || p.getCondition() == Status.PARALYZE) {
            Effect e = new Effect();
            e.condition(Status.NORMAL);
            p.addEffect(e);
        }
    }

    @Override
    protected String describe() {
        return "использует прием \"Refresh\"";
    }
}