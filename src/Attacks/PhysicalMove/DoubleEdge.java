package Attacks.PhysicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DoubleEdge extends PhysicalMove {
    public DoubleEdge() {
        super(Type.NORMAL, 120, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon att, double dmg) {
        att.setMod(Stat.HP, (int) (dmg * (1 / 3)));
    }


    @Override
    protected String describe() {
        return "использует прием \"Double-Edge\"";
    }
}