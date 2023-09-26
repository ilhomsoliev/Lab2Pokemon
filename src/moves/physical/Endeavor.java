package moves.physical;

import helper.Helper;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

// Done
public class Endeavor extends PhysicalMove {

    public Endeavor() {
        super(Type.NORMAL, 5, 100);
    }

    @Override
    protected String describe() {
        return Helper.describeMovement(this);
    }


}
