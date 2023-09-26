package pokemons.magneton;

import moves.physical.ShadowPunch;
import moves.special.Aeroblast;
import moves.special.RazorWind;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Magneton extends Pokemon {
    public Magneton(String name, int level) {
        super(name, level);
        // Stats
        super.setType(Type.ELECTRIC, Type.STEEL);
        super.setStats(50, 60, 95, 120, 70, 70);
        // Moves
        super.setMove(new Aeroblast(), new ShadowPunch(), new RazorWind());

    }
}
