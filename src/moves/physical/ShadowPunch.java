package moves.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ShadowPunch extends PhysicalMove {

    public ShadowPunch() {
        super(Type.GHOST, 60, 100);

    }

    @Override
    protected boolean checkAccuracy(Pokemon att,
                                    Pokemon def) {
        return true;
    }

    @Override
    protected String describe() {
        return "делает теневой удар";
    }

}
