package Attacks.PhysicalMove;

import ru.ifmo.se.pokemon.*;

public class WildCharge extends PhysicalMove {
    public WildCharge() {
        super(Type.ELECTRIC, 90, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon att, double dmg) {
        att.setMod(Stat.HP, (int) (dmg * (1 / 4)));
    }

    @Override
    protected String describe() {
        return "использует прием \"Wild Charge\"";
    }
}