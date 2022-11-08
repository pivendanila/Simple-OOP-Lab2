package Attacks.StatusMove;

import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove{
    public WorkUp(){
        this.type = Type.NORMAL;
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, +1);
        p.setMod(Stat.ATTACK, +1);
    }

    @Override
    protected String describe(){
        return "использует прием \"Work Up\"";
    }
}
