package Attacks.SpecialMove;

import ru.ifmo.se.pokemon.*;


public class DreamEater extends SpecialMove {
    public DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        if (def.getCondition() == Status.SLEEP) {
            def.setMod(Stat.HP, (int) Math.round(damage));
        }
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        double cur = p.getHP();
        double base = p.getStat(Stat.HP);
        p.setMod(Stat.HP, (int) (-1 * (base - cur) / 2));
    }

    @Override
    protected String describe() {
        return "использует прием \"Dream Eater\"";
    }
}