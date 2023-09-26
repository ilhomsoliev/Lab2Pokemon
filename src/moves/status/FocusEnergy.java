package moves.status;

import helper.Helper;
import ru.ifmo.se.pokemon.*;

// Done
public class FocusEnergy extends StatusMove {
    private boolean used = false;

    public FocusEnergy() {
        super(Type.NORMAL, 0.0, 0.0);
    }


    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (!this.used) {
            pokemon.setMod(Stat.ACCURACY, 2);
            this.used = true;
        }
    }

    @Override
    protected String describe() {
        return Helper.describeMovement(this);
    }
}
