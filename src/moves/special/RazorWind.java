package moves.special;

import helper.Helper;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class RazorWind extends SpecialMove {

    public RazorWind() {
        super(Type.NORMAL, 80, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, -((int) (pokemon.getStat(Stat.ATTACK)) / 2));
    }

    @Override
    protected String describe() {
        return Helper.describeMovement(this);
    }

}
