package Attacks.SpecialMove;

import ru.ifmo.se.pokemon.*;

public class MudBomb extends SpecialMove {
    public MudBomb() {
        super(Type.GROUND, 65, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (0.3 > Math.random()) {
            p.setMod(Stat.ACCURACY, -1);
        }
    }

    @Override
    protected String describe() {
        return "использует прием \"Mud Bomb\"";
    }
}