package pokemons.magnemite;

import moves.physical.ShadowPunch;
import moves.special.Aeroblast;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Magnemite extends Pokemon {
    public Magnemite(String name, int level) {
        super(name, level);
        // Stats
        super.setType(Type.BUG, Type.POISON);
        super.setStats(60, 50, 70, 50, 90, 65);
        // Moves
        super.setMove(new Aeroblast(), new ShadowPunch());

    }
}
