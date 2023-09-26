package pokemons.frillish;

import moves.physical.Megahorn;
import moves.special.Thunder;
import moves.status.FocusEnergy;
import moves.status.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

// https://pokemondb.net/pokedex/frillish
public class Frillish extends Pokemon {
    public Frillish(String name, int level) {
        super(name, level);

        // Stats
        super.setType(Type.WATER, Type.GHOST);
        super.setStats(55, 40, 50, 65, 85, 40);

        // Moves
        super.setMove(new FocusEnergy(), new Thunder(), new Megahorn(), new ThunderWave());
    }
}
