package pokemons.shaymin;

import moves.physical.Endeavor;
import moves.status.FocusEnergy;
import moves.status.Substitute;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

// https://pokemondb.net/pokedex/Shaymin
public class ShayminLand extends Pokemon {
    public ShayminLand(String name, int level) {
        super(name, level);
        // Stats
        super.setType(Type.GRASS);
        super.setStats(100, 100, 100, 100, 100, 100);
        // Moves
        super.setMove(new FocusEnergy(), new Endeavor(), new Substitute());
    }
}
