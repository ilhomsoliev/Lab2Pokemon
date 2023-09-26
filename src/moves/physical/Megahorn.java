package moves.physical;

import helper.Helper;
import ru.ifmo.se.pokemon.*;

// Done
public class Megahorn extends PhysicalMove {

    public Megahorn(){
        super(Type.BUG,120,85);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected String describe() {
        return Helper.describeMovement(this);
    }

}
