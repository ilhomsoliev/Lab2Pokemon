package pokemons.claydol;

import moves.physical.ShadowPunch;
import moves.special.Aeroblast;
import moves.special.RazorWind;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Claydol extends Pokemon {
    public Claydol(String name, int level) {
        super(name, level);
        // Stats
        super.setType(Type.GROUND, Type.PSYCHIC);

        super.setStats(60, 70, 105, 70, 120, 75);

        // Moves
        super.setMove(new Aeroblast(), new ShadowPunch(), new RazorWind());
    }
}
