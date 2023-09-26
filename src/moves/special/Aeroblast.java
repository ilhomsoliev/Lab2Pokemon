package moves.special;

import helper.Helper;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Aeroblast extends SpecialMove {

    public Aeroblast() {
        super(Type.FLYING, 100, 95);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    @Override
    protected String describe() {
        return Helper.describeMovement(this);
    }
}
