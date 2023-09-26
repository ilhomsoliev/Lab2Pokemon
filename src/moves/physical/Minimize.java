package moves.physical;

import helper.Helper;
import ru.ifmo.se.pokemon.*;

class Minimize extends PhysicalMove {
    public Minimize() {
        super(Type.NORMAL, 80, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokApplyOpp, double damagePok) {
        Status pokCond = pokApplyOpp.getCondition();
        if (pokCond.equals(Status.FREEZE) || pokCond.equals(Status.POISON) || pokCond.equals(Status.SLEEP)) {
            pokApplyOpp.setMod(Stat.HP, (int) Math.round(damagePok) * 2);
            Effect newEff = new Effect().chance(0.5).turns(3).stat(Stat.ATTACK, -4);
            pokApplyOpp.addEffect(newEff);
        }
    }

    @Override
    protected String describe() {
        return Helper.describeMovement(this);
    }
}
