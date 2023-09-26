package moves.special;

import helper.Helper;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

// Done
public class Thunder extends SpecialMove {

    public Thunder() {
        super(Type.ELECTRIC, 110, 0.7);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        return Helper.describeMovement(this);
    }
}
