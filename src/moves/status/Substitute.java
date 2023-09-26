package moves.status;

import helper.Helper;
import ru.ifmo.se.pokemon.*;

public class Substitute extends StatusMove {

    public Substitute() {
        super(Type.NORMAL, 0, 0);
    }
    protected void applySelfEffects(Pokemon p) {
        if (p.getCondition() == Status.SLEEP) {
            p.setMod(Stat.ATTACK, 1);
        }
    }

    @Override
    protected String describe() {
        return Helper.describeMovement(this);
    }

}
